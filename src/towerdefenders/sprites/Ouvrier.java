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

public class Ouvrier extends Rectangle implements IDrawable {
    
    public int sensx = 3;
    public int sensy = 3;
    Image img_d;
    public  boolean charger;
    public int count = 0;
    public int countMax = 150;
    

    public Ouvrier(int x, int y, int width, int height) {
        super(x, y, width, height);

        try {
            img_d = ImageIO.read(Resource.class.getResource("persoright.png"));
        } catch (IOException ex) {
            Logger.getLogger(Ouvrier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void draw(Graphics2D g) {

        /*g.setColor(Color.RED);
        g.fillRect(x, y, width, height);*/
        g.drawImage(img_d, x, y, width, height, null);
        
    }

}
