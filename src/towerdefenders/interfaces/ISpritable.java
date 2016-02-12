/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.interfaces;

import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author Nico
 */
public interface ISpritable<T> {

    //public List<T> getAll();
    /*
    public List<T> getAll();
    
    public Object<T> get(<T> sprite);
    
    public void add(<T> sprite);
    
    public void remove(<T> sprite);
    */
    
    public BufferedImage getImg();
    
    public void setImg(BufferedImage img);
    
    public Point getCenter(Point center);
}
