package insanity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;

public final class Highscores {

	public String submitScore(String player, int score){
		try {
		    // Construct data
		    String data = URLEncoder.encode("player", "UTF-8") + "=" + URLEncoder.encode(player, "UTF-8");
		    data += "&" + URLEncoder.encode("score", "UTF-8") + "=" + URLEncoder.encode(Integer.toString(score), "UTF-8");
		    data += "&" + URLEncoder.encode("version", "UTF-8") + "=" + URLEncoder.encode("1.0", "UTF-8");
		    
		    // Send data
		    URL url = new URL("http://insanitywithouthumanity.appspot.com/submithighscore");
		    URLConnection conn = url.openConnection();
		    conn.setDoOutput(true);
		    OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
		    writer.write(data);
		    writer.flush();
		    
		    // Get the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                return line;
            }
            writer.close();
            reader.close();
            
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Couldn't connect to server";
	}
	
	public ArrayList<HighScore> getScores(){
		try{
			// Create collection
			ArrayList<HighScore> highscores = new ArrayList<HighScore>();
			HighScore highscore = new HighScore();
			int key = 1;
			
			// Send data
			URL url = new URL("http://insanitywithouthumanity.appspot.com/gethighscores");
			URLConnection conn = url.openConnection();
			conn.setDoOutput(false);
			
			// Get the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                highscore.setKey(key++);
                highscore.setPlayer(line);
                highscore.setScore(Integer.parseInt(reader.readLine()));
                line = reader.readLine();
                highscores.add(highscore);
                highscore = new HighScore();
            }
            reader.close();
            
            return highscores;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
