import greenfoot.*;

public class Frog extends Actor
{
    private GreenfootImage[] rightImages;
    private GreenfootImage[] leftImages;
    private SimpleTimer timer;
    private boolean isFacingRight = true;
    
    public Frog()
    {
        rightImages = new GreenfootImage[8];
        leftImages = new GreenfootImage[8];
        for(int i=0; i<rightImages.length; i++)
        {
            rightImages[i] = new GreenfootImage("images/frog_idle/idle" + i + ".png");
            leftImages[i] = new GreenfootImage("images/frog_idle/idle" + i + ".png");
            leftImages[i].mirrorHorizontally();
        }
        setImage(rightImages[0]);
        timer = new SimpleTimer();
        timer.mark();
    }
    
    int curIndex = 0;
    void idle()
    {
        if(timer.millisElapsed()>100)
        {
            if(isFacingRight)
            {
                setImage(rightImages[curIndex]);
            }
            else
            {
                setImage(leftImages[curIndex]);
            }
            curIndex++;
            curIndex %= 8;
            timer.mark();
        }
    }
    
    public void act()
    {
        // action code
        if(Greenfoot.isKeyDown("A"))
        {
            isFacingRight = false;
            move(-4);
        }
        else if(Greenfoot.isKeyDown("D"))
        {
            isFacingRight = true;
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
