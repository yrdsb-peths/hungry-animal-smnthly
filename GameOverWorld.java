import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Label gameOverLabel = new Label("GAME OVER!", 100);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
        
        Label gameOverMessage = new Label("you failed in helping HUNGRY FROG :(", 25);
        addObject(gameOverMessage, getWidth()/2, (getHeight()/2)-50);
        
        Label scoreLabel = new Label("you helped him eat " + MyWorld.score + " apples", 25);
        addObject(scoreLabel, getWidth()/2, (getHeight()/2)+50);
    }
}
