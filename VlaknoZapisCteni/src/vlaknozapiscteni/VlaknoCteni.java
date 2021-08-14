/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vlaknozapiscteni;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kuba
 */
public class VlaknoCteni extends Thread{
    FileReader fr;
    String cesta;
    
    public VlaknoCteni(String cesta){
        super("Vlákno pro čtení");
        this.cesta = cesta;
    }
    
    @Override
    public void run(){
        try {
            fr = new FileReader(cesta);
            System.out.println("Přečteno číslo: " + ((fr.read())));
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(VlaknoCteni.class.getName()).log(Level.SEVERE, null, ex);
        }
         

    }

}
