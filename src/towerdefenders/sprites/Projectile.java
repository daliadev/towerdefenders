package towerdefenders.sprites;

//import Resource.Resource;
import resources.Resource;
import java.awt.Graphics2D;
import java.awt.Point;
//import java.awt.Image;
//import java.awt.Rectangle;
import java.awt.image.BufferedImage;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.imageio.ImageIO;
//import premierjeu.interfaces.IDrawable;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.imageio.ImageIO;

public class Projectile extends Sprite {
    
    public double sensx = (Math.random() * -25);
    public double sensy = (Math.random() * 50) - 25;
    //private double posX = 0;
    //private double posY = 0;
    
    //private BufferedImage imgExplosion = null;
    
    //private boolean isExplode = false;
    //private int explosionCountDown = 0; // milliseconds
    //private int explosionDuration = 3000; // milliseconds
    
    
    public Projectile(int x, int y, int width, int height, BufferedImage img) {
        
        super(x, y, width, height, img);
        /*
        try
        {
            imgExplosion = ImageIO.read(Resource.class.getResource("explosion.png"));
        }
        catch (IOException ex) {
            Logger.getLogger(Tourelle.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
    
    
    public double getSensx() {
        return sensx;
    }

    public void setSensx(double sensx) {
        this.sensx = sensx;
    }

    public double getSensy() {
        return sensy;
    }

    public void setSensy(double sensy) {
        this.sensy = sensy;
    }


    public double getPosX() {
        return x;
    }

    public void setPosX(double posX) {
        this.x = (int) posX;
    }

    public double getPosY() {
        return y;
    }

    public void setPosY(double posY) {
        this.y = (int) posY;
    }
    
    public Point getPosition() {
        
        return new Point(x, y);
    }

    /*
    public boolean getIsExploding() {
        
        return isExplode;
    }
    
    public void setIsExploding(boolean isExploded) {
        
        this.isExplode = isExploded;
    }
    */
    
    @Override
    public void draw(Graphics2D g) {

        g.fillRect(x, y, 6, 6);
        
    }
    
    /*
    public void drawExplosion(Graphics2D g) {

        //g.fillRect(x, y, 6, 6);
        if (explosionCountDown > explosionDuration) {
            
            isExplode = false;
            explosionCountDown = 0;
        }
        else
        {
            if (imgExplosion != null)
            {
                g.drawImage(imgExplosion, x - (imgExplosion.getWidth() / 2), y - (imgExplosion.getHeight() / 2), imgExplosion.getWidth(), imgExplosion.getHeight(), null);
                isExplode = true;
                explosionCountDown++;
            }
            
        }
    }
    */
    

}
