/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozhrani;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/**
 *
 * @author kuba
 */
public class Rozhrani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Zvire> zvirata = new ArrayList<>();
        zvirata.add(new Ptak(1));
        zvirata.add(new Delfin(8));
        zvirata.add(new Delfin(9));
        zvirata.add(new PtakoJester(3));
        zvirata.add(new PtakoJester(2));
        zvirata.add(new Zvire(2){
            @Override
            public void presunSe() {
                System.out.println("Anonymně se přesouvám");
            }
        });
        Collections.sort(zvirata);
        
        for(Zvire z: zvirata){
            z.presunSe();
            if(z.getClass().getName().equals("rozhrani.Delfin")){
                ((Delfin)z).vyskoc();
            }
        }
        
        
        
        
        
    }
    
}
