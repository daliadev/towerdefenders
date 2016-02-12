/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.sprites;


import towerdefenders.behaviors.Picture;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Objects;
import towerdefenders.behaviors.Vector;
import towerdefenders.interfaces.IDrawable;
import towerdefenders.interfaces.IMovable;
//import towerdefenders.interfaces.ISpritable;

/**
 *
 * @author Nico
 */
public abstract class Sprite extends Rectangle {
    
    
    protected BufferedImage img;
    protected String name;
    
    // Default behaviors
    protected IDrawable displayBehavior;
    protected IMovable movingBehavior;

    
    public Sprite() {
        
        
    }
    
    public Sprite(String name, int x, int y, int width, int height, BufferedImage img) {
        
        super(x, y, width, height);
        
        this.name = name;
        this.img = img;
        
        // Default behaviors
        this.displayBehavior = new Picture();
        this.movingBehavior = new Vector();
    }

    
    /* Getters - Setters */
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public BufferedImage getImg() {
        
        return this.img;
    }

    public void setImg(BufferedImage img) {
        
        this.img = img;
    }

    
    public Point getCenter(Point center) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Setters default behaviors
    public void setDisplayBehavior(IDrawable behavior) {
        this.displayBehavior = behavior;
    }

    public void setMovingBehavior(IMovable behavior) {
        this.movingBehavior = behavior;
    }
    
    
    
    
    /* Default Behaviors */
    
    public void draw(Graphics g) {
        
        displayBehavior.display(g, img, x, y, width, height);
    }
    
    public void move() {
        
        this.movingBehavior.move();
    }
    
    public void stop() {
        
        this.movingBehavior.stop();
    }
    
    
    
    /* Override Object methods */
    
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
