package entity;

import insanity.InsanityMap;


//Direction means the way that the entity wants to go
// 12 = Up, 6 = Down, 3 = Right, 9 = Left. - Like a clock
public class Collision {
	
	
	public static boolean checkEnviroment(Entity e, int direction, InsanityMap map, float deltaTime){
		String impassable = null;
//		boolean goUp = true;
//		boolean goDown = true;
		
		if(direction == 12){
			int tileId = map.getTileId(map.getTileCoordX(e.posX), map.getTileCoordY(e.posY-(e.sprites.getHeight()/2)-250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.sprites.getWidth()/2)+1), map.getTileCoordY(e.posY-(e.sprites.getHeight()/2)-250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.sprites.getWidth()/2)-1), map.getTileCoordY(e.posY-(e.sprites.getHeight()/2)-250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
		}
		if(direction == 6){
			int tileId = map.getTileId(map.getTileCoordX(e.posX), map.getTileCoordY(e.posY+(e.sprites.getHeight()/2)+250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.sprites.getWidth()/2)+1), map.getTileCoordY(e.posY+(e.sprites.getHeight()/2)+250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.sprites.getWidth()/2)-1), map.getTileCoordY(e.posY+(e.sprites.getHeight()/2)+250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
		}
		if(direction == 3){
			int tileId = map.getTileId(map.getTileCoordX(e.posX+(e.sprites.getWidth()/2)+250*deltaTime), map.getTileCoordY(e.posY), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.sprites.getWidth()/2)+250*deltaTime), map.getTileCoordY(e.posY-(e.sprites.getHeight()/2)+1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.sprites.getWidth()/2)+250*deltaTime), map.getTileCoordY(e.posY+(e.sprites.getHeight()/2)-1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			
		}
		if(direction == 9){
			int tileId = map.getTileId(map.getTileCoordX(e.posX-(e.sprites.getWidth()/2)-250*deltaTime), map.getTileCoordY(e.posY), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.sprites.getWidth()/2)-250*deltaTime), map.getTileCoordY(e.posY-(e.sprites.getHeight()/2)+1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.sprites.getWidth()/2)-250*deltaTime), map.getTileCoordY(e.posY+(e.sprites.getHeight()/2)-1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkEnviroment(Bullet e, int direction, InsanityMap map){
		String impassable = null;
//		boolean goUp = true;
//		boolean goDown = true;
		
		if(direction == 12){
			int tileId = map.getTileId(map.getTileCoordX(e.posX), map.getTileCoordY(e.posY-(e.sprite.getHeight()/2)), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.sprite.getWidth()/2)+1), map.getTileCoordY(e.posY-(e.sprite.getHeight()/2)), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.sprite.getWidth()/2)-1), map.getTileCoordY(e.posY-(e.sprite.getHeight()/2)), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
		}
		if(direction == 6){
			int tileId = map.getTileId(map.getTileCoordX(e.posX), map.getTileCoordY(e.posY+(e.sprite.getHeight()/2)), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.sprite.getWidth()/2)+1), map.getTileCoordY(e.posY+(e.sprite.getHeight()/2)), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.sprite.getWidth()/2)-1), map.getTileCoordY(e.posY+(e.sprite.getHeight()/2)), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
		}
		if(direction == 3){
			int tileId = map.getTileId(map.getTileCoordX(e.posX+(e.sprite.getWidth()/2)), map.getTileCoordY(e.posY), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.sprite.getWidth()/2)), map.getTileCoordY(e.posY-(e.sprite.getHeight()/2)+1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.sprite.getWidth()/2)), map.getTileCoordY(e.posY+(e.sprite.getHeight()/2)-1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			
		}
		if(direction == 9){
			int tileId = map.getTileId(map.getTileCoordX(e.posX-(e.sprite.getWidth()/2)), map.getTileCoordY(e.posY), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.sprite.getWidth()/2)), map.getTileCoordY(e.posY-(e.sprite.getHeight()/2)+1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.sprite.getWidth()/2)), map.getTileCoordY(e.posY+(e.sprite.getHeight()/2)-1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkEnviroment(Pickup e, int direction, InsanityMap map, float deltaTime){
		String impassable = null;
//		boolean goUp = true;
//		boolean goDown = true;
		
		if(direction == 12){
			int tileId = map.getTileId(map.getTileCoordX(e.posX), map.getTileCoordY(e.posY-(e.pickup.getHeight()/2)-250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.pickup.getWidth()/2)+1), map.getTileCoordY(e.posY-(e.pickup.getHeight()/2)-250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.pickup.getWidth()/2)-1), map.getTileCoordY(e.posY-(e.pickup.getHeight()/2)-250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
		}
		if(direction == 6){
			int tileId = map.getTileId(map.getTileCoordX(e.posX), map.getTileCoordY(e.posY+(e.pickup.getHeight()/2)+250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.pickup.getWidth()/2)+1), map.getTileCoordY(e.posY+(e.pickup.getHeight()/2)+250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.pickup.getWidth()/2)-1), map.getTileCoordY(e.posY+(e.pickup.getHeight()/2)+250*deltaTime), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
		}
		if(direction == 3){
			int tileId = map.getTileId(map.getTileCoordX(e.posX+(e.pickup.getWidth()/2)+250*deltaTime), map.getTileCoordY(e.posY), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.pickup.getWidth()/2)+250*deltaTime), map.getTileCoordY(e.posY-(e.pickup.getHeight()/2)+1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			
			tileId = map.getTileId(map.getTileCoordX(e.posX+(e.pickup.getWidth()/2)+250*deltaTime), map.getTileCoordY(e.posY+(e.pickup.getHeight()/2)-1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			
		}
		if(direction == 9){
			int tileId = map.getTileId(map.getTileCoordX(e.posX-(e.pickup.getWidth()/2)-250*deltaTime), map.getTileCoordY(e.posY), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.pickup.getWidth()/2)-250*deltaTime), map.getTileCoordY(e.posY-(e.pickup.getHeight()/2)+1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
			tileId = map.getTileId(map.getTileCoordX(e.posX-(e.pickup.getWidth()/2)-250*deltaTime), map.getTileCoordY(e.posY+(e.pickup.getHeight()/2)-1), 0);
			impassable = map.getTileProperty(tileId, "impassable", "false");
			if(impassable != "false"){
				return false;
			}
		}
		return true;
	}
	
	public static boolean check(Entity e1, Enemy e2, int direction, float deltaTime){
		//Going Up
		if(direction == 12){
			//check to see if top of enemy is lower(pixel value) or equal to bottom of player, 
			//but only if player is in the same x range, and enemy bottom is still higher than player bottom.
			if(e1.getTop()-250*deltaTime <= e2.getBottom() && e1.getBottom() > e2.getBottom() && e1.getLeft() <= e2.getRight() && e1.getRight() >= e2.getLeft()){
				return false;
			}
		}
		//Going Down
		if(direction == 6){
			//check to see if bottom of enemy is higher(pixel value) or equal to the top of player,
			//but only if player is in the same x range, and enemy bottom is still lower than player bottom.
			if(e1.getBottom()+250*deltaTime >= e2.getTop() && e1.getTop() < e2.getTop() && e1.getLeft() <= e2.getRight() && e1.getRight() >= e2.getLeft()){

				return false;
			}
		}
		//Going Right
		if(direction == 3){
			//check to see if right of the enemy is higher(pixel value) or equal to the left of the player,
			//but only if player is in the same y range, and enemy right is still lower than player right.
			if(e1.getRight()+250*deltaTime >= e2.getLeft() && e1.getLeft() < e2.getLeft() && e1.getBottom() >= e2.getTop() && e1.getTop() <= e2.getBottom()){
				return false;
			}
		}
		//Going Left
		if(direction == 9){
			//check to see if the left of the enemy is lower(pixel value) or equal to the right of the player,
			//but only if player is in the same y range, and enemy left is still higher than player left.
			if(e1.getLeft()-250*deltaTime <= e2.getRight() && e1.getRight() > e2.getRight() && e1.getBottom() >= e2.getTop() && e1.getTop() <= e2.getBottom()){
				return false;
			}
		}
		return true;
	}
	
	public static boolean check(Enemy e1, Enemy e2, int direction){
		//Going Up
		if(direction == 12){
			//check to see if top of enemy is lower(pixel value) or equal to bottom of player, 
			//but only if player is in the same x range, and enemy bottom is still higher than player bottom.
			if(e1.getTop() <= e2.getBottom() && e1.getBottom() > e2.getBottom() && e1.getLeft() <= e2.getRight() && e1.getRight() >= e2.getLeft()){
				return false;
			}
		}
		//Going Down
		if(direction == 6){
			//check to see if bottom of enemy is higher(pixel value) or equal to the top of player,
			//but only if player is in the same x range, and enemy bottom is still lower than player bottom.
			if(e1.getBottom() >= e2.getTop() && e1.getTop() < e2.getTop() && e1.getLeft() <= e2.getRight() && e1.getRight() >= e2.getLeft()){

				return false;
			}
		}
		//Going Right
		if(direction == 3){
			//check to see if right of the enemy is higher(pixel value) or equal to the left of the player,
			//but only if player is in the same y range, and enemy right is still lower than player right.
			if(e1.getRight() >= e2.getLeft() && e1.getLeft() < e2.getLeft() && e1.getBottom() >= e2.getTop() && e1.getTop() <= e2.getBottom()){
				return false;
			}
		}
		//Going Left
		if(direction == 9){
			//check to see if the left of the enemy is lower(pixel value) or equal to the right of the player,
			//but only if player is in the same y range, and enemy left is still higher than player left.
			if(e1.getLeft() <= e2.getRight() && e1.getRight() > e2.getRight() && e1.getBottom() >= e2.getTop() && e1.getTop() <= e2.getBottom()){
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkDoor(Entity e1, Door e2, int direction){
		//Going Up
		if(direction == 12){
			//check to see if top of enemy is lower(pixel value) or equal to bottom of player, 
			//but only if player is in the same x range, and enemy bottom is still higher than player bottom.
			if(e1.getTop() <= e2.getBottom()){
				return false;
			}
		}
		//Going Down
		if(direction == 6){
			//check to see if bottom of enemy is higher(pixel value) or equal to the top of player,
			//but only if player is in the same x range, and enemy bottom is still lower than player bottom.
			if(e1.getBottom() >= e2.getTop()){
				return false;
			}
		}
		//Going Right
		if(direction == 3){
			//check to see if right of the enemy is higher(pixel value) or equal to the left of the player,
			//but only if player is in the same y range, and enemy right is still lower than player right.
			if(e1.getRight() >= e2.getLeft()){
				return false;
			}
		}
		//Going Left
		if(direction == 9){
			//check to see if the left of the enemy is lower(pixel value) or equal to the right of the player,
			//but only if player is in the same y range, and enemy left is still higher than player left.
			if(e1.getLeft() <= e2.getRight()){
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkBullet(Bullet bullet, Entity enemy){
		// Not the prettiest or best collision check you'll ever see, but it works fairly well
		// for rectangular objects.  I know the ball isn't rectangular - improving that
		// is left as an exercise for the reader.
		
		if (bullet.getLeft() > enemy.getRight() || bullet.getRight() <enemy.getLeft())
		{
			// The objects *don't* overlap horizontally, quit out
			return false;
		}
		
		if (bullet.getTop() > enemy.getBottom() || bullet.getBottom() < enemy.getTop())
		{
			// The objects *don't* overlap vertically, quit out
			return false;
		}
		
		// We have an overlap
		return true;
	}
	
	public static boolean checkBullet(Bullet bullet, Door enemy){
		// Not the prettiest or best collision check you'll ever see, but it works fairly well
		// for rectangular objects.  I know the ball isn't rectangular - improving that
		// is left as an exercise for the reader.
		
		if (bullet.getLeft() > enemy.getRight() || bullet.getRight() <enemy.getLeft())
		{
			// The objects *don't* overlap horizontally, quit out
			return false;
		}
		
		if (bullet.getTop() > enemy.getBottom() || bullet.getBottom() < enemy.getTop())
		{
			// The objects *don't* overlap vertically, quit out
			return false;
		}
		
		// We have an overlap
		return true;
	}
	public static boolean checkSimple(Entity bullet, Entity enemy){
		// Not the prettiest or best collision check you'll ever see, but it works fairly well
		// for rectangular objects.  I know the ball isn't rectangular - improving that
		// is left as an exercise for the reader.
		
		if (bullet.getLeft() > enemy.getRight() || bullet.getRight() <enemy.getLeft())
		{
			// The objects *don't* overlap horizontally, quit out
			return false;
		}
		
		if (bullet.getTop() > enemy.getBottom() || bullet.getBottom() < enemy.getTop())
		{
			// The objects *don't* overlap vertically, quit out
			return false;
		}
		
		// We have an overlap
		return true;
	}
	
	public static boolean checkPickup(Player player, Pickup pickup){
		// Not the prettiest or best collision check you'll ever see, but it works fairly well
		// for rectangular objects.  I know the ball isn't rectangular - improving that
		// is left as an exercise for the reader.
		
		if (player.getLeft() > pickup.getRight() || player.getRight() <pickup.getLeft())
		{
			// The objects *don't* overlap horizontally, quit out
			return false;
		}
		
		if (player.getTop() > pickup.getBottom() || player.getBottom() < pickup.getTop())
		{
			// The objects *don't* overlap vertically, quit out
			return false;
		}
		
		// We have an overlap
		return true;
	}
	
	public static boolean checkLaser(Laser laser, Player player){
		double H = Math.sqrt(Math.pow((player.getX() - laser.getPosX()), 2)+(Math.pow((player.getY() - laser.getPosY()), 2)));
		float projection = (float) Math.atan2((player.getY() - laser.getPosY()),(player.getX() - laser.getPosX()));
		projection -= laser.getProjection();
		double O = Math.abs(H* Math.sin(Math.abs(projection)));
		if(O < 35 && !laser.getPreLaser() && laser.getDamageTimer() % 40 == 0 && Math.abs(projection) < (Math.PI / 2)){
			return false;
		}
		
		return true;
	}
	
	public static boolean checkLightning(LightningGun l, Enemy enemy){
		double H = Math.sqrt(Math.pow((enemy.getX() - l.getPosX()), 2)+(Math.pow((enemy.getY() - l.getPosY()), 2)));
		float projection = (float) Math.atan2((enemy.getY() - l.getPosY()),(enemy.getX() - l.getPosX()));
		projection -= l.getProjection();
		double O = Math.abs(H* Math.sin((projection)));
		if(O < 40 && !l.getPreLaser() && l.getDamageTimer() < 0 && H <= 230 && Math.abs(projection) < (Math.PI / 2)){
			return false;
		}
		
		return true;
	}
}
