/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistvlastnitrida;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kuba
 */
public class ArrayListVlastniTrida {

    public static void tiskni(String jmeno, List<CeleCislo> li) {
        int vel = li.size();
        System.out.print(jmeno + "( " + vel + ") : ");
        for(int i = 0; i < vel; i++) {
            System.out.print("[" + i + "]=" + li.get(i).getCislo() + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Vytvoření seznamu");
        ArrayList<CeleCislo> ar = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            ar.add(new CeleCislo(i + 10));
        }
        tiskni("ar", ar);
        System.out.println("Tisk celého seznamu: " + ar);
        
        System.out.println("Pridavani prvku");
        ar.add(2, new CeleCislo(77));
        tiskni("ar", ar);
        
        System.out.println("Vytvoření podseznamu");
        List<CeleCislo> sl = ar.subList(2, 5);
        tiskni("sl", sl);
        
        ar.get(3).setCislo(33);
        tiskni("ar", ar);
        tiskni("sl", sl);
    }    
}
