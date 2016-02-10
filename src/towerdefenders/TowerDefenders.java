/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders;

import javax.swing.JFrame;
import towerdefenders.services.UIController;
import towerdefenders.threads.GameThread;

/**
 *
 * @author Nico
 */
public class TowerDefenders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UIController.getWindow().setExtendedState(JFrame.MAXIMIZED_BOTH);                
        /*EntiteManager.init();*/
        UIController.getWindow().setVisible(true);
        GameThread.LauchRepaintThread();        
    
        int countM;

        for (countM = 1; countM <= Float.POSITIVE_INFINITY ; countM++)
        {
            //Thread.sleep(20000);
            //System.out.println(countM);
            //MechantManager.init();
            
            if (countM <= 1) {
                
                UIController.getWindow().lbl_mechant.setText( countM  + " Monstre");
            } 
            else {
                
                UIController.getWindow().lbl_mechant.setText( countM  + " Montres");
            }
            
            
        }
        
        /*TimerTask task = new TimerTask()
		{
			@Override
			public void run() 
			{
                                MechantManager.init();  
			}	
		};
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, 0, 20000);*/
    }
    
}
