import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Item extends Actor
{ 
    protected int points;
    public Item(int points){
        this.points = points;
    }
    public int getPoints(){
        return points;
    }
    public void act()
    {
        // Add your action code here.
    }
}
