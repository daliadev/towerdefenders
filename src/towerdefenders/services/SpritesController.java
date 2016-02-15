/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.services;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
//import javax.swing.JPanel;
import towerdefenders.sprites.Sprite;
//import towerdefenders.utils.ImageLoader;

/**
 *
 * @author Nicolas
 */
public class SpritesController {
    
    
    private ArrayList<Sprite> sprites = new ArrayList<>();
    
    private Container container;
    
    //private ImageLoader imgLoader;
    //private boolean drawable = true;
    
    public SpritesController() {
        
    }

    public SpritesController(Container container) {
        
        this.container = container;
    }
    
    
    public boolean getSprite(Sprite sprType, int hashCode) {
        
        for (Sprite sprite : sprites) {
            
            if (sprType.equals(sprite)) {
                
                return true;
            }
        }
        
        return false;
    }
    
    public void addSprite(Sprite spr) {
        
        sprites.add(spr);
        //this.container.add((Component) spr);
    }
    
    
    public boolean updateSprite(Sprite spr) {
        
        for (Sprite sprite : sprites) {
            
            if (spr.equals(sprite)) {
                
                sprite = spr;
                return true;
            }
        }
        
        return false;
    }
    
    
    
    public void removeSprite(Sprite spr) {
        
        for (Sprite sprite : sprites) {
            
            if (sprite.equals(spr)) {
                
                this.sprites.remove(sprite);
            }
        }
    }
    
    
    public ArrayList<Sprite> getAllSprites() {
        
        return this.sprites;
    }
    
    public void removeAllSprite() {
        
        this.sprites.removeAll((Collection<Sprite>) sprites);
    }
    
    
    public void resizeAllPositions(double surfaceMultiplierX, double surfaceMultiplierY) {
        
        for (Sprite sprite : sprites) {
            Point position = sprite.getLocation();
            sprite.setLocation((int) (position.x * surfaceMultiplierX), (int) (position.y * surfaceMultiplierY));
        }
    }
    
    
    public void drawAll() {
        
        //String name = null;
        
        for (Sprite sprite : sprites) {
            
            //name = sprite.getName();
            
            // if (drawable) {
                
                Graphics g = container.getGraphics();

                sprite.draw(g);

                //System.out.println(sprite.getName());
            //}
        }
        /*
        if (name != null)
        {
            drawable = false;
        }
        */
    }
    
    
}
