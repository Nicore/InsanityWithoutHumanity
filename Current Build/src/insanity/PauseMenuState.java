package insanity;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
//import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

import entity.Sounds;

public class PauseMenuState extends BasicGameState
{
	int stateID = -1;
	
	Image title;
	Image resume;
	Image menu;
	Image exit;
	
	float resumeScale = 1;
	float menuScale = 1;
	float exitScale = 1;
	
	float deltaTime;
	float cooldown = 1;
	
	boolean hovered = false;
	Sounds sounds;

	private StateBasedGame mainGame; // We keep a copy of this so that we can access it during key and mouse events

	 /*private GameState underneath = null;
	 private Image underneathImage = null;
	 private int blurCount = 0;*/
	
	private static int optionX = 500;
	private static int optionY = 200;
	
	public PauseMenuState(int stateID) 
	{ 
		this.stateID = stateID;
	}
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// TODO Auto-generated method stub
		sounds = new Sounds("test");
		title = new Image("data/images/menus/paused.png");
		resume = new Image("data/images/menus/resumetext.png");
		menu = new Image("data/images/menus/mainmenutext.png");
		exit = new Image("data/images/menus/exittext.png");
		mainGame = sbg;

	}
	float scaleStep = 0.001f;

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException 
	{
		deltaTime = delta / 1000f;
		if (cooldown > 0) {
			cooldown -= deltaTime;
		}
		Input input = gc.getInput();
		
		int mouseX = input.getMouseX();
		int mouseY = input.getMouseY();
		
		//exit key
		if(input.isKeyDown(Input.KEY_ESCAPE))
		{
			gc.exit();
		}
		
		boolean inResume = false;
		boolean inMenu = false;
		boolean inExit = false;
		// TODO Auto-generated method stub
		if ( (mouseX >= optionX && mouseX <= optionX + resume.getWidth()) &&
				 (mouseY >= optionY && mouseY <= optionY + resume.getHeight()) ) {
				inResume = true;
		} 
		if ((mouseX >= optionX && mouseX <= optionX + menu.getWidth()) &&
				(mouseY >= optionY + 280 && mouseY <= optionY+280+menu.getHeight())){
			inMenu = true;
		}
		if ((mouseX >= optionX && mouseX <= optionX + exit.getWidth()) &&
				(mouseY >= optionY + 420 && mouseY <= optionY+420+menu.getHeight())) {
			inExit = true;
		}
		if (cooldown <= 0) {// cooldown
	
			if(inResume) {
					if(!hovered){
						sounds.menuHover();
					}
				if(resumeScale < 1.05f){
					resumeScale += scaleStep * delta;
				} 
				if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)){
					//play sound
					sounds.menuSelect();
					cooldown = 1;
					resumeScale = 1;
					sbg.enterState(MainGameState.GAMEPLAYSTATE);
				}
			} else {
				hovered = false;
				if(resumeScale > 1.0f){
					resumeScale -= scaleStep * delta;				
				}			
			}
			if(inMenu) {
				if(!hovered){
					sounds.menuHover();
				}
				if(menuScale < 1.05f) {
					menuScale += scaleStep * delta;
				}
				if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
					cooldown = 1;
					menuScale = 1;
					sounds.menuSelect();
					sbg.enterState(MainGameState.MAINMENUSTATE);
				}
			} else {
				hovered = false;
				if(menuScale > 1.0f) {
					menuScale -= scaleStep * delta;
				}
			}
			if(inExit) {
				if(!hovered){
					sounds.menuHover();
				}
				if(exitScale < 1.05f) {
					exitScale += scaleStep * delta;				
				}
				if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
					gc.exit();
				}
			} else {
				hovered = false;
				if(exitScale > 1.0f) {
					exitScale -= scaleStep * delta;
				}
			}
		}
	}
	
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		mainGame.getState(MainGameState.GAMEPLAYSTATE).render(gc, sbg, g);		
		g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.6f));
		//fill some semi transparent screen
		g.fillRect(0, 0, gc.getWidth(), gc.getHeight());
		
		title.draw(1000-title.getWidth(), 20);
		resume.draw(optionX,optionY, resumeScale);
		menu.draw(optionX, optionY+280, menuScale);
		exit.draw(optionX, optionY+420, exitScale);
	}
	
	@Override
	public int getID() 
	{
		return stateID;
	}

}
