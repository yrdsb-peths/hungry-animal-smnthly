import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public static int score = 0;
    public Label scoreLabel = new Label(score, 80);
    
    // constructor for objects of class MyWorld
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Frog f = new Frog();
        addObject(f, 100, 300);
        
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
        GameOverWorld world = new GameOverWorld();
        Greenfoot.setWorld(world);
        score = 0; // resets score to 0 when lose (I added this myself)
    }
}
