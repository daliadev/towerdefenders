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
 * @author valen_000
 */
public class GameThread {
    
    public static boolean isStop = false;
    
    public static void Stop()
    {
        isStop = true ; 
    }
    
    public static void LauchRepaintThread(){
        
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
    
    private static void Manage() throws InterruptedException{
        /*
        OuvrierManager.gestionMouvement();
        MechantManager.gestionMouvement();
        TourelleManager.gestionTir();
        UIController.gestionSprites();
        */
                
        try {
            Thread.sleep(40);
        } catch (InterruptedException ex) {
            Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    private static void Repaint() {
       
        if (!isStop)
        {
            UIController.getWindow().board.repaint();
            
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }  
    
}
