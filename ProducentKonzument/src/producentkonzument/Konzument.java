/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producentkonzument;

/**
 *
 * @author kuba
 */
public class Konzument extends Thread{
    private Cteni c;
    private int suma = 0;
    
    Konzument(Cteni c){
        this.c = c;
    }
    
    @Override
    public void run(){
        int cislo;
        while(true){
            cislo = c.predej();
            if(interrupted() == false){
                suma += cislo;
            }
            else{
                break;
            } 
        }
        System.out.println(" " + c.jmenoSouboru + " - vysledek: " + suma);
    }
}
