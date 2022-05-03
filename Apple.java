import greenfoot.*;

/**
 * Write a description of class apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    public void act()
    {
        // action code
        int x = getX();
        int y = getY();
        setLocation(x, y + 3);
    }
}
