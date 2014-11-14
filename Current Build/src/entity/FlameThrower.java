package entity;

import java.util.Random;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class FlameThrower extends Bullet{
	
	float expire = 120f;
	

	public FlameThrower(float posX, float posY, float projection) throws SlickException{
		super("data/images/sprites/fire_bullet.png", posX, posY, projection, "Player");
		Random generator = new Random();
		velocityX += generator.nextFloat() - 0.5;
		velocityY += generator.nextFloat() - 0.5;
		expire = (generator.nextFloat()*40) + 120f;
	}
	
	public void update(GameContainer gc, float deltaTime){
		expire -= deltaTime * 1000;
		super.update(gc, deltaTime);
	}
	
	public void render(){
		sprite.drawCentered(posX,posY);
		sprite.setRotation((float)rotation);
	}
	
	public float getExpired(){
		return expire;
	}
}

