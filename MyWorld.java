import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Wall(),0,0);
        addObject(new Wall(),600,0);
        addObject(new Wall(),0,400);
        addObject(new Wall(),600,400);
        //bordes verticales
        addObject(new Wall(),0,28);
        addObject(new Wall(),0,56);
        addObject(new Wall(),0,84);
        addObject(new Wall(),0,112);
        addObject(new Wall(),0,130);
        addObject(new Wall(),0,158);
        addObject(new Wall(),0,186);
        //addObject(new Wall(),0,214);
        //addObject(new Wall(),0,242);
        addObject(new Wall(),0,270);
        addObject(new Wall(),0,298);
        addObject(new Wall(),0,326);
        addObject(new Wall(),0,354);
        addObject(new Wall(),0,382);
        addObject(new Wall(),600,28);
        addObject(new Wall(),600,56);
        addObject(new Wall(),600,84);
        addObject(new Wall(),600,112);
        addObject(new Wall(),600,130);
        addObject(new Wall(),600,158);
        addObject(new Wall(),600,186);
        //addObject(new Wall(),600,214);
        //addObject(new Wall(),600,242);
        addObject(new Wall(),600,270);
        addObject(new Wall(),600,298);
        addObject(new Wall(),600,326);
        addObject(new Wall(),600,354);
        addObject(new Wall(),600,382);
        //bordes horizontales
        addObject(new Wall(),28,0);
        addObject(new Wall(),56,0);
        addObject(new Wall(),84,0);
        addObject(new Wall(),112,0);
        addObject(new Wall(),130,0);
        addObject(new Wall(),158,0);
        addObject(new Wall(),186,0);
        addObject(new Wall(),214,0);
        addObject(new Wall(),242,0);
        addObject(new Wall(),270,0);
        addObject(new Wall(),298,0);
        addObject(new Wall(),326,0);
        addObject(new Wall(),354,0);
        addObject(new Wall(),382,0);
        addObject(new Wall(),410,0);
        addObject(new Wall(),438,0);
        addObject(new Wall(),466,0);
        addObject(new Wall(),494,0);
        addObject(new Wall(),522,0);
        addObject(new Wall(),550,0);
        addObject(new Wall(),578,0);
        addObject(new Wall(),28,400);
        addObject(new Wall(),56,400);
        addObject(new Wall(),84,400);
        addObject(new Wall(),112,400);
        addObject(new Wall(),130,400);
        addObject(new Wall(),158,400);
        addObject(new Wall(),186,400);
        addObject(new Wall(),214,400);
        addObject(new Wall(),242,400);
        addObject(new Wall(),270,400);
        addObject(new Wall(),298,400);
        addObject(new Wall(),326,400);
        addObject(new Wall(),354,400);
        addObject(new Wall(),382,400);
        addObject(new Wall(),410,400);
        addObject(new Wall(),438,400);
        addObject(new Wall(),466,400);
        addObject(new Wall(),494,400);
        addObject(new Wall(),522,400);
        addObject(new Wall(),550,400);
        addObject(new Wall(),578,400);
        //paredes
        addObject(new Wall(),84,186);
        addObject(new Wall(),112,186);
        addObject(new Wall(),130,186);
        addObject(new Wall(),158,186);
        addObject(new Wall(),186,186);
        addObject(new Wall(),214,186);
        addObject(new Wall(),242,186);
        addObject(new Wall(),270,186);
        //addObject(new Wall(),298,186);
        //addObject(new Wall(),326,186);
        addObject(new Wall(),354,186);
        addObject(new Wall(),382,186);
        addObject(new Wall(),410,186);
        addObject(new Wall(),438,186);
        addObject(new Wall(),466,186);
        addObject(new Wall(),494,186);
        addObject(new Wall(),522,186);

        addObject(new Wall(),84,100);
        addObject(new Wall(),112,100);
        addObject(new Wall(),130,100);
        addObject(new Wall(),158,100);
        addObject(new Wall(),186,100);
        addObject(new Wall(),214,100);
        addObject(new Wall(),242,100);
        addObject(new Wall(),270,100);
        //addObject(new Wall(),298,100);
        //addObject(new Wall(),326,100);
        addObject(new Wall(),354,100);
        addObject(new Wall(),382,100);
        addObject(new Wall(),410,100);
        addObject(new Wall(),438,100);
        addObject(new Wall(),466,100);
        addObject(new Wall(),494,100);
        addObject(new Wall(),522,100);

        addObject(new Wall(),84,270);
        addObject(new Wall(),112,270);
        addObject(new Wall(),130,270);
        addObject(new Wall(),158,270);
        addObject(new Wall(),186,270);
        addObject(new Wall(),214,270);
        addObject(new Wall(),242,270);
        addObject(new Wall(),270,270);
        //addObject(new Wall(),298,270);
        //addObject(new Wall(),326,270);
        addObject(new Wall(),354,270);
        addObject(new Wall(),382,270);
        addObject(new Wall(),410,270);
        addObject(new Wall(),438,270);
        addObject(new Wall(),466,270);
        addObject(new Wall(),494,270);
        addObject(new Wall(),522,270);

        //puntos
        addObject(new SmallItem(),100,50);
        addObject(new SmallItem(),150,50);
        addObject(new SmallItem(),200,50);
        addObject(new SmallItem(),250,50);
        addObject(new SmallItem(),300,50);
        addObject(new SmallItem(),350,50);
        addObject(new SmallItem(),400,50);
        addObject(new Banana(),450,50);
        addObject(new SmallItem(),500,50);
        addObject(new BigItem(),550,50);

        addObject(new SmallItem(),50,145);
        addObject(new SmallItem(),100,145);
        addObject(new SmallItem(),150,145);
        addObject(new SmallItem(),200,145);
        addObject(new SmallItem(),250,145);
        addObject(new SmallItem(),300,145);
        addObject(new SmallItem(),350,145);
        addObject(new SmallItem(),400,145);
        addObject(new SmallItem(),450,145);
        addObject(new Apple(),500,145);
        addObject(new SmallItem(),550,145);

        addObject(new SmallItem(),50,230);
        addObject(new SmallItem(),100,230);
        addObject(new SmallItem(),150,235);
        addObject(new SmallItem(),200,235);
        addObject(new SmallItem(),250,235);
        addObject(new SmallItem(),300,235);
        addObject(new SmallItem(),350,235);
        addObject(new SmallItem(),400,235);
        addObject(new Cherry(),450,235);
        addObject(new SmallItem(),500,235);
        addObject(new SmallItem(),550,235);

        addObject(new BigItem(),50,350);
        addObject(new SmallItem(),100,350);
        addObject(new SmallItem(),150,350);
        addObject(new SmallItem(),200,350);
        addObject(new SmallItem(),250,350);
        addObject(new SmallItem(),300,350);
        addObject(new SmallItem(),350,350);
        addObject(new Strawberry(),400,350);
        addObject(new SmallItem(),450,350);
        addObject(new SmallItem(),500,350);
        addObject(new BigItem(),550,350);

        addObject(new Pacman(), 50,50);
        addObject(new Ghost(),306,220);
    }
}
