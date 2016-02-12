package towerdefenders.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Mechant extends Sprite {
    
    public int count = 0;
    public int countMax = 150;
    
    private boolean isDead = false;
    
    
    public Mechant() {
        
        //super("mechant", 0, 0, 0, 0, null);
        
        /*
        try {
            img = ImageIO.read(Resource.class.getResource("mechant.png"));
        } catch (IOException ex) {
            Logger.getLogger(Mechant.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
    
    /*
    public boolean getIsDead() {
        
        return this.isDead;
    }
    
    public void setIsDead(boolean isDead) {
        
        this.isDead = isDead;
    }
    
    
    @Override
    public void draw(Graphics g) {
        
        super.draw(g);
        
        //if (!isDead)
        //{
           g.drawImage(this.img, x, y, width, height, null); 
        //}
        //else {
            
        //}
            
    }
    */
}
