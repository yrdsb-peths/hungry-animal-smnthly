import greenfoot.*;

public class Apple extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // apple falls downwards
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // game over
        MyWorld world = (MyWorld) getWorld();
        if(getY()+10 > world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
