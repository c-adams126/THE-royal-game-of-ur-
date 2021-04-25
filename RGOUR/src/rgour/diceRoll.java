/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgour;
import java.util.Random;
/**
 *
 * @author gigis
 */
public class diceRoll {
    Random rand = new Random();
    int x;
    diceRoll(){
        x = rand.nextInt(3);
    }
    public int getDice(){
        return x;
    }
}
