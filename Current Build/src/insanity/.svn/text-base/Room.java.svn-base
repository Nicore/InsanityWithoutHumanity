package insanity;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Room {

	// Map properties
	public int number;
	public int difficulty = 1;
	public boolean doorN = false;
	public int neighbourN = -1;
	public boolean doorE = false;
	public int neighbourE = -1;
	public boolean doorW = false;
	public int neighbourW = -1;
	public boolean doorS = false;
	public int neighbourS = -1;
	public InsanityMap room = null;
	
	// Minimap tile
	public Image sprite = null;
	public Image invisible = null;
	public Image end = null;
	public Image dot = null;
	public float posX = 0.0f;
	public float posY = 0.0f;
	public boolean beenTo = false;
	public boolean respawn = false;
	
	public Room(int number, int north, int east, int west, int south)
	{
		this.number = number;
		this.neighbourN = north;
		this.neighbourE = east;
		this.neighbourW = west;
		this.neighbourS = south;
	}
	
	public void makeRoom(String binRep, int x, int y) throws SlickException
	{
		// Set the tiled room
		if(number == 0){
			this.room = new InsanityMap("data/tilesets/" + binRep + "b.tmx", "data/tilesets");
		} else {
			this.room = new InsanityMap("data/tilesets/" + binRep + ".tmx", "data/tilesets");
		}
		
		// Set minimap tile
		this.sprite = new Image("data/images/minirooms/" + binRep + ".png");
		this.invisible = new Image("data/images/minirooms/00000.png");
		this.end = new Image("data/images/minirooms/0000.png");
		this.dot = new Image("data/images/minirooms/dot.png");
		this.posX = x;
		this.posY = y;
		
		// Set room doors
		int bin = 10000;
		bin += Integer.parseInt(binRep);
		bin -= 10000;
		if(bin >= 1000) {
			doorN = true;
			bin -= 1000;
		}
		if(bin >= 100) {
			doorE = true;
			bin -= 100;
		}
		if(bin >= 10) {
			doorS = true;
			bin -= 10;
		}
		if(bin >= 1) {
			doorW = true;
			bin -= 1;
		}
	}
	
	public void render(int currentLocation)
    {
		// Renders correct tile - minimap
		if(beenTo || number == 15){
			sprite.draw(posX, posY);
		} else if(number == 0){
			end.draw(posX, posY);
		} else {
			invisible.draw(posX, posY);
		}
   		if(currentLocation == number){
   			dot.draw(posX+8f, posY+8f);
   		}
    }
	
	public void setDifficulty(int difficulty)
	{
		this.difficulty = difficulty;
	}
	
	public String toString()
	{
		int bin = 0000;
		if(doorN)
		{
			bin += 1000;
		}
		if(doorE)
		{
			bin += 100;
		}
		if(doorW)
		{
			bin += 10;
		}
		if(doorS)
		{
			bin += 1;
		}
		return String.format("%04d", bin);
	}
}