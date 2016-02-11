/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.services;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JPanel;
import towerdefenders.sprites.Sprite;

/**
 *
 * @author Nicolas
 */
public class SpritesController {
    
    
    private ArrayList<Sprite> sprites = new ArrayList<>();
    
    private JPanel container;
    
    
    
    public SpritesController() {
        
    }

    public SpritesController(JPanel container) {
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
    
    
}
