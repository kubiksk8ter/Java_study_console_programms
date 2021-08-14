/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producentkonzument;

import java.io.*;

/**
 *
 * @author kuba
 */
public class Cteni {
    private FileReader fr;
    private BufferedReader in;
    public String jmenoSouboru;
    private int hodnota;
    private boolean precteno = false;
    private boolean konecSouboru = false;
    
    Cteni(String jmeno){
        jmenoSouboru = jmeno;
        try{
            fr = new FileReader(jmenoSouboru);
            in = new BufferedReader(fr);
        }
        catch(IOException e) {
            System.out.println("Chyba při otvírání souboru!");
        }
    }
    
    synchronized public void nascti() {
        while(precteno == true) {
            try{
                wait();
            }
            catch(InterruptedException e){                
            }
            String radka;
            try{
                if((radka = in.readLine()) != null){
                    hodnota = Integer.valueOf(radka).intValue();
                    System.out.println(jmenoSouboru + " precteno: " + hodnota + " ");
                }
                else{
                    konecSouboru = true;
                    Thread.currentThread().interrupt();
                }
            }
            catch (IOException e){
                System.out.println("Chyba pri cteni souboru!");
            }
            precteno = true;
            notifyAll();
        }
    }
    
    synchronized public int predej(){
        while(precteno == false){
            try{
                wait();
            }
            catch(InterruptedException e){                
            }
        }
        precteno = false;
        if(konecSouboru == false){
            System.out.println(jmenoSouboru + " predano: " + hodnota + " ");
            notifyAll();
            return hodnota;
        }
        else{
            Thread.currentThread().interrupt();
            return 0;
        }
        
    }
    
    protected void finalize() {
        try{
            fr.close();
        }
        catch (IOException e){
            System.out.println("Chyba při zavírání souboru!");
        }
    }
}
