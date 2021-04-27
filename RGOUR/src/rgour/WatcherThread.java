/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgour;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 13094
 */
public class WatcherThread implements Runnable {  
  
    @Override  
    public void run() {  
        try {
            Thread.sleep(1000, 0);
        } catch (InterruptedException ex) {
            Logger.getLogger(WatcherThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("watcher thread repeating");  
        if(gamecontroller != null){ 
        if(gamecontroller.isdone == true && active == true){
            smc.DestroyGame();
            startgui = new StartGui();
            startgui.controller = smc;
            smc.startgui = startgui;
            startgui.setVisible(true);
        }
        }
        //see if need to tell gamecontroller to destroy game 
        
        
        run();
    }  
   
    public static void main(String[] args) {  
         
    }  
    
    
    public boolean active = false;
    public static agame gamegui;
    public static game  gamecontroller;
    public static StartMenuController smc;
    public static StartGui startgui;
}  
