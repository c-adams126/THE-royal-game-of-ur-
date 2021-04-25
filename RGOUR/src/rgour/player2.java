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
public interface player2 {
    String getP2Name();
    int getPieces2();
    int getDr2();//dice roll
    int getEndp2();//end pieces 
    boolean getSpace2();//space safe or not
    int []getPn2();//piece numbers
}
