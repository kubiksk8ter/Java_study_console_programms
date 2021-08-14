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
public class Producent extends Thread{
    private Cteni c;
    
    Producent(Cteni c){
        this.c = c;
    }
    
    @Override
    public void run(){
        while(interrupted() == false) {
            c.nascti();
        }
        System.out.println(" " + c.jmenoSouboru + " - konec cteni ");
    }
}
