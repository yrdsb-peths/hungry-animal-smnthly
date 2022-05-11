import greenfoot.*;

public class Apple extends Actor
{
    public void act()
    {
        // action code
        int x = getX();
        int y = getY();
        setLocation(x, y + 2);
        
        // game over
        MyWorld world = (MyWorld) getWorld();
        if(getY()+10 > world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
