package entity;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Door {
	
	public Image sprite = null;
	
	private float posX;
	private float posY;
	private int type;
	
	// Edges of entity
	public float getLeft() { return posX; }
	public float getRight() { return posX + sprite.getWidth(); }
	public float getTop() { return posY; }
	public float getBottom() { return posY + sprite.getHeight(); }

	public Door(String imageFile, float x, float y, int type) throws SlickException {
		posX = x;
		posY = y;
		this.type = type;
		
		sprite = new Image(imageFile);
	}
	
	public void update(GameContainer gc, float deltaTime){
		if(type == 12){
			posY -= 20 * deltaTime;
		}
		else if(type == 6){
			posY += 20 * deltaTime;
		}
		else if(type == 3){
			posX += 20 * deltaTime;
		}
		else if (type == 9){
			posX -= 20 * deltaTime;
		}
	}

	public void render()
	{
		sprite.draw(posX, posY);
	}


}
