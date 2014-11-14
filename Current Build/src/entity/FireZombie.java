package entity;

import insanity.InsanityMap;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class FireZombie extends Enemy{

	private float attackCooldown = 1000f;
	private float shotTime = 1000f;
	private boolean tauntplayed = false;
//	private float playerXX;
//	private float playerYY;
	
	public FireZombie(String imageFile, float x, float y, double multiplier) throws SlickException {
		super(imageFile, x, y);
		health = (int) (14 * multiplier);
	}
	
	public void update(GameContainer gc, float deltaTime, float playerX, float playerY, ArrayList<Enemy> enemies, InsanityMap map,
			ArrayList<Bullet> bullets, Sounds sounds) throws SlickException{
//		playerXX = playerX;
//		playerYY = playerY;
		playerInAggroRange(playerX, playerY, sounds);
		attackCooldown -= deltaTime * 1000;
		if(attacking){
			if(playerInRange(playerX, playerY) && !inAttackRange(playerX, playerY) && shotTime < 0){
				attackPlayer(playerX, playerY, enemies, map, bullets);
			}
			shotTime -= deltaTime * 1000;
			attackPlayer(playerX, playerY, deltaTime, enemies, map);
			// Face player
			rotation = (float) Math.atan2((playerY - posY),(playerX - posX));
			super.update(gc, deltaTime);
			super.update(gc, deltaTime, playerX, playerY);
		}
	}
	public boolean inAttackRange(float playerX, float playerY){
		if((posX >= playerX-33 && posX <= playerX+33) && (posY >= playerY-65 && posY <= playerY+65) && attackCooldown < 0){
			//sprites.drawFlash(posX - 16, posY - 32, 100, 100, Color.green);
			attackCooldown = 1000f;
			return true;
		}
		return false;
	}

	public void attackPlayer(float playerX, float playerY, float deltaTime, ArrayList<Enemy> enemies, InsanityMap map){
		boolean goUp = true;
		boolean goDown = true;
		boolean goLeft = true;
		boolean goRight = true;
		
		float addX = 0;
		float addY = 0;
		if(posX > playerX-33 && posX < playerX+33){
			addY = 65;
		}
		if(posY > playerY-65 && posY < playerY+65){
			addX = 33;
		}
		
		if(posX < playerX-addX){
			if(!Collision.checkEnviroment(this, 3, map, deltaTime)){
				goUp = false;
			}
			for(Enemy e: enemies){
				if(e != this){
					if(Collision.check(this, e, 3) && goUp){
						
					}
					else {
						goUp = false;
					}
				}
			}
			if(goUp){
				posX += 150 * deltaTime;
			}
		}
		if(posY < playerY-addY){
			if(!Collision.checkEnviroment(this, 6, map, deltaTime)){
				goDown = false;
			}
			for(Enemy e: enemies){
				if(e != this){
					if(Collision.check(this, e, 6) && goDown){
						
					}
					else {
						goDown = false;
					}
				}
			}
			if(goDown){
				posY += 150 * deltaTime;
			}
		}
		if(posX > playerX+addX){
			if(!Collision.checkEnviroment(this, 9, map, deltaTime)){
				goLeft = false;
			}
			for(Enemy e: enemies){
				if(e != this){
					if(Collision.check(this, e, 9)&& goLeft){
						
					}
					else {
						goLeft = false;
					}
				}
			}
			if(goLeft){
				posX -= 150 * deltaTime;
			}
		}
		if(posY > playerY+addY){
			if(!Collision.checkEnviroment(this, 12, map, deltaTime)){
				goRight = false;
			}
			for(Enemy e: enemies){
				if(e != this){
					if(Collision.check(this, e, 12)&& goRight){
						
					}
					else {
						goRight = false;
					}
				}
			}
			if(goRight){
				posY -= 150 * deltaTime;
			}
			
		}
	}
	
	public void playerInAggroRange(float playerX, float playerY, Sounds sounds){
		if((playerY < (posY + 150) && playerX < (posX + 150)) && (playerY > (posY-150) && playerX > (posX - 150))){
			if(!tauntplayed){
				sounds.playEnemyTaunt("firezombie");
				tauntplayed = true;
			}
			attacking = true;
		}
	}
	
	public boolean playerInRange(float playerX, float playerY){
		if((playerY < (posY + 300) && playerX < (posX + 300)) && (playerY > (posY-300) && playerX > (posX - 300))){
			attacking = true;
			return true;
		}
		return false;
	}
	
	public void attackPlayer(float playerX, float playerY, ArrayList<Enemy> enemies, InsanityMap map, ArrayList<Bullet> bullets) throws SlickException{
		float projection = (float) Math.atan2((playerY - posY),(playerX - posX));
		bullets.add(new Bullet("data/images/sprites/fire_bullet.png" ,posX, posY, projection, "Enemy"));
		shotTime = 1000f;
	}
	
	@Override
	public void wasHit(Bullet hitBy, Player player) 
	{
		isHit = true;
		hitCounterReset();
		attacking = true;
		// Change to weapon damage when weapons are implemented i.e. bullet.damage;
		if(hitBy instanceof ShredderBullet){
			--health;
		}
		if(!(hitBy instanceof FlameThrower)){
			player.addScore(1);
			--health;
		}
		if (health <= 0)
		{
			isDead = true;
			player.addScore(5);
		}
	}

}
