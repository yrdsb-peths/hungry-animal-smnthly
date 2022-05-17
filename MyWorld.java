import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score = 0;
    public Label scoreLabel = new Label(score, 80);
    
    // constructor for objects of class MyWorld
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Frog f = new Frog();
        addObject(f, 100,350);
        
        // score label
        addObject(scoreLabel, 50, 50);
        
        spawnApple();
    }
    
    public void spawnApple()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Apple a = new Apple();
        addObject(a, x, y);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("GAME OVER!", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
