/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrolaatributuvmape;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author kuba
 */
public class KontrolaAtributuVMape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] key = {"pozadi", "popredi", "ramecek"};
        HashSet<String> atributy = new HashSet<>(Arrays.asList(key));
        HashMap<String, String> nastaveni = new HashMap<>();
        nastaveni.put("pozadi", "bila");
        nastaveni.put("text", "zelena");
        System.out.println("Seznam atributu:    " + atributy);
        System.out.println("Aktualni nastaveni: " + nastaveni);
        HashSet<String> chybi = new HashSet<>(atributy);
        chybi.removeAll(nastaveni.keySet());
        System.out.println("atributy chybi:     " + chybi);
        HashSet<String> navic = new HashSet<>(nastaveni.keySet());
        navic.removeAll(atributy);
        System.out.println("Atributy navic:     " + navic);
        HashSet<String> shodne = new HashSet<>(nastaveni.keySet());
        shodne.retainAll(atributy);
        System.out.println("Atributy shodne:    " + shodne);
    }   
}
