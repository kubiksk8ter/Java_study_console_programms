/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trojuhelnikclass;

/**
 *
 * @author kuba
 */
public class Trojuhelnik {
    public int stranaA;
    public int stranaB;
    public int stranaC;
    
    public Trojuhelnik(int a, int b, int c){
        this.stranaA = a;
        this.stranaB = b;
        this.stranaC = c;
        if((stranaA+stranaB<=stranaC)||(stranaC+stranaB<=stranaA)||(stranaA+stranaC<=stranaB)){
            System.out.println("Není trojúhelník! Všechny strany nastaveny na 0.");
            stranaA = 0;
            stranaB = 0;
            stranaC = 0;
        }
    }
    public Trojuhelnik(int a){
        this.stranaA = a;
        this.stranaB = a;
        this.stranaC = a;                
    }
    public Trojuhelnik(int a, int b){
        if(a<b){
            this.stranaA = a;
            this.stranaB = b;
            this.stranaC = a;
        }
        else{
            this.stranaA = a;
            this.stranaB = b;
            this.stranaC = b;
        }
    }
    /**
     * Metoda k určení obvodu trojúhelníku
     * @return double
     */
    public double obvod(){
        double obvod = stranaA + stranaB + stranaC;
        return obvod;
    }
    
    /**
     * Metoda k určení, zda je trojúhelník pravoúhlý podle Pythagorovi věty 
     * @return boolean
     */
    public boolean jePravouhly(){
        boolean b = false;        
            if(Math.pow(stranaA, 2)==Math.pow(stranaB, 2)+Math.pow(stranaC, 2)){
                b = true;
            }
        
            if(Math.pow(stranaB, 2)==Math.pow(stranaA, 2)+Math.pow(stranaC, 2)){
                b = true;
            }    

            if(Math.pow(stranaC, 2)==Math.pow(stranaB, 2)+Math.pow(stranaA, 2)){
                b = true;
            }               
        return b;
    }    
}
