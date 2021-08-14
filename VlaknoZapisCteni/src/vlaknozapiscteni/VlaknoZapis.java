/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vlaknozapiscteni;

import java.io.*;

/**
 *
 * @author kuba
 */
public class VlaknoZapis extends Thread {
    FileWriter fw;
    PrintWriter bw;
    public String cesta = "";
    
    
    public VlaknoZapis(String cesta){
        super("Vlákno pro zápis");
        this.cesta = cesta;
    }
    
    @Override
    public void run(){
        
        try{            
            for(int i = 0; i < 10; i++){
                fw = new FileWriter(cesta);
                bw = new PrintWriter(fw);
                bw.print(i);
                bw.println();
                System.out.println("Zapsáno číslo: " + i);
                bw.close();
                Thread.yield();
            }
        }
        catch(IOException e){
                System.out.println("Chyba souboru v zápisu");
                e.printStackTrace();
        }             
    }
}
