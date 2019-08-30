import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
 
    private int score = 0;
    
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(Greenfoot.getRandomNumber(10) - 5);
        move(5);
        int x = getX();
        int y = getY();
        if(x > 600 || y < 0 || y > 400) {
            x = 0;
            y = Greenfoot.getRandomNumber(400);
            setRotation(0);
            setLocation(x, y);
        }
        
        
        //Check If We Hit A Flower
        boolean contactFlower = isTouching(Flower.class);
        //System.out.println(contactFlower);
        if(contactFlower) {
            removeTouching(Flower.class);
            score++;
        }
        
        
        
        
    }    
}
