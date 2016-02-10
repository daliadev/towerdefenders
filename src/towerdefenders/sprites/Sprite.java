/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.sprites;


import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Objects;
import towerdefenders.interfaces.IDrawable;
import towerdefenders.interfaces.ISprite;

/**
 *
 * @author Nico
 */
public abstract class Sprite extends Rectangle implements ISprite, IDrawable {
    
    
    private BufferedImage img;

    
    public Sprite(int x, int y, int width, int height, BufferedImage img) {
        
        super(x, y, width, height);
        this.img = img;
    }
    
    
    @Override
    public BufferedImage getImg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setImg(BufferedImage img) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getCenter(Point center) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sprite other = (Sprite) obj;
        
        return Objects.equals(this, other);
    }
    
    
    
}
