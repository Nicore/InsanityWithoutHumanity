package insanity;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class HUD {

	private Image gun = null;
	private Image shredder = null;
	private Image lightning = null;
	private Image flamethrower = null;
	private Image dull = null;
	private Image dark = null;
	
	public void init(){
		try {
			gun = new Image("data/images/sprites/hud_gun.png");
			shredder = new Image("data/images/sprites/hud_shredder.png");
			lightning = new Image("data/images/sprites/hud_lightning.png");
			flamethrower = new Image("data/images/sprites/hud_flamethrower.png");
			dull = new Image("data/images/sprites/hud_dull.png");
			dark = new Image("data/images/sprites/hud_dark.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
	public void render(int weaponSelection, boolean shredder, boolean lightning, boolean flame){
		this.gun.draw(32*19, 0);
		this.shredder.draw(32*20, 0);
		this.lightning.draw(32*21, 0);
		this.flamethrower.draw(32*22, 0);
		if(!shredder){
			dark.draw(32*20, 0);
		}
		if(!lightning){
			dark.draw(32*21, 0);
		}
		if(!flame){
			dark.draw(32*22, 0);
		}
		if(weaponSelection != 0){
			dull.draw(32*19, 0);
		}
		if(weaponSelection != 1 && shredder){
			dull.draw(32*20, 0);
		}
		if(weaponSelection != 2 && lightning){
			dull.draw(32*21, 0);
		}
		if(weaponSelection != 3 && flame){
			dull.draw(32*22, 0);
		}
	}
	
}
