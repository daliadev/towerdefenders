package towerdefenders.sprites;

import resources.Resource;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
/*
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
*/
//import premierjeu.interfaces.IDrawable;

public class Ouvrier extends MovableSprite {
    

    public  boolean charger;
    public int count = 0;
    public int countMax = 150;
    

    public Ouvrier() {
        
        super("ouvrier", 0, 0, 0, 0, null);
        
        /*
        try {
            img_d = ImageIO.read(Resource.class.getResource("persoright.png"));
        } catch (IOException ex) {
            Logger.getLogger(Ouvrier.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        //g.drawImage(img_d, x, y, width, height, null);
        
    }

}
