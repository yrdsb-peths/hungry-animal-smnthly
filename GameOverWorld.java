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
        addObject(gameOverLabel, 300, 200);
        
        Label scoreLabel = new Label("Score: " + MyWorld.score, 50);
        addObject(scoreLabel, 300, 280);
    }
}
