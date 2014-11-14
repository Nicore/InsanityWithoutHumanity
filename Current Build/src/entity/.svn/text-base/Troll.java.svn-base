package entity;

import insanity.InsanityMap;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Troll extends Enemy{
	
	float shotTime = 2000f;
	private boolean tauntplayed = false;
	
	public Troll(String imageFile, float x, float y, double multiplier) throws SlickException{
		super(imageFile, x, y);
		sheet = new SpriteSheet(imageFile, 32, 48);
		health = (int) (5 * multiplier);
	}
	
	
	public void update(GameContainer gc, float deltaTime, float playerX, float playerY, ArrayList<Enemy> enemies, InsanityMap map,
			ArrayList<Bullet> bullets, Sounds sounds) throws SlickException{
		playerInRange(playerX, playerY, sounds);
		if(attacking){
			moveCloser(playerX, playerY, deltaTime, enemies, map);
			if(shotTime < 0 && playerInRange(playerX, playerY, sounds)){
				attackPlayer(playerX, playerY, enemies, map, bullets, sounds);
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
		
		
		
		if(posX < playerX-200){
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
		/*else */if(posY < playerY-250){
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
		/*else */if(posX > playerX+200){
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
		/*else */if(posY > playerY+250){
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
	
	public void attackPlayer(float playerX, float playerY, ArrayList<Enemy> enemies, InsanityMap map, ArrayList<Bullet> bullets, Sounds sounds) throws SlickException{
		float projection = (float) Math.atan2((playerY - posY),(playerX - posX));
		bullets.add(new Bullet("data/images/sprites/arrow.png" ,posX, posY, projection, "Enemy"));
		sounds.playEnemyAttack("troll");
		shotTime = 1000f;
	}
	
	public boolean playerInRange(float playerX, float playerY, Sounds sounds){
		if((playerY < (posY + 300) && playerX < (posX + 300)) && (playerY > (posY-300) && playerX > (posX - 300))){
			if(!tauntplayed){
				sounds.playEnemyTaunt("troll");
				tauntplayed = true;
			}
			attacking = true;
			return true;
		}
		return false;
	}
}
