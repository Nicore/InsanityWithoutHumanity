package insanity;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
 
public class MainGameState extends StateBasedGame 
{
 
    public static final int MAINMENUSTATE = 0;
    public static final int MANUALSTATE = 1;
    public static final int GAMEPLAYSTATE = 2;
    public static final int PAUSEMENUSTATE = 3;
    public static final int VICTORYSTATE = 4;
    public static final int DEFEATSTATE = 5;
    public static final int HIGHSCORESTATE = 6;
    
    public static final int SCREENWIDTH = 1024;
    public static final int SCREENHEIGHT = 768;
    public static final boolean FULLSCREEN = false;
 
    public MainGameState()
    {
        super("Insanity Without Humanity!");
 
        this.addState(new MainMenuState(MAINMENUSTATE));
        this.addState(new ManualState(MANUALSTATE));
        this.addState(new GameplayState(GAMEPLAYSTATE));
        this.addState(new PauseMenuState(PAUSEMENUSTATE));
        this.addState(new VictoryState(VICTORYSTATE));
        this.addState(new DefeatState(DEFEATSTATE));
        this.addState(new HighScoreState(HIGHSCORESTATE));
        this.enterState(MAINMENUSTATE);
    }
 
    public static void main(String[] args) throws SlickException
    {
         AppGameContainer app = new AppGameContainer(new MainGameState());
 
         app.setDisplayMode(SCREENWIDTH, SCREENHEIGHT, FULLSCREEN);
         app.setTargetFrameRate(240);
         app.start();
    }
 
    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException 
    {
//        this.getState(MAINMENUSTATE).init(gameContainer, this);
//        this.getState(MANUALSTATE).init(gameContainer, this);
//        this.getState(GAMEPLAYSTATE).init(gameContainer, this);
//        this.getState(PAUSEMENUSTATE).init(gameContainer, this);
//        this.getState(VICTORYSTATE).init(gameContainer, this);
    }
}