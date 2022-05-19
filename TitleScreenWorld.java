import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreenWorld.
 * 
 * @author Samantha Ly
 * @version May 2022
 */
public class TitleScreenWorld extends World
{

    /**
     * Constructor for objects of class TitleScreenWorld.
     * 
     */
    public TitleScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleLabel = new Label("Hungry Frog", 70);
        addObject(titleLabel,300, 200);
        Label instructionLabel = new Label("Press <space> to begin", 50);
        addObject(instructionLabel, 300, 270);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
