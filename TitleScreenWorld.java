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
        Label titleLabel = new Label("HUNGRY FROG", 70);
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        Label toBeginLabel = new Label("press <space> to begin", 30);
        addObject(toBeginLabel, getWidth()/2, 245);
        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("space"))
        {
            InstructionsWorld instructions = new InstructionsWorld();
            Greenfoot.setWorld(instructions);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
