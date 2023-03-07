import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Actor
{
    private int direction = 1;
    private static final int MOVEMENT_DELAY = 200;
    private int movement_cont = 100;
    
    public Ghost(){
        setImage("images/fantasma.png");
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    public void act()
    {
        move();
    }
    private void move(){
        if(movement_cont > MOVEMENT_DELAY){
            direction *= -1;
            movement_cont=0;
        }
        setLocation(getX() + direction*2 , getY());
        movement_cont++;
    }
}
