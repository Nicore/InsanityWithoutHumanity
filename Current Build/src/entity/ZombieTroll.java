package entity;

import insanity.InsanityMap;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class ZombieTroll extends Enemy{
	
	private float attackCooldown = 1000f;
	private boolean tauntplayed = false;
//	private float playerXX;
//	private float playerYY;
	
	public ZombieTroll(String imageFile, float x, float y, double multiplier) throws SlickException {
		super(imageFile, x, y);
		health = (int) (12 * multiplier);
	}
	
	public void update(GameContainer gc, float deltaTime, float playerX, float playerY, ArrayList<Enemy> enemies, InsanityMap map, Sounds sounds){
//		playerXX = playerX;
//		playerYY = playerY;
		playerInRange(playerX, playerY, sounds);
		attackCooldown--;
		if(attacking){
			attackPlayer(playerX, playerY, deltaTime, enemies, map);
			// Face player
			rotation = (float) Math.atan2((playerY - posY),(playerX - posX));
			super.update(gc, deltaTime);
			super.update(gc, deltaTime, playerX, playerY);
		}
	}
	public boolean inAttackRange(float playerX, float playerY){
		if((posX >= playerX-37 && posX <= playerX+37) && (posY >= playerY-58 && posY <= playerY+58) && attackCooldown < 0){
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
			addY = 57;
		}
		if(posY > playerY-65 && posY < playerY+65){
			addX = 36;
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
	
	public void playerInRange(float playerX, float playerY, Sounds sounds){
		if((playerY < (posY + 150) && playerX < (posX + 150)) && (playerY > (posY-150) && playerX > (posX - 150))){
			if(!tauntplayed){
				sounds.playEnemyTaunt("zombietroll");
				tauntplayed = true;
			}
			attacking = true;
		}
	}
	
//	public void render(){
//		if(inAttackRange(playerXX, playerYY)){
//			sprites.drawFlash(posX - 16, posY - 32, 32, 64);
//		}
//		else{
//			super.render();
//		}
//	}
}
