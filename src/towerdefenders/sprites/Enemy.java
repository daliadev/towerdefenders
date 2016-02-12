/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import towerdefenders.interfaces.IDrawable;
import towerdefenders.interfaces.IMovable;

/**
 *
 * @author Nicolas
 */
public class Enemy extends Sprite {
    

    public Enemy(String name, int x, int y, int width, int height, BufferedImage img) {
        
        super(name, x, y, width, height, img);
    }

    
    public void setDisplayBehavior(IDrawable behavior) {
        
        this.displayBehavior = behavior;
    }

    public void setMovingBehavior(IMovable behavior) {
        
        this.movingBehavior = behavior;
    }
    
    
    /*
    @Override
    public void draw(Graphics g) {
        super.draw(g); //To change body of generated methods, choose Tools | Templates.
    }
    */

    @Override
    public void draw(Graphics g) {
        
        super.draw(g);
    }

    
    
    
    
    
}
