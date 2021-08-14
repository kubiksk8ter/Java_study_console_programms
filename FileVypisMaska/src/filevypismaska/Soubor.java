/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filevypismaska;

import java.io.File;

/**
 *
 * @author kuba
 */
public class Soubor {
    private String cesta;
    private String mask;
   
    public void vypisSoubory(String cesta, String mask){
        this.cesta = cesta;
        this.mask = mask;
        File f = new File(cesta);
        MaskFilter filter = new MaskFilter(mask);
        String [] soubory = f.list(filter);
        System.out.println(cesta);
        for(String name : soubory){
            System.out.println("\t" + name);
        }
        String [] slozky = f.list();
        for(String name : slozky){
            File f2 = new File(cesta+"\\"+ name);
            if(f2.isDirectory()){
                Soubor s = new Soubor();             
                s.vypisSoubory(cesta +"\\"+ name, mask);
            }
        }       
    }
}
