import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsWorld here.
 * 
 * @author Samantha Ly
 * @version May 2022
 */
public class InstructionsWorld extends World
{

    /**
     * Constructor for objects of class InstructionsWorld.
     * 
     */
    public InstructionsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // introduction
        Label introLabel = new Label("you have entered HUNGRY FROG's forest.", 20);
        addObject(introLabel, getWidth()/2, (getHeight()/2)-50);
        Label introLabel2 = new Label("your job is to help him catch falling apples to eat.", 20);
        addObject(introLabel2, getWidth()/2, (getHeight()/2)-25);
        Label introLabel3 = new Label("but beware, the more apples you catch, the faster they fall.", 20);
        addObject(introLabel3, getWidth()/2, getHeight()/2);
        
        // game instructions
        Label toMoveLabel = new Label("to move HUNGRY FROG, press A and D.", 20);
        addObject(toMoveLabel, getWidth()/2, (getHeight()/2)+25);
        
        // to start game
        Label toStartLabel = new Label("are you ready to help HUNGRY FROG? if yes, press <enter>.", 20);
        addObject(toStartLabel, getWidth()/2, (getHeight()/2)+50);
        
        // frog
        Frog frog = new Frog();
        addObject(frog, 100, 300);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("enter"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
