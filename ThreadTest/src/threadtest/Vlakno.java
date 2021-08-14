/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

import java.io.*;

/**
 *
 * @author kuba
 */
public class Vlakno extends Thread {
    FileReader fr;
    BufferedReader in;
    String jmenoSouboru;
    static public long suma = 0;
    static public boolean hotovo = false;
    
    public Vlakno(String jmeno){
        super("Vlakno pro řtení");
        jmenoSouboru = jmeno;
    }
    @Override
    public void run(){
        String radka;
        try{
            fr = new FileReader(jmenoSouboru);
            in = new BufferedReader(fr);
            while((radka = in.readLine())!=null){
                suma += Integer.parseInt(radka);
                Thread.yield();
            }
            fr.close();
            hotovo = true;
        }
        catch(IOException e) {
            System.out.println("Chyba v souboru!");
            hotovo = true;
        }
    }
    
}
