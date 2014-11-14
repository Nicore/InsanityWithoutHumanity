package entity;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class LightningGun{
	// Sprite for entity
	public Image sprite = null;
	public boolean pLaser = false;
	
	//Who the bullet was shot by
	Entity shotBy = null;
	
	// Entity position
	public float posX = 0.0f;
	public float posY = 0.0f;
	public double rotation = 90;
	public float laserPosX = 0.0f;
	public float laserPosY = 0.0f;
	public float collisionX = 0.0f;
	public float collisionY = 0.0f;
	public float projection;
	public float damageTimer = 1000f;
	public boolean hit = false;
	
	// How fast and in which direction we're moving
	private float velocityX = 0;
	private float velocityY = 0;
	
	// Edges of entity
	public float getLeft() { return posX; }
	public float getRight() { return laserPosX; }
	public float getTop() { return collisionX; }
	public float getBottom() { return laserPosY; }
	
	public float getEdgeX() {return collisionX;}
	public float getEdgeY() {return collisionY;}
	public float getPosX() {return posX;}
	public float getPosY() {return posY;}
	public double getProjection () {return (double)projection;}
	public boolean getPreLaser() {return pLaser;}
	public float getDamageTimer() {return damageTimer;}
	

	
	public LightningGun(float x, float y, float projection, Entity shotBy) throws SlickException {
		
		// TODO Auto-generated constructor stub
		posX = x;
		posY = y;

		this.shotBy = shotBy;
		this.projection = projection;
		sprite = new Image("data/images/sprites/Lightning.png");
		
		if(projection >= 0){
			rotation = Math.toDegrees(projection);
		} else {
			rotation = 180 + (180 - Math.toDegrees(Math.abs(projection)));
		}

		velocityX = 2.0f;
		velocityY = 2.0f;
	}
	
	public void update(GameContainer gc, float deltaTime)
	{
		// Update our position

		if(damageTimer >= 0){
			damageTimer -= deltaTime *1000;
		}
		else {
			damageTimer = 10000f;
		}
		 if(!hit && laserPosX < 230){
			 laserPosX += velocityX * deltaTime * 1000;
        //laserPosY += velocityY * deltaTime * 1000;
        
		//x=r * cos(t)+j
		//y=r * sin(t) +k
       
			 collisionX = laserPosX * (float) Math.cos(rotation) + posX;
			 collisionY = laserPosX * (float) Math.sin(rotation) + posY;
        }
	}
	
	public void update(GameContainer gc, float deltaTime, float x, float y)
	{
		// Update our position
		posX = x;
		posY = y;
		
		if(damageTimer >= 0){
			damageTimer -= deltaTime *1000;
		}
		else {
			damageTimer = 10000f;
		}
		 if(!hit && laserPosX < 230){
			 laserPosX += velocityX * deltaTime * 1000;
        //laserPosY += velocityY * deltaTime * 1000;
        
		//x=r * cos(t)+j
		//y=r * sin(t) +k
       
			 collisionX = laserPosX * (float) Math.cos(rotation) + posX;
			 collisionY = laserPosX * (float) Math.sin(rotation) + posY;
        }
	}
	
	public void render()
	{
		//System.out.println(laserPosX);
			pLaser = false;
			sprite.setRotation((float)rotation);
			if(projection > 3*Math.PI/8 && projection < 5*Math.PI/8) {
				sprite.draw(posX-18, posY, (int)laserPosX, 10);
				// south
			}
			if(projection > Math.PI/8 && projection < 3*Math.PI/8) {
				sprite.draw(posX-8, posY-8, (int)laserPosX, 10);
				// south east
			}
			if(projection > -Math.PI/8 && projection < Math.PI/8) {
				sprite.draw(posX, posY-8, (int)laserPosX, 10);
				// east
			}
			if(projection > -3*Math.PI/8 && projection < -Math.PI/8) {
				sprite.draw(posX+4, posY-8, (int)laserPosX, 10);
				// north east
			}
			if(projection > -5*Math.PI/8 && projection < -3*Math.PI/8) {
				sprite.draw(posX-6, posY-32, (int)laserPosX, 10);
				// north
			}
			if(projection > -7*Math.PI/8 && projection < -5*Math.PI/8) {
				sprite.draw(posX-4, posY-8, (int)laserPosX, 10);
				// north west
			}
			if(projection > 7*Math.PI/8 || projection < -7*Math.PI/8) {
				sprite.draw(posX-16, posY-16, (int)laserPosX, 10);
				// west
			}
			if(projection > 5*Math.PI/8 && projection < 7*Math.PI/8) {
				sprite.draw(posX-24, posY, (int)laserPosX, 10);
				// south west
			}
	}
	
	public Entity getShotBy(){
		return shotBy;
	}
	
	public float getX()
	{
		return posX;
	}
	public void setX(float x, float y){
		laserPosX = (float)Math.sqrt(Math.pow((x - posX), 2)+(Math.pow((y - posY), 2)));
		hit = true;
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
