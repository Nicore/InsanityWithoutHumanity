package entity;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Bullet {
	
	// Sprite for entity
	public Image sprite = null;
	
	//Who the bullet was shot by
	String shotBy = null;
	String isBoss = null;
	
	// Entity position
	public float posX = 0.0f;
	public float posY = 0.0f;
	public double rotation = 0;

	
	// How fast and in which direction we're moving
	protected float velocityX = 0;
	protected float velocityY = 0;
	
	// Edges of entity
	public float getLeft() { return posX - (sprite.getWidth() / 2.0f); }
	public float getRight() { return posX + (sprite.getWidth() / 2.0f); }
	public float getTop() { return posY - (sprite.getHeight() / 2.0f); }
	public float getBottom() { return posY + (sprite.getHeight() / 2.0f); }
	
	public Bullet(String imageFile, float x, float y, float projection, String shotBy) throws SlickException 
	{
		posX = x;
		posY = y;

		if(shotBy == "Boss"){
			this.shotBy = "Enemy";
			this.isBoss = "Boss";
		}
		else if(shotBy == "BossFire"){
			this.shotBy = "Enemy";
			this.isBoss = "BossFire";
		}
		else {
			this.shotBy = shotBy;
		}
		
		sprite = new Image(imageFile);
		
		if(projection >= 0){
			rotation = Math.toDegrees(projection);
		} else {
			rotation = 180 + (180 - Math.toDegrees(Math.abs(projection)));
		}
		velocityX = (float) Math.cos(projection);
		velocityY = (float) Math.sin(projection);
	}
	
	public void update(GameContainer gc, float deltaTime)
	{
		// Update our position
		if(isBoss == "Boss"){
			posX += velocityX * deltaTime * 100;
			posY += velocityY * deltaTime * 100;
		}
		else if(isBoss == "BossFire"){
			posX += velocityX * deltaTime * 500;
			posY += velocityY * deltaTime * 500;
		}
		else {
			posX += velocityX * deltaTime * 1000;
			posY += velocityY * deltaTime * 1000;
		}
	}
	
	public void render()
	{
		sprite.drawCentered(posX, posY);
		sprite.setRotation((float)rotation);
	}
	
	public String getShotBy(){
		return shotBy;
	}
	
	public float getX()
	{
		return posX;
	}
	
	public float getY()
	{
		return posY;
	}
	
	public int getDirectionY()
	{
		if(velocityY > 0){
			return 12;
		}
		if(velocityY < 0){
			return 6;
		}
		return 0;
	}
	
	public int getDirectionX()
	{
		if(velocityX > 0){
			return 3;
		}
		if(velocityX < 0){
			return 9;
		}
		return 0;
	}
}