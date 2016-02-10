/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.ui;

import resources.Resource;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import towerdefenders.sprites.Sprite;
/*
import premierjeu.bo.Mechant;
import premierjeu.bo.Ouvrier;
import premierjeu.bo.Tourelle;
import premierjeu.manager.MechantManager;
import premierjeu.manager.OuvrierManager;
import premierjeu.manager.TourelleManager;
*/
/**
 *
 * @author valen_000
 */
public class Playground extends JPanel {
    
    Image mine;
    Image barrack;
    Image grassTiles;
    
    private ArrayList<Sprite> sprites = new ArrayList<>();
    
        
    
    public Playground() {
        
        super(true); 
        
        try {
            mine = ImageIO.read(Resource.class.getResource("mine_or.png"));
        } 
        catch (IOException ex) {
            Logger.getLogger(Playground.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            barrack = ImageIO.read(Resource.class.getResource("barrack.png"));
        } 
        catch (IOException ex) {
            Logger.getLogger(Playground.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            grassTiles = ImageIO.read(Resource.class.getResource("motif_herbe.png"));
        } 
        catch (IOException ex) {
            Logger.getLogger(Playground.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public void paintComponent(Graphics g){

        Graphics2D background = (Graphics2D) g;
        //panneau.setColor(Color.GREEN);
        //panneau.fillRect(0, 0, getWidth(), getHeight());
        background.drawImage(grassTiles,0, 0, getWidth(), getHeight(), null);

        int i = 150;
        Graphics2D base = (Graphics2D) g;
        //base.setColor(Color.BLACK);
        //base.fillRect((((getWidth())/2)-(i/2)), (((getHeight())/2)-(i/2)), i, i);
        base.drawImage(barrack,(((getWidth())/2)-(i/2)), (((getHeight())/2)-(i/2)), i, i, null);

        int j = 130;

        Graphics2D stock = (Graphics2D) g;
        //stock.setColor(Color.CYAN);
        //stock.fillRect(getWidth() - j, getHeight() - j, j, j);
        stock.drawImage(mine, getWidth() - j, getHeight() - j, j, j, null); 
        
        /*
        for (Ouvrier ouvrier : OuvrierManager.getClone()){

            ouvrier.draw(panneau);   
            ouvrier.draw(base);
            ouvrier.draw(stock);


        }

        for (Mechant mechant : MechantManager.getClone()){

            mechant.draw(panneau);   
            mechant.draw(base);
            mechant.draw(stock);


        }

        for (Tourelle tourelle : TourelleManager.getClone()){

            tourelle.draw(panneau);   
            tourelle.draw(base);
            tourelle.draw(stock);


        }
        */
    }
    
}
