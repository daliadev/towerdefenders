/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.interfaces;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author nico
 */
public interface IDrawable {
    
    
    public void display(Graphics g, BufferedImage img, int x, int y, int w, int h);

}
