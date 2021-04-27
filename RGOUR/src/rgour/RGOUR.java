/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgour;

/**
 *
 * @author gigis
 */
public class RGOUR {

    /**
     * @param args the command line arguments
     */
    public static StartMenuController SMC;
    public static StartGui SMG;
    public static void main(String[] args) {
        initialize();
    }
    public static void initialize(){
        WatcherThread newWatcherThread = new WatcherThread();
        
        //init variables
        SMC = null;
        SMG = null;
        SMC = new StartMenuController();
        newWatcherThread.smc = SMC;
        SMC.wt = newWatcherThread;
        SMG = new StartGui();
        SMG.controller = SMC;
        SMC.startgui = SMG;
        SMG.controller = SMC;
        
        SMG.setVisible(true);
        
        //watches to see if game is over and gui needs to be recycled
        Thread watcher = new Thread(newWatcherThread);
        watcher.start();
    }
    
    public static void StartGame(game game, agame gui){
        agame op = new agame();
        op.setVisible(true);
    }
    
    
    
}
