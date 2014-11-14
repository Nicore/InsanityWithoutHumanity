package entity;

import insanity.InsanityMap;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class Robot extends Enemy {
	
	float shotTime = 4000f;
	Laser lastLaser=null;
	boolean shooting = false;
	float projection;
	private boolean tauntplayed = false;
	
	public Robot(String spriteSheet, float x, float y, double multiplier) throws SlickException {
		super(spriteSheet, x, y);
		health = (int) (12 * multiplier);
	}

	public void update(GameContainer gc, float deltaTime, float playerX, float playerY, ArrayList<Enemy> enemies, InsanityMap map,
			ArrayList<Laser> bullets, Sounds sounds) throws SlickException{
		playerInRange(playerX, playerY, sounds);
		if(attacking){
			if(!shooting){
			projection = (float) Math.atan2((playerY - posY),(playerX - posX));
			rotation = (float) Math.atan2((playerY - posY),(playerX - posX));
				super.update(gc, deltaTime, playerX, playerY);
			moveCloser(playerX, playerY, deltaTime, enemies, map);
			}
			if(shotTime < 2000f && shotTime > 0){
				bullets.remove(lastLaser);
				shooting = false;
				
			}
			if(shotTime < 0 && playerInRange(playerX, playerY, sounds)){	
				attackPlayer(playerX, playerY, enemies, map, bullets);
			}
			shotTime -= deltaTime*1000;
			super.update(gc, deltaTime, playerX, playerY);
		}
		
	}
	public void moveCloser(float playerX, float playerY, float deltaTime, ArrayList<Enemy> enemies, InsanityMap map){
		boolean goUp = true;
		boolean goDown = true;
		boolean goLeft = true;
		boolean goRight = true;
		
		
		
		if(posX < playerX-380){
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
				posX += 250 * deltaTime;
			}
		}
		/*else */if(posY < playerY-380){
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
				posY += 250 * deltaTime;
			}
		}
		/*else */if(posX > playerX+380){
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
				posX -= 250 * deltaTime;
			}
		}
		/*else */if(posY > playerY+380){
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
				posY -= 250 * deltaTime;
			}
			
		}
	}
	
	public void attackPlayer(float playerX, float playerY, ArrayList<Enemy> enemies, InsanityMap map, ArrayList<Laser> bullets) throws SlickException{
		bullets.add(lastLaser = new Laser("data/images/sprites/LaserBeam.png" ,posX, posY, projection, "Enemy", playerX, playerY));
		shotTime = 4000f;
		shooting = true;
	}
	
	public boolean playerInRange(float playerX, float playerY, Sounds sounds){
		if((playerY < (posY + 400) && playerX < (posX + 400)) && (playerY > (posY-400) && playerX > (posX - 400))){
			if(!tauntplayed){
				sounds.playEnemyTaunt("robot");
				tauntplayed = true;
			}
			attacking = true;
			return true;
		}
		return false;
	}
	
	public void wasHit(Bullet hitBy, Player player, ArrayList<Laser> lasers) 
	{
		isHit = true;
		hitCounterReset();
		attacking = true;
		// Change to weapon damage when weapons are implemented i.e. bullet.damage;
		if(hitBy instanceof ShredderBullet){
			--health;
		}
		--health;
		player.addScore(1);
		if (health <= 0)
		{
			lasers.remove(lastLaser);
			isDead = true;
			player.addScore(5);
		}
	}
	public void wasHit(LightningGun hitBy, Player player, ArrayList<Laser> lasers) 
	{
		isHit = true;
		hitCounterReset();
		attacking = true;
		// Change to weapon damage when weapons are implemented i.e. bullet.damage;
		--health;
		player.addScore(1);
		if (health <= 0)
		{
			lasers.remove(lastLaser);
			isDead = true;
			player.addScore(4);
		}
	}
}
