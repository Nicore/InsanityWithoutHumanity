package insanity;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import entity.Sounds;

public class ManualState extends BasicGameState 
{
	int stateID = -1;
	
	Image background = null;
	Image title = null;
	Image menu = null;
	//Image exit = null;
	Image details = null;
	ArrayList<Image> slides = new ArrayList<Image>();
	Image next = null;
	Image prev = null;

	float menuScale = 0.55f;
	//float exitScale = 1;
	float nextScale = 0.55f;
	float prevScale = 0.55f;
	
	Sounds sounds;
	
	int currSlide = 1;
	
	private static int optionX = 20;
	private static int optionY = 20;
	
	public ManualState(int stateID) 
	{ 
		this.stateID = stateID;
	} 
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// TODO Auto-generated method stub
		title = new Image("data/images/menus/tutorial.png");
		menu = new Image("data/images/menus/mainmenutext.png");
		//exit = new Image("data/images/menus/exittext.png");
		details = new Image("data/images/menus/controldetails.png");
		next = new Image("data/images/menus/nexttext.png");
		prev = new Image("data/images/menus/previoustext.png");
		for(int i = 1; i < 13; i++) {
			slides.add(new Image("data/images/tutorials/newgame"+i+".png"));
		}
		sounds = new Sounds("test");
	}
	
	float scaleStep = 0.001f;
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException 
	{
		Input input = gc.getInput();
		
		int mouseX = input.getMouseX();
		int mouseY = input.getMouseY();
		
		if(input.isKeyDown(Input.KEY_ESCAPE))
		{
			gc.exit();
		}
		
		boolean inMenu = false;
		boolean inNext = false;
		boolean inPrev = false;
		//boolean inExit = false;

		//decide whether the mouse is over an option
		if ( (mouseX >= optionX && mouseX <= optionX + menu.getWidth()* menuScale) &&
				 (mouseY >= optionY/*+420*/ && mouseY <= optionY/*+420*/ + menu.getHeight() * menuScale) ) {
			inMenu = true;
		} 
		//next
		if ( (mouseX >= optionX+870 && mouseX <= optionX+870 + next.getWidth() * nextScale) &&
				 (mouseY >= optionY+630 && mouseY <= optionY+630 + next.getHeight() * nextScale) ) {
			inNext = true;
		} 
		//prev
		if ( (mouseX >= optionX && mouseX <= optionX + prev.getWidth() * prevScale) &&
				 (mouseY >= optionY+630 && mouseY <= optionY+630 + prev.getHeight() * prevScale) ) {
			inPrev = true;
		} 
		/*if (( mouseX >= optionX && mouseX <= optionX + exit.getWidth()) &&
				(mouseY >= optionY+420 && mouseY <= optionY + 420 +exit.getHeight())) {
			inExit = true;
		}*/
		
		//deal with mouseovers and clicks
		if(inMenu) {
			if(menuScale < 0.6f){
				menuScale += scaleStep * delta;
			} 
			if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)){		
				currSlide = 1;
				sounds.menuSelect();
				sbg.enterState(MainGameState.MAINMENUSTATE);
			}
		} else {
			if(menuScale > 0.55f){
				menuScale -= scaleStep * delta;				
			}
			
		}
		
		if(inNext) {
			if(nextScale < 0.6f) {
				nextScale += scaleStep * delta;				
			}
			if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sounds.menuSelect();
				if(currSlide < 12) {
					currSlide++;
				} else if(currSlide == 12){
					currSlide = 1;
				}
			}
		} else {
			if(nextScale > 0.55f) {
				nextScale -= scaleStep * delta;
			}
		}
		
		if(inPrev) {
			if(prevScale < 0.6f) {
				prevScale += scaleStep * delta;				
			}
			if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sounds.menuSelect();
				if(currSlide > 1) {
					currSlide--;
				} else if(currSlide ==1){
					currSlide = 12;
				}
			}
		} else {
			if(prevScale > 0.55f) {
				prevScale -= scaleStep * delta;
			}
		}
	
		/*if(inExit) {
			if(exitScale < 1.05f){
				exitScale += scaleStep * delta;
			} 
			if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)){
				gc.exit();
			}
		} else {
			if(exitScale > 1.0f){
				exitScale -= scaleStep * delta;				
			}
			
		}*/
		if (!inMenu && !inNext && !inPrev/*&& !inExit*/) {
			if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sounds.menuSelect();
				if(currSlide < 12) {
					currSlide++;
				} else if(currSlide == 12){
					currSlide = 1;
				}

			}
			if(input.isMousePressed(Input.MOUSE_RIGHT_BUTTON)) {
				sounds.menuSelect();
				if(currSlide > 1) {
					currSlide--;
				} else if(currSlide ==1){
					currSlide = 12;
				}

			}
		}
		
	}
	
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		// TODO Auto-generated method stub
		//if(currSlide > 0 && currSlide < 13) {
			slides.get(currSlide-1).draw(0,0); //was going 1 over array size >.> forgot the starting at 0 thing...
		//}
		title.draw(1000- title.getWidth(),20);
		menu.draw(optionX, optionY/*+420*/, menuScale);
		next.draw(optionX+870, optionY+630, nextScale);
		prev.draw(optionX, optionY+630,prevScale);
		//menu.draw(20, 20, menuScale);
		//exit.draw(optionX, optionY+420, exitScale);
		//details.draw(20,20);
	}
	
	@Override
	public int getID() 
	{
		return stateID;
	}

}
