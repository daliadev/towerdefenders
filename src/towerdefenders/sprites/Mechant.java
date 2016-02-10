package towerdefenders.sprites;

import Resource.Resource;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import premierjeu.interfaces.IDrawable;


public class Mechant extends Rectangle implements IDrawable {

    public int sensx = 1;
    public int sensy = 1;
    Image img;
    //Image img_g;
    public  boolean charger;
    public int count = 0;
    public int countMax = 150;
    
    private boolean isDead = false;
    
    
    public Mechant(int x, int y, int width, int height) {
        super(x, y, width, height);

        try {
            img = ImageIO.read(Resource.class.getResource("mechant.png"));
        } catch (IOException ex) {
            Logger.getLogger(Mechant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public boolean getIsDead() {
        
        return this.isDead;
    }
    
    public void setIsDead(boolean isDead) {
        
        this.isDead = isDead;
    }
    
    
    @Override
    public void draw(Graphics2D g) {

        /*g.setColor(Color.RED);
        g.fillRect(x, y, width, height);*/
        if (!isDead)
        {
           g.drawImage(img, x, y, width, height, null); 
        }
        else {
            
        }
            
    }

}
