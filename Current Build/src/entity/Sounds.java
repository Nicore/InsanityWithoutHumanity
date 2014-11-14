package entity;

import java.util.Random;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;


public class Sounds {
	
	private Sound menuHover = null;
	private Sound menuSelect = null;
	
	private Sound shredderPickup = null;
	private Sound shredderShoot = null;
	private Sound shredderSelect = null;
	
	private Sound flamethrowerPickup = null;
	private Sound flamethrowerShoot = null;
	private Sound flamethrowerSelect = null;
	
	private Sound lightningPickup = null;
	private Sound lightningShoot = null;
	private Sound lightningSelect = null;
	
	private Sound normalPickup = null;
	private Sound normalShoot = null;
	
	private Sound healthPickup = null;
	
	private Sound trollArrow = null;
	
	private Sound robotPre = null;
	private Sound robotLaser = null;
	
	private Sound robotTaunt_1 = null;
	private Sound robotTaunt_2 = null;
	private Sound robotTaunt_3 = null;
	private Sound robotTaunt_4 = null;
	private Sound robotTaunt_5 = null;
	
	private Sound trollTaunt = null;
	
	private Sound zombieTaunt_1 = null;
	private Sound zombieTaunt_2 = null;
	private Sound zombieTaunt_3 = null;
	private Sound zombieTaunt_4 = null;
	private Sound zombieTaunt_5 = null;
	private Sound zombieTaunt_6 = null;
	
	private Sound firezombieTaunt_1 = null;
	private Sound firezombieTaunt_2 = null;
	
	private Sound vampireTaunt_1 = null;
	private Sound vampireTaunt_2 = null;
	private Sound vampireTaunt_3 = null;
	private Sound vampireTaunt_4 = null;
	
	private Sound playMusic = null;
	private Sound defeatMusic = null;
	private Sound menuMusic = null;
	private Sound roomComplete = null;
	private Sound victory = null;
	
	private Sound trollBoss_1 = null;
	private Sound trollBoss_2 = null;
	private Sound trollBoss_3 = null;
	
	boolean gameMusicChange = false;
	
	public Sounds(String s) throws SlickException{
		
		playMusic = new Sound("data/sounds/Test.wav");
		defeatMusic = new Sound("data/sounds/deathmusic.wav");
		menuMusic = new Sound("data/sounds/menu_music.wav");
		roomComplete = new Sound("data/sounds/room_finished.wav");
		victory = new Sound("data/sounds/Test2.wav");
		
		trollBoss_1 = new Sound("data/sounds/tollboss_hah.wav");
		trollBoss_2 = new Sound("data/sounds/trollboss_inv.wav");
		trollBoss_3 = new Sound("data/sounds/trollboss_over.wav");

		
		menuHover = new Sound("data/sounds/normal_shoot.wav");
		menuSelect = new Sound("data/sounds/pickup.wav");
		
		shredderPickup = new Sound("data/sounds/shredder_pickup.wav");
		shredderShoot = new Sound("data/sounds/shredder_shoot.wav");
		shredderSelect = new Sound("data/sounds/player_sweetgun.wav");
		
		flamethrowerShoot = new Sound("data/sounds/flamethrower_shoot.wav");
		flamethrowerPickup = new Sound("data/sounds/flamethrower_pickup.wav");
		flamethrowerSelect = new Sound("data/sounds/flame_on.wav");
		
		lightningPickup = new Sound("data/sounds/lightning_pickup.wav");
		lightningShoot = new Sound("data/sounds/lightning_shoot.wav");
		lightningSelect = new Sound("data/sounds/player_ironman.wav");
		
		normalPickup = new Sound("data/sounds/normal_pickup.wav");
		normalShoot = new Sound("data/sounds/normal_shoot.wav");
		
		healthPickup = new Sound("data/sounds/pickup.wav");
		
		trollArrow = new Sound("data/sounds/trollarrow.wav");
		
		robotPre = new Sound("data/sounds/robot_prelaser.wav");
		robotLaser = new Sound("data/sounds/robot_laser.wav");
		
		robotTaunt_1 = new Sound("data/sounds/robot_beback.wav");
		robotTaunt_2 = new Sound("data/sounds/robot_communication.wav");
		robotTaunt_3 = new Sound("data/sounds/robot_marvin.wav");
		robotTaunt_4 = new Sound("data/sounds/robot_warning.wav");
		robotTaunt_5 = new Sound("data/sounds/robot_transform.wav");
		
		trollTaunt = new Sound("data/sounds/troll_trolled.wav");
		
		zombieTaunt_1 = new Sound("data/sounds/zombie_brain2.wav");
		zombieTaunt_2 = new Sound("data/sounds/zombie_brains1.wav");
		zombieTaunt_3 = new Sound("data/sounds/zombie_life.wav");
		zombieTaunt_4 = new Sound("data/sounds/zombie_nomnom.wav");
		zombieTaunt_5 = new Sound("data/sounds/zombie_rawr.wav");
		zombieTaunt_6 = new Sound("data/sounds/zombie_ugh.wav");
		
		firezombieTaunt_1 = new Sound("data/sounds/zombie_flame.wav");
		firezombieTaunt_2 = new Sound("data/sounds/zombie_flame2.wav");
		
		vampireTaunt_1 = new Sound("data/sounds/vampire_blood.wav");
		vampireTaunt_2 = new Sound("data/sounds/vampire_count.wav");
		vampireTaunt_3 = new Sound("data/sounds/vampire_donate.wav");
		vampireTaunt_4 = new Sound("data/sounds/vampire_lamb.wav");
	}
	
	public void playMusic(String music){
		if(music == "playing"){
			playMusic.loop();
		}
		if(music == "defeat"){
			defeatMusic.loop();
		}
		if(music == "menu"){
			menuMusic.loop();
		}
		if(music == "victory"){
			victory.loop();
		}
	}
	
	public void stopMusic(){
		playMusic.stop();
		defeatMusic.stop();
		menuMusic.stop();
		victory.stop();
	}
	
	public void menuHover(){
		if(!menuHover.playing()){
			menuHover.play();
		}
	}
	
	public void menuSelect(){
		if(!menuSelect.playing()){
			menuSelect.play();
		}
	}
	
	//Play pickup and play select are the opposite, pickup plays select sound, selcet plays pickup
	public void playPickUp(String weapon) throws SlickException{
		if(weapon == "shredder"){
			shredderPickup.play();
		}
		if(weapon == "flamethrower"){
			flamethrowerPickup.play();
		}
		if(weapon == "lightning"){
			lightningPickup.play();
		}
		if(weapon == "normal"){
			normalPickup.play();
		}
	}
	
	public void playBoss(int phase){
		if(phase == 1){
			trollBoss_1.play();
		}
		if(phase == 2){
			trollBoss_2.play();
		}
		if(phase == 3){
			trollBoss_3.play();
		}
	}
	
	public void playSelect(String weapon) throws SlickException {
		if(weapon == "shredder"){
			shredderSelect.play();
		}
		if(weapon == "flamethrower"){
			flamethrowerSelect.play();
		}
		if(weapon == "pickup"){
			healthPickup.play();
		}
		if(weapon == "lightning"){
			lightningSelect.play();
		}
		if(weapon == "complete"){
			roomComplete.play();
		}
	}
	
	
	public void playShoot(String weapon){
		if(weapon == "shredder"){
			shredderShoot.play();
		}
		if(weapon == "flamethrower"){
			if(!flamethrowerShoot.playing()){
				flamethrowerShoot.play();
			}
		}
		if(weapon == "lightning"){
			if(!lightningShoot.playing()){
				lightningShoot.play();
			}
		}
		if(weapon == "normal"){
				normalShoot.play();
		}
	}

	public void stopWeapons(){
		normalPickup.stop();
		shredderShoot.stop();
		shredderPickup.stop();
		flamethrowerPickup.stop();
		flamethrowerShoot.stop();
		lightningShoot.stop();
		//lightningPickup.stop();
	}
	
	public void stopLightning(){
		lightningShoot.stop();
	}
	
	public void playEnemyAttack(String enemy){
		if(enemy == "troll" && !trollArrow.playing()){
			trollArrow.play();
		}
		if(enemy == "robotpre" && !robotPre.playing()){
			robotPre.play();
		}
		if(enemy == "robotlaser" && !robotLaser.playing()){
			robotLaser.play();
		}
	}
	
	public void playEnemyTaunt(String enemy){
		Random generator = new Random();
		if(enemy == "troll"){
			trollTaunt.play();
		}
		
		if(enemy == "robot"){
			int ran = generator.nextInt(5);
			if(ran == 0 && !robotTaunt_1.playing()){
				robotTaunt_1.play(1, 9);
			}
			else if(ran == 1 && !robotTaunt_2.playing()){
				robotTaunt_2.play(1, 9);
			}
			else if(ran == 2 && !robotTaunt_3.playing()){
				robotTaunt_3.play(1, 9);
			}
			else if(ran == 3 && !robotTaunt_4.playing()){
				robotTaunt_4.play(1, 9);
			}
			else if(ran == 4 && !robotTaunt_5.playing()){
				robotTaunt_5.play(1, 9);
			}
			
		}
		
		if(enemy == "zombie"){
			int ran = generator.nextInt(6);
			if(ran == 0){
				zombieTaunt_1.play(1, 5);
			}
			else if(ran == 1){
				zombieTaunt_2.play(1, 5);
			}
			else if(ran == 2){
				zombieTaunt_3.play(1, 5);
			}
			else if(ran == 3){
				zombieTaunt_4.play(1, 5);
			}
			else if(ran == 4){
				zombieTaunt_5.play(1, 5);
			}
			else if(ran == 5){
				zombieTaunt_6.play(1, 5);
			}
		}
		
		if(enemy == "zombietroll"){
			int ran = generator.nextInt(5);
			if(ran == 0){
				zombieTaunt_1.play(1, 5);
			}
			else if(ran == 1){
				zombieTaunt_2.play(1, 5);
			}
			else if(ran == 2){
				zombieTaunt_3.play(1, 5);
			}
			else if(ran == 3){
				zombieTaunt_4.play(1, 5);
			}
			else if(ran == 4){
				zombieTaunt_5.play(1, 5);
			}
		}
		
		if(enemy == "firezombie"){
			int ran = generator.nextInt(5);
			if(ran == 0){
				firezombieTaunt_2.play(1, 5);
			}
			else if(ran == 1){
				firezombieTaunt_1.play(1, 5);
			}
			else if(ran == 2){
				zombieTaunt_3.play(1, 5);
			}
			else if(ran == 3){
				zombieTaunt_4.play(1, 5);
			}
			else if(ran == 4){
				zombieTaunt_5.play(1, 5);
			}
		}
		
		if(enemy == "vampire"){
			int ran = generator.nextInt(5);
			if(ran == 0){
				vampireTaunt_1.play(1, 5);
			}
			else if(ran == 1){
				vampireTaunt_2.play(1, 5);
			}
			else if(ran == 2){
				vampireTaunt_3.play(1, 5);
			}
			else if(ran == 3){
				vampireTaunt_4.play(1, 5);
			}
		}
	}
	

}
