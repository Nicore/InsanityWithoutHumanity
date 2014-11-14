package entity;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Pickup {

	public Image pickup = null;
	public int type;
	public int posX;
	public int posY;
	
	public float getLeft() { return posX - (pickup.getWidth() / 2.0f); }
	public float getRight() { return posX + (pickup.getWidth() / 2.0f); }
	public float getTop() { return posY - (pickup.getHeight() / 2.0f); }
	public float getBottom() { return posY + (pickup.getHeight() / 2.0f); }
	
	public Pickup(int type, int x, int y){
		this.type = type;
		this.posX = x;
		this.posY = y;
		
		try {
			if(type == 0){
				pickup = new Image("data/images/sprites/powerup_heal.png");
			} else if(type == 1){
				pickup = new Image("data/images/sprites/pickup_shred.png");
			} else if(type == 2){
				pickup = new Image("data/images/sprites/pickup_light.png");
			} else if(type == 3){
				pickup = new Image("data/images/sprites/pickup_fire.png");
			}
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
	public void render(){
		pickup.draw(posX, posY);
	}
}
