/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.behaviors;

import towerdefenders.interfaces.IMovable;

/**
 *
 * @author Nicolas
 */
public class Vector implements IMovable {

    
    public double directionX = 0;
    public double directionY = 0;
    public double vitesseX = 0;
    public double vitesseY = 0;
    public double accelerationX = 0;
    public double accelerationY = 0;
    
    public double positionX = 0;
    public double positionY = 0;
    
    
    public Vector() {
        
    }

    
    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
