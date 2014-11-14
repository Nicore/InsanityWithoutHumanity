package insanity;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class InsanityMap extends TiledMap{
	
	public InsanityMap(String ref, String tileSetsLocation) throws SlickException{
		super(ref, tileSetsLocation);
	}
	
	public int getTileCoordX(float x){
		int mapX = (int)x / 32;
		return mapX;
	}
	
	public int getTileCoordY(float y){
		int mapY = (int)y / 32;
		return mapY;
	}
	public int getPixelCoordX(int x){
		return x * 32;
	}
	
	public int getPixelCoordY(int y){
		return y * 32;
	}
}
