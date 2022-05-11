import greenfoot.*;

public class Turtle extends Actor
{
    public void act()
    {
        // action code
        if(Greenfoot.isKeyDown("A"))
        {
            move(-4);
        }
        else if(Greenfoot.isKeyDown("D"))
        {
            move(4);
        }
        
        // eat apple
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnApple();
        }
    }
}
