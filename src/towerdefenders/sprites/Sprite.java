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
    
    
    protected BufferedImage img;
    protected String name;

    
    public Sprite(String name, int x, int y, int width, int height, BufferedImage img) {
        
        super(x, y, width, height);
        
        this.name = name;
        this.img = img;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        
        if (img != null) {
            
            g.drawImage(img, x, y, width, height, null);
        }
        else {
            
            g.drawRect(x, y, width, height);
        }
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
