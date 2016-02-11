package towerdefenders.sprites;

import java.awt.Graphics;
import resources.Resource;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
//import premierjeu.manager.UIManager;



public class Tourelle extends StaticSprite {
    
    /*
    public int sensx = 1;
    public int sensy = 1;
    Image img_T;
    */
    
    //public  boolean charger;
    public int count = 0;
    public int countMax = 150;
    
    private Projectile fleche;
    
    //private BufferedImage explosion;


    public Tourelle() {
        
        super("tourelle", 0, 0, 0, 0, null);
        
        /*
        try {
            img_T = ImageIO.read(Resource.class.getResource("tourelle.png"));
        } 
        catch (IOException ex) {
            Logger.getLogger(Tourelle.class.getName()).log(Level.SEVERE, null, ex);
        }

        fleche = new Projectile(0, 0, 6, 6);
        */
    }
    
    
    
    
    
    public Projectile getFleche() {
        
        return fleche;
    }
    
    /*
    public void setFleche(Projectile fleche) {
        this.fleche = fleche;
    }
    */
    
    
    /*
    public void tirer()
    {
        if (fleche.isEmpty())
        {  
            fleche = new Projectile(x, y, 6, 6);
            add(fleche);
        }
        else if ((fleche.getPosX() > UIManager.getFenetre().getWidth() || fleche.getPosX() < 0) || (fleche.getPosY() > UIManager.getFenetre().getHeight() || fleche.getPosY() < 0))
        {
            fleche.setPosX(this.x);
            fleche.setPosY(this.y);
        }
        else
        {
            fleche.setPosX(fleche.getPosX() + fleche.getSensx());
            fleche.setPosY(fleche.getPosY() + fleche.getSensy());
        }
    }
    
    @Override
    public void draw(Graphics2D g) {

        g.drawImage(img_T, x - (width / 2), y - (height / 2), width, height, null);
        //g.drawRect(fleche.getPosX(), fleche.getPosY(), 12, 12);
        if (fleche != null)
        {
            //if (fleche.getIsExploding())
            //{
                //fleche.drawExplosion(g);
            //}
            //else
            //{
                fleche.draw(g);
            //}
        }
    }
    */

    @Override
    public void draw(Graphics g) {
        
        super.draw(g);
    }
    
    
}
