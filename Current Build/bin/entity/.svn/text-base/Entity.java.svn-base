package entity;


import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Entity 
{
	// Sprite for entity
	protected Animation sprites = null;
	SpriteSheet sheet = null;
	
	// Player direction sprites
	public Animation south = null;
	public Animation southEast = null;
	public Animation east = null;
	public Animation northEast = null;
	public Animation north = null;
	public Animation northWest = null;
	public Animation west = null;
	public Animation southWest = null;
	
	// Entity position
	public float posX = 0.0f;
	public float posY = 0.0f;
	public float rotation = 0.0f;
	
	// Entity attributes
	public boolean isDead = false;
	public boolean isHit = false;
	public float flasher = 0;
	public float hitCounter = 2;

	// Edges of entity
	public float getLeft() { return posX - (sprites.getWidth() / 2.0f); }
	public float getRight() { return posX + (sprites.getWidth() / 2.0f); }
	public float getTop() { return posY - (sprites.getHeight() / 2.0f); }
	public float getBottom() { return posY + (sprites.getHeight() / 2.0f); }

	public Entity(String spriteSheet, float x, float y) throws SlickException
	{
		posX = x;
		posY = y;
	
		Image spritesheet = new Image(spriteSheet);
	
		sheet = new SpriteSheet(spriteSheet, 32, spritesheet.getHeight()/8);

		south = new Animation(false);
		south.setPingPong(true);
		for (int i=0;i<3;i++) {
			south.addFrame(sheet.getSprite(i,0), 250);
		}
		southWest = new Animation(false);
		southWest.setPingPong(true);
		for (int i=0;i<3;i++) {
			southWest.addFrame(sheet.getSprite(i,1), 250);
		}
		west = new Animation(false);
		west.setPingPong(true);
		for (int i=0;i<3;i++) {
			west.addFrame(sheet.getSprite(i,2), 250);
		}
		northWest = new Animation(false);
		northWest.setPingPong(true);
		for (int i=0;i<3;i++) {
			northWest.addFrame(sheet.getSprite(i,3), 250);
		}
		north = new Animation(false);
		north.setPingPong(true);
		for (int i=0;i<3;i++) {
			north.addFrame(sheet.getSprite(i,4), 250);
		}
		northEast = new Animation(false);
		northEast.setPingPong(true);
		for (int i=0;i<3;i++) {
			northEast.addFrame(sheet.getSprite(i,5), 250);
		}
		east = new Animation(false);
		east.setPingPong(true);
		for (int i=0;i<3;i++) {
			east.addFrame(sheet.getSprite(i,6), 250);
		}
		southEast = new Animation(false);
		southEast.setPingPong(true);
		for (int i=0;i<3;i++) {
			southEast.addFrame(sheet.getSprite(i,7), 250);
		}
		
		sprites = south;
	}

	public void update(GameContainer gc, float deltaTime) 
	{
		if(isHit){
			flasher += deltaTime;
			hitCounter -= deltaTime;
		}
		
//		if(hitCounter < 0){
//			isHit = false;
//		}
		
		if(rotation > 3*Math.PI/8 && rotation < 5*Math.PI/8) {
			sprites = south;
		}
		if(rotation > Math.PI/8 && rotation < 3*Math.PI/8) {
			sprites = southWest;
		}
		if(rotation > -Math.PI/8 && rotation < Math.PI/8) {
			sprites = west;
		}
		if(rotation > -3*Math.PI/8 && rotation < -Math.PI/8) {
			sprites = northWest;
		}
		if(rotation > -5*Math.PI/8 && rotation < -3*Math.PI/8) {
			sprites = north;
		}
		if(rotation > -7*Math.PI/8 && rotation < -5*Math.PI/8) {
			sprites = northEast;
		}
		if(rotation > 7*Math.PI/8 || rotation < -7*Math.PI/8) {
			sprites = east;
		}
		if(rotation > 5*Math.PI/8 && rotation < 7*Math.PI/8) {
			sprites = southEast;
		}
	}

	public void render()
	{
		sprites.draw(posX - 16, posY - 32);
		if(isHit){
			if(flasher < 0.06){
				sprites.getCurrentFrame().drawFlash(posX - 16, posY -32, sprites.getCurrentFrame().getWidth(), sprites.getCurrentFrame().getHeight(), new Color(0.5f, 0, 0, 1f));
			}
			if(flasher > 0.12){
				flasher = 0;
				isHit = false;
			}
		}
	}	

	public void hitCounterReset()
	{
		hitCounter = 2;
	}
}


