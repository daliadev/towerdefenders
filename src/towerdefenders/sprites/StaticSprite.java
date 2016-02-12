/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.sprites;

import towerdefenders.behaviors.Picture;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author Nicolas
 */
public abstract class StaticSprite extends Sprite {
    
    
    public StaticSprite() {
        //this.playground = new Picture();
    }
    public StaticSprite(String name, int x, int y, int width, int height, BufferedImage img) {
        
        super(name, x, y, width, height, img);
    }
    

    @Override
    public Point getCenter(Point center) {
        return super.getCenter(center); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setImg(BufferedImage img) {
        super.setImg(img); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BufferedImage getImg() {
        return super.getImg(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g); //To change body of generated methods, choose Tools | Templates.
    }
    
}
