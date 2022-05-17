import greenfoot.*;

public class Frog extends Actor
{
    GreenfootImage[] images;
    
    public Frog()
    {
        images = new GreenfootImage[8];
        for(int i=0; i<images.length; i++)
        {
            images[i] = new GreenfootImage("images/frog_idle/idle" + i + ".png");
        }
        setImage(images[7]);
    }
    
    int curIndex = 0;
    void idle()
    {
        setImage(images[curIndex]);
        curIndex++;
        curIndex %= 8;
    }
    
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
        
        idle();
        
        // eat apple
        if(isTouching(Apple.class))
        {
            Greenfoot.playSound("sounds/bite sound effect.mp3");
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnApple();
        }
    }
}
