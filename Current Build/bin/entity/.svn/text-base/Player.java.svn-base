package entity;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Player extends Entity {
	
	private float currentHealth = 70;
	private float startHealth = 70;
	private Image weaponSprites = new Image("data/images/sprites/basic_weapon.png");
	private Image fullHealth = new Image("data/images/sprites/FullHealth.png");
	private Image emptyHealth = new Image("data/images/sprites/EmptyHealth.png");
	private Image weapon = weaponSprites.getSubImage(0, 0, 32, 64);;
//	private boolean firingPower = false;
	
	public int score = 0;

	public Player(String spriteSheet, float x, float y) throws SlickException 
	{
		super(spriteSheet, x, y);
	}
	
	public void update(GameContainer gc, float deltaTime, int weaponSelection)
	{		
		Input input = gc.getInput();
		
		rotation = (float) Math.atan2((input.getMouseY() - posY),(input.getMouseX() - posX));
	
			super.update(gc, deltaTime);

			if(rotation > 3*Math.PI/8 && rotation < 5*Math.PI/8) {
				weapon = weaponSprites.getSubImage(0, 0, 32, 64);
			}
			if(rotation > Math.PI/8 && rotation < 3*Math.PI/8) {
				weapon = weaponSprites.getSubImage(0, 64, 32, 64);
			}
			if(rotation > -Math.PI/8 && rotation < Math.PI/8) {
				weapon = weaponSprites.getSubImage(0, 128, 32, 64);
			}
			if(rotation > -3*Math.PI/8 && rotation < -Math.PI/8) {
				weapon = weaponSprites.getSubImage(0, 192, 32, 64);
			}
			if(rotation > -5*Math.PI/8 && rotation < -3*Math.PI/8) {
				weapon = weaponSprites.getSubImage(0, 256, 32, 64);
			}
			if(rotation > -7*Math.PI/8 && rotation < -5*Math.PI/8) {
				weapon = weaponSprites.getSubImage(0, 320, 32, 64);
			}
			if(rotation > 7*Math.PI/8 || rotation < -7*Math.PI/8) {
				weapon = weaponSprites.getSubImage(0, 384, 32, 64);
			}
			if(rotation > 5*Math.PI/8 && rotation < 7*Math.PI/8) {
				weapon = weaponSprites.getSubImage(0, 448, 32, 64);
			}
		
		if (gc.getInput().isKeyDown(Input.KEY_W)) {
			sprites.update((long) (deltaTime * 5000));
		}
		else if (gc.getInput().isKeyDown(Input.KEY_A)) {
			sprites.update((long) (deltaTime * 5000));
		}
		else if (gc.getInput().isKeyDown(Input.KEY_S)) {
			sprites.update((long) (deltaTime * 5000));
		}
		else if (gc.getInput().isKeyDown(Input.KEY_D)) {
			sprites.update((long) (deltaTime * 5000));
		}
	}
	
	public void render(GameContainer gc)
	{
		emptyHealth.draw(posX-32, posY-45);
		fullHealth.draw(posX-32, posY-45, (int)(50*(currentHealth/startHealth)), 13);
		super.render();
		weapon.drawCentered(posX, posY);
	}
	
	
	public void changeWeapon(String weaponSheet) throws SlickException
	{
		weaponSprites = new Image(weaponSheet);
	}
	
	public void wasHit()
	{
		isHit = true;
		hitCounterReset();
		--currentHealth;
		if (currentHealth <= 0)
		{
			currentHealth = 0;
			isDead = true;
		}
	}
	
	public float getHealth(){
		return currentHealth;
	}
	
	public void healthPack(){
		if(currentHealth + 15 < startHealth){
			currentHealth += 15;
		} else {
			currentHealth = startHealth;
		}
	}
	
	public void moveX(int direction, float deltaTime)
	{
		if (direction >= 0)
		{
			posX += 250 * deltaTime;
		}
		else
		{
			posX -= 250 * deltaTime;
		}	
	}
	
	public void moveY(int direction, float deltaTime)
	{
		if (direction >= 0)
		{
			posY += 250 * deltaTime;
		}
		else
		{
			posY -= 250 * deltaTime;
		}	
	}
	
	public void setPlayerHealthFull(){
		currentHealth = startHealth;
	}
	
	public int getScore() {
		return score;
	}

	public void addScore(int score) {
		this.score += score;
	}
	
	public float getX()
	{
		return posX;
	}
	
	public float getY()
	{
		return posY;
	}
	
//	public void setFire(boolean x){
//		firingPower = x;
//	}
	
	
}
