/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.sprites;


import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Nicolas
 */
public class Base extends Sprite {

    
    public Base() {
    }
    
    public Base(String name, int x, int y, int width, int height, BufferedImage img) {
        super(name, x, y, width, height, img);
    }
    
    
    @Override
    public void draw(Graphics g) {
        
        super.draw(g);
    }
    
}