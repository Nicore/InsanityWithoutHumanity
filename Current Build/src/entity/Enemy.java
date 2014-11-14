package entity;



import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class Enemy extends Entity {

	protected int health = 5;
	protected boolean attacking = false;
	private boolean bouncingLightning = false;

	public Enemy(String spriteSheet, float x, float y) throws SlickException 
	{
		super(spriteSheet, x, y);
	}
	
	public void update(GameContainer gc, float deltaTime, float playerX, float playerY){
			// Face player
			if(!(this instanceof Robot)){
				rotation = (float) Math.atan2((playerY - posY),(playerX - posX));
			}
			super.update(gc, deltaTime);
			sprites.update((long) (deltaTime * 2500));
	}
	
	
	public void wasHit(Bullet hitBy, Player player) 
	{
		isHit = true;
		hitCounterReset();
		attacking = true;
		// Change to weapon damage when weapons are implemented i.e. bullet.damage;
		if(hitBy instanceof ShredderBullet){
			--health;
		}
		--health;
		player.addScore(1);
		if (health <= 0)
		{
			isDead = true;
			player.addScore(5);
		}
	}
	
//	public void wasHit(LightningGun hitBy, Player player) 
//	{
//		attacking = true;
//		// Change to weapon damage when weapons are implemented i.e. bullet.damage;
//		--health;
//		player.addScore(1);
//		if (health <= 0)
//		{
//			isDead = true;
//			player.addScore(4);
//		}
//	}
	
	public boolean getDead(){
		return isDead;
	}
	
	public float getX(){
		return posX;
	}
	
	public float getY(){
		return posY;
	}
	
	public boolean getBouncingLightning(){
		return bouncingLightning;
	}
	public void setBouncingLightning(boolean x){
		bouncingLightning = x;
	}
}
