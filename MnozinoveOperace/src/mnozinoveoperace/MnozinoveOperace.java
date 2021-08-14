/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnozinoveoperace;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kuba
 */
public class MnozinoveOperace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> m1 = new HashSet<>();
        Collections.addAll(m1, "1", "2", "3", "4");
        Set<String> m2 = new HashSet<>();
        Collections.addAll(m2, "2", "3");
        
        if(m1.containsAll(m2) == true) {
            System.out.println(m2 + " je podmnozinou " + m1);
        }
        m2.add("5");
        Set<String> sjednoceni = new HashSet<String>(m1);
        sjednoceni.addAll(m2);
        System.out.println(sjednoceni + " je sjednocenim " + m1 + " a " + m2);
        
        Set<String> prunik = new HashSet<String>(m1);
        prunik.retainAll(m2);
        System.out.println(prunik + " je prunikem " + m1 + " a " + m2);
        
        Set<String> rozdil = new HashSet<String>(m1);
        rozdil.removeAll(m2);
        System.out.println(rozdil + " je rozdilem " + m1 + " a " + m2);
        
        Set<String> symetrickyRozdil = new HashSet<String>(m1);
        symetrickyRozdil.addAll(m2);
        Set<String> tmp = new HashSet<>(m1);
        tmp.retainAll(m2);
        symetrickyRozdil.removeAll(tmp);
        System.out.println(symetrickyRozdil + " je symetrickym rozdilem  " + m1 + " a " + m2);
    }   
}
