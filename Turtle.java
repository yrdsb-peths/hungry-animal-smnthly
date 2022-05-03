import greenfoot.*;

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    String name;
    public Turtle(String name)
    {
        this.name = name;
    }
    
    public void act()
    {
        // action code
        if(Greenfoot.isKeyDown("A"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("D"))
        {
            move(3);
        }
        
        // eat apple
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
        }
    }
}
