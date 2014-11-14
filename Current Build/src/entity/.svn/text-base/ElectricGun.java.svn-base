package entity;

import java.util.Random;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class ElectricGun extends Bullet{

	float expire = 1200f;
	private Enemy enemy = null;
	
	public ElectricGun(String imageFile, float posX, float posY, float projection) throws SlickException{
		super(imageFile, posX, posY, projection, "Player");
		Random generator = new Random();
		velocityX = (float) Math.cos(projection);
		velocityY = (float) Math.sin(projection);
		expire = (generator.nextFloat()*40) + 120f;
	}
	
	@Override
	public void update(GameContainer gc, float deltaTime)
	{
		expire -= deltaTime * 1000;
		// Update our position
        posX += velocityX * deltaTime * 1000;
        posY += velocityY * deltaTime * 1000;
	}
	
	public void updateVelocity(float projection, Enemy enemy){
		velocityX = (float) Math.cos(projection);
		velocityY = (float) Math.sin(projection);
		this.enemy = enemy;
		expire = 1200f;
	}
	
	public Enemy getEnemy(){
		return enemy;
	}
	
	public void update(GameContainer gc, float deltaTime, Enemy enemy)
	{
		expire -= deltaTime * 1000;
		// Update our position
		
		if(enemy.getX() > posX){
			posX += velocityX * deltaTime * 1000;
		}
		if(enemy.getY() > posY){
        posY += velocityY * deltaTime * 1000;
		}
		if(enemy.getY() < posY){
			posY += velocityY * deltaTime * 1000;
		}
		if(enemy.getX() < posX){
			posX += velocityX * deltaTime * 1000;
		}
	}
		
	public void render(){
		sprite.drawCentered(posX,posY);
		sprite.setRotation((float)rotation);
	}
	
	public float getExpired(){
		return expire;
	}

}
