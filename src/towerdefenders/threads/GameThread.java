/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import towerdefenders.services.UIController;
/*
import premierjeu.manager.MechantManager;
import premierjeu.manager.OuvrierManager;
import premierjeu.manager.TourelleManager;
import premierjeu.manager.UIController;
*/

/**
 *
 * @author nico
 */
public class GameThread {
    
    public static boolean isStop = false;
    
    
    public static void startGameThread() {
        
        new Thread(new Runnable(){
            @Override
            public void run(){
                while (true) {                    
                    Repaint();
                }                
            }                
        }).start();
        
        new Thread(new Runnable(){
            @Override
            public void run(){
                while (true) {                    
                    try {
                        Manage();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }                
            }                
        }).start();
       
    }
    
    
    public static void stopGameThread() {
        
        isStop = true ; 
    }
    
    
    private static void Manage()throws InterruptedException{
        /*
        OuvrierManager.gestionMouvement();
        MechantManager.gestionMouvement();
        TourelleManager.gestionTir();
        UIController.gestionSprites();
        */
                
        try {
            
            Thread.sleep(10);
        } 
        catch (InterruptedException ex) {
            
            Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    private static void Repaint() {
       
        if (!isStop)
        {
            UIController.getWindow().board.repaint();
            //UIController.getSpritesController().drawAll();
            
            try {
                
                Thread.sleep(25);
            } 
            catch (InterruptedException ex) {
                
                Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }  
    
}
