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
    public static Start SMG;
    public static void main(String[] args) {
        // TODO code application logic here
        SMC = null;
        SMG = null;
        SMC = new StartMenuController();
        SMG = new Start();
        SMC.startgui = SMG;
        SMG.startMenuController = SMC;
    }
    
}
