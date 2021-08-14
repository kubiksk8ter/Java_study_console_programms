/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setvlastnitrida;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author kuba
 */
public class SetVlastniTrida {

    static void praceSHruskami(String typ, Set<Hruska> set) {
        for(int i = 20; i < 30; i++) {
            set.add(new Hruska(i));
        }
        set.add(new Hruska(25));
        //tisk množiny pomocí for-each
        System.out.print(typ + "-pocet:" + set.size() + " [");
        for(Hruska h: set) {
            System.out.print(h + ", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        System.out.println("Nepřetížena metoda hashCode:");
        praceSHruskami("HashSet", new HashSet<>());
        praceSHruskami("TreeSet", new TreeSet<>());
                
    }   
}
