/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.sprites;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author Nicolas
 */
public class MovableSprite extends Sprite {
    
    
    public double directionX = 0;
    public double directionY = 0;
    
    
    public MovableSprite(int x, int y, int width, int height, BufferedImage img) {
        
        super(x, y, width, height, img);
    }

    
    
    public double getDirectionX() {
        return directionX;
    }

    public void setDirectionX(double directionX) {
        this.directionX = directionX;
    }

    public double getDirectionY() {
        return directionY;
    }

    public void setDirectionY(double directionY) {
        this.directionY = directionY;
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
