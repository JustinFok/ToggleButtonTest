import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToggleBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToggleBtn extends Actor
{
    /**
     * Act - do whatever the ToggleBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int currentPeriod = 2; //Period is set to 2
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) //If mouse clicks then...
        {
            currentPeriod = 5 - currentPeriod; //Allows toggle between periods
            ((Classroom)getWorld()).prepare(currentPeriod); //Calls the method in the Classroom subclass. 
        }

    }
}    

