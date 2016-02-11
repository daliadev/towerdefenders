/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.services;

import javax.swing.JPanel;
import towerdefenders.sprites.Base;
import towerdefenders.sprites.Sprite;
import towerdefenders.ui.*;

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
    
    private SpritesController sprController;
    
    private JPanel ground = getWindow().board;
    

    public static GameWindow getWindow(){
        
        if(gameWindow == null){
            gameWindow = new GameWindow();
        }
        return gameWindow; 
    }
    
    
    public void init() {
        
        sprController = new SpritesController(ground);
        
        Sprite base = new Base(0, 0, 150, 140, img);
        sprController.addSprite(base);
        ground.add(base);
        
        ground.d
    }
    
    
    
    
    
    
}
