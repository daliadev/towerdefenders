/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.services;

import java.awt.Point;
import java.awt.image.BufferedImage;
//import javax.swing.JPanel;
//import towerdefenders.sprites.Base;
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
        
        int posX, posY, w, h;
        Point groundCenter = new Point(getWindow().board.getWidth() / 2, getWindow().board.getHeight() / 2);
        
 
        BufferedImage barrack = ImageLoader.load("barrack.png");
        posX = groundCenter.x - (barrack.getWidth() / 2);
        posY = groundCenter.y - (barrack.getHeight() / 2);
        Sprite base = new BasicSprite("base", posX, posY, barrack.getWidth(), barrack.getHeight(), barrack);
        getSpritesController().addSprite(base);
    }
    
    /*
    public static Container getBackground() {
        
        return ground;
    }
    */
    
}
