/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgour;

/**
 *
 * @author curtis
 */
public class game implements Igame, player1,player2{
    String name;
    String p1Name;//player 1 name 
    String p2Name;//player 2 name
    String diff;//difficulty level
    int p1p;//player 1 pieces
    int p1dr;//player 1 diceroll
    int p1endp;//player 1 end pieces
    int p2p;//player 2 pieces
    int p2dr;//player 2 diceroll
    int p2endp;//player 2 end pieces
    int [] p1np;//player 1 number of pieces 
    int [] p2np;//player 2 number of pieces
    boolean p1s;//player 1 space
    boolean p2s;
    boolean p2;
    boolean start;
    boolean end;
    
    //player 1 set
    public void setP1Nmae(String p1n){
        p1Name = p1n;
    }
    public void setPieces1(int a){
        p1p = a;
    }
    public void setDr1(int a){
        p1dr =a;
    }
    public void setEndp1(int a){
        p1endp = a;
    }
    public void setSpace1(boolean a){
        p1s =a;
    }
    public void getPn1(int []a){
        p1np = a;
    }
    //player 2 set
    public void setP2Nmae(String p2n){
        p2Name = p2n;
    }
    public void setPieces2(int a){
        p2p = a;
    }
    public void setDr2(int a){
        p2dr =a;
    }
    public void setEndp2(int a){
        p2endp = a;
    }
    public void setSpace2(boolean a){
        p2s =a;
    }
    public void getPn2(int []a){
        p2np = a;
    }
    //p2 set end
    public void setName(String a){
        name =a;
    }
    public void setDiff(String a){
        diff = a;
    }
    public void setP2(boolean b){
        p2 = b;
    }
    public void setStart(boolean c){
        start =c;
    }
    public void setEnd(boolean d){
        end=d;
    }
    //p1 interface
    @Override 
    public String getP1Name(){
        return p1Name;
    }
    @Override
    public int getPieces1(){
        return p1p;
    }
    @Override
    public int getDr1(){
        return p1dr;
    }
    @Override
    public int getEndp1(){
        return p1endp;
    }
    @Override
    public boolean getSpace1(){
        return p1s;
    }
    @Override
    public int[] getPn1(){
        return p1np;
    }
    //end of p1 interface
    //p2 interface 
    @Override 
    public String getP2Name(){
        return p2Name;
    }
    @Override
    public int getPieces2(){
        return p2p;
    }
    @Override
    public int getDr2(){
        return p2dr;
    }
    @Override
    public int getEndp2(){
        return p2endp;
    }
    @Override
    public boolean getSpace2(){
        return p2s;
    }
    @Override
    public int[] getPn2(){
        return p2np;
    }
    //end p2 getters
    @Override 
    public String getName(){
        return name;
    }
    @Override
    public String diffmode(){
        return diff;
    }
    @Override
    public boolean getPlayer2(){
        return p2;
    }
    @Override
    public boolean getStart(){
        return start;
    }
    @Override
    public boolean getEnd(){
        return end;
    }
}
