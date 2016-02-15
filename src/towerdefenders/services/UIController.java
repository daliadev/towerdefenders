/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.services;

import java.awt.Dimension;
//import java.awt.Graphics;
import java.awt.Point;
//import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
//import javax.swing.JPanel;
import towerdefenders.sprites.BasicSprite;

import towerdefenders.sprites.Sprite;
import towerdefenders.ui.*;
import towerdefenders.utils.ImageLoader;

/*
import towerdefenders.ui.*;
import java.awt.Point;
import java.util.ArrayList;
import premierjeu.bo.Mechant;
import premierjeu.bo.Ouvrier;
import premierjeu.bo.Projectile;
import premierjeu.bo.Tourelle;
import premierjeu.view.Fenetre;
*/


/**
 *
 * @author nico
 */
public class UIController {
    
    
    private static GameWindow gameWindow;
    
    private static SpritesController sprController;
    
    //private static JPanel ground = getWindow().board;
    //private static ArrayList<Sprite> backgroundSprites = new ArrayList<>();
    
    private static Dimension groundSurface;
    

    public static GameWindow getWindow(){
        
        if(gameWindow == null){
            
            gameWindow = new GameWindow();
        }
        
        return gameWindow; 
    }
    
    /*
    public static void initSpritesController() {
        
        if (sprController == null) {
            
            sprController = new SpritesController(ground);
        }
    }
    */
    
    public static SpritesController getSpritesController(){
        
        if(sprController == null){
            
            sprController = new SpritesController(getWindow().board);
        }
        
        return sprController; 
    }
    
    
    public static void initBackground() {
        /*
        if (sprController == null) {
            
            initSpritesController();
        }
        */
        
        
        
        int posX, posY;
        Dimension surface = getWindow().board.getPreferredSize();
        Point groundCenter = new Point(surface.width / 2, surface.getSize().height / 2);
 
        BufferedImage barrack = ImageLoader.load("basement.png");
        posX = groundCenter.x - (barrack.getWidth() / 2);
        posY = groundCenter.y - (barrack.getHeight() / 2);
        Sprite base = new BasicSprite("basement", posX, posY, barrack.getWidth(), barrack.getHeight(), barrack);
        getSpritesController().addSprite(base);
        
        
        //backgroundSprites.add(base);
        //Graphics g = getWindow().board.getGraphics();
        
        //JPanel ground = getWindow().board;
        //ground.paint(g);
    }
    
    /*
    public static void updateBackground() {
        
        System.err.println("Background resizing");
        //return ground;
    }
    */
    
    public static void resize() {
        
        groundSurface = getWindow().board.getSize();
        Dimension initSurface = getWindow().board.getPreferredSize();
        
        System.out.println(groundSurface);
        System.out.println(initSurface);
        //Point groundCenter = new Point(groundSurface.width / 2, groundSurface.getSize().height / 2);
        double multiX = (double) groundSurface.width / (double) initSurface.width;
        double multiY = (double) groundSurface.height / (double) initSurface.height;
        System.out.println(multiX);
        System.out.println(multiY);
        /*
        Point position;
        
        ArrayList<Sprite> sprites = getSpritesController().getAllSprites();
        
        for (Sprite spr : sprites) {
            
            position = spr.getLocation();
            spr.setLocation((int) (position.x * multiX), (int) (position.y * multiY));
            getSpritesController().updateSprite(spr);
        }
        */
        getSpritesController().resizeAllPositions(multiX, multiY);
        
    }
    
    
    
    
    public static void draw() {
        
        getSpritesController().drawAll();
    }
    
}
