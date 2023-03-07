import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{
    private static final int OFFSET = 6;
    private static final int DIRECTION_RIGHT = 0;
    private static final int DIRECTION_LEFT = 1;  
    private static final int DIRECTION_UP = 2;
    private static final int DIRECTION_DOWN = 3; 
    private static final int COUNT_DOWN_MOUTH_START_VALUE=10;
    
    private int mouthDelay=COUNT_DOWN_MOUTH_START_VALUE;
    private int imageIndex;
    private int direction = DIRECTION_RIGHT;
    
    private int score =0;
    
    private String [][]images;
    
    public Pacman(){
        
        prepareImagesCollection();
        
        setImage(images[DIRECTION_RIGHT][0]);
        
    }
    
    public void act()
    {
        movePacman();
        
        handleKeys();
        
        handleImageSelector();
        
        checkCollisions();
        
        checkGhostCollisions();
        
        updateHud();
    }
    
    private void checkGhostCollisions(){
        Ghost ghost = (Ghost)this.getOneIntersectingObject(Ghost.class);
        if(ghost!=null){
            World world = getWorld();
            world.showText("GAME OVER", 300, 200);
            Greenfoot.stop();
        }
    }
    
    private void checkCollisions(){
        Item item = (Item)this.getOneIntersectingObject(Item.class);
        if(item!=null){
            score+=item.getPoints();
            this.getWorld().removeObject(item);
        }
    }
    
    private void updateHud(){
        World world = getWorld();
        
        world.showText("Score: "+score,world.getWidth()-100,20);
    }
    
    private void prepareImagesCollection(){
        images = new String[4][];
        
        images[DIRECTION_RIGHT] = new String[]{
            "images/pacman-close.png",
            "images/pacman-open.png"
        };
        images[DIRECTION_LEFT] = new String[]{
            "images/pacman-close-left.png",
            "images/pacman-open-left.png"
        };
        images[DIRECTION_UP] = new String[]{
            "images/pacman-close-up.png",
            "images/pacman-open-up.png"
        };
        images[DIRECTION_DOWN] = new String[]{
            "images/pacman-close-down.png",
            "images/pacman-open-down.png"
        };
    }
    
    private void movePacman(){
        Wall wall = null;
        switch(direction){
            case DIRECTION_RIGHT:
                wall = (Wall)this.getOneObjectAtOffset(OFFSET, 0, Wall.class);
                if(wall==null)
                {setLocation(getX() + OFFSET,getY());}
                break;
            case DIRECTION_LEFT:
                wall = (Wall)this.getOneObjectAtOffset(-OFFSET, 0, Wall.class);
                if(wall==null)
                {setLocation(getX() - OFFSET,getY());}
                break;
            case DIRECTION_UP:
                wall = (Wall)this.getOneObjectAtOffset(0, -OFFSET, Wall.class);
                if(wall==null)
                {setLocation(getX(),getY() - OFFSET);}
                break;
            case DIRECTION_DOWN:
                wall = (Wall)this.getOneObjectAtOffset(0, OFFSET, Wall.class);
                if(wall==null)
                {setLocation(getX(),getY() + OFFSET);}
                break;
        }
        if(this.isAtEdge())
        {
            if(this.getX()>200)
            this.setLocation(10,getY() );
            else
            this.setLocation(590,getY());
        }
    }
    
    private void handleKeys(){
        if(Greenfoot.isKeyDown("left")){
            direction=DIRECTION_LEFT;
        }else if(Greenfoot.isKeyDown("right")){
            direction=DIRECTION_RIGHT;
        }else if(Greenfoot.isKeyDown("up")){
            direction=DIRECTION_UP;
        }else if(Greenfoot.isKeyDown("down")){
            direction=DIRECTION_DOWN;
        }
    }
    
    private void handleImageSelector(){
        mouthDelay--;
        if(mouthDelay==0){
            imageIndex = (imageIndex +1)% images[direction].length;
            setImage(images[direction][imageIndex]);
            mouthDelay=COUNT_DOWN_MOUTH_START_VALUE;
        }
    }
}
