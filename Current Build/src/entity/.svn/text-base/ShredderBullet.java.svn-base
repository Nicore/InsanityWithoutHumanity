package entity;

import org.newdawn.slick.SlickException;


public class ShredderBullet extends Bullet{
	
	private Entity firstHit = null;
	private Entity secondHit = null;
	private Entity thirdHit = null;
	private boolean expired = false;
	
	//Sounds
	
	public ShredderBullet(float x, float y, float projection,String shotBy) throws SlickException {
		super("data/images/sprites/shredderbullet.png", x, y, projection, shotBy);

		// TODO Auto-generated constructor stub
	}

	public void iHit(Entity e){
		if(firstHit == null || firstHit == e){
			firstHit = e;
		}
		else if(secondHit == null || secondHit == e){
			secondHit = e;
		}
		else if(thirdHit == null || thirdHit == e){
			thirdHit = e;
		}
		else {
			expired = true;
		}
	}
	
	public boolean getExpired(){
		return expired;
	}
	
	public Entity getHits(int x){
		if(x == 1){
			return firstHit;
		}
		if(x == 2){
			return secondHit;
		}
		if(x == 3){
			return thirdHit;
		}
		else return firstHit;
	}
	
		
}
