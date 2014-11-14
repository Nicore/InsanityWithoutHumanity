package insanity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.newdawn.slick.SlickException;

public class MapLoader {

	// Map array
	ArrayList<Room> map = new ArrayList<Room>();
	BufferedReader in;
	
	public MapLoader()
	{
		// Initializes all rooms in the game
		map.add(new Room(0, -1, 1, -1, 4));
		map.add(new Room(1, -1, 2, 0, 5));
		map.add(new Room(2, -1, 3, 1, 6));
		map.add(new Room(3, -1, -1, 2, 7));
		map.add(new Room(4, 0, 5, -1, 8));
		map.add(new Room(5, 1, 6, 4, 9));
		map.add(new Room(6, 2, 7, 5, 10));
		map.add(new Room(7, 3, -1, 6, 11));
		map.add(new Room(8, 4, 9, -1, 12));
		map.add(new Room(9, 5, 10, 8, 13));
		map.add(new Room(10, 6, 11, 9, 14));
		map.add(new Room(11, 7, -1, 10, 15));
		map.add(new Room(12, 8, 13, -1, -1));
		map.add(new Room(13, 9, 14, 12, -1));
		map.add(new Room(14, 10, 15, 13, -1));
		map.add(new Room(15, 11, -1, 14, -1));
		
		Random generator = new Random();
		int random = generator.nextInt(13);

		// Load map file
		try {
			in = new BufferedReader(new FileReader("data/maps/" + random + ".txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Give each room their door properties and their minimap tile location
		int k = 0;
		for (int i = 320; i < 448 ; i += 32)
		{
			for (int j = 448; j < 576; j += 32)
			{
				try {
					map.get(k++).makeRoom(in.readLine(), j, i);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (SlickException e) {
					e.printStackTrace();
				}
			}
		}
		
		for (int i = 0; i < map.size(); i++)
		{
			try {
				map.get(i).setDifficulty(Integer.parseInt(in.readLine()));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
