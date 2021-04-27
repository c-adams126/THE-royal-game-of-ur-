/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgour;

/**
 *
 * @author 13094
 */
public class StartMenuController {
    public static StartGui startgui;
    
    public static void Initialize(){
      
    }
    
    public static void setVsAi(){
        vsAi = true;
    }
    public static void setVsPlayer(){
        vsAi = false;
    }
    public static boolean vsAi = true;
    
    public static void StartGame(){
        gamegui = new agame();
        gamegui.setVisible(true);
        gamecontroller = new game();
        wt.gamecontroller = gamecontroller;
        wt.gamegui = gamegui;
        gamecontroller.vsAi = vsAi;
        
        
      
        
           
    }
    public static void DestroyGame(){
        gamegui.dispose(); 
        gamegui = null;
        gamecontroller = null;
        wt.gamegui = null;
        wt.gamecontroller = null;
    }
    static agame gamegui;
    static game  gamecontroller;
    
   public static WatcherThread wt;
    
}

