/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typickyprvekkolekce;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kuba
 */
public class TypickyPrvekKolekce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jmeno> ar = new ArrayList<>();
        ar.add(new Jmeno("Premysl", "Prvni"));
        ar.add(new Jmeno("Rudolf", "Druhy"));
        ar.add(new Jmeno("Vaclav", "Treti"));
        ar.add(new Jmeno("Karel", "Ctvrty"));
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);
        
    }    
}
