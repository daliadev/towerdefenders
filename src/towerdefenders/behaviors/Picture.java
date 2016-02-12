/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.behaviors;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import towerdefenders.interfaces.IDrawable;

/**
 *
 * @author Nicolas
 */
public class Picture implements IDrawable {

    
    public Picture() {
        
    }
    
    
    @Override
    public void display(Graphics g, BufferedImage img, int x, int y, int w, int h) {
        
        if (img != null) {
            
            g.drawImage(img, x, y, w, h, null);
        }
        else {
            
            g.drawRect(x, y, w, h);
        }
    }

}
