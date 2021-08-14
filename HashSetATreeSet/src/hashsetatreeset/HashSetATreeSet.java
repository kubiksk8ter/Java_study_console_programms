/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetatreeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author kuba
 */
public class HashSetATreeSet {
    public static void naplneniATisk(Set<String> set) {
        set.add("treti");
        set.add("prvni");
        set.add("druhy");
        //Pokus o vložení stejného prvku
        if(set.add("treti") == false) {
            System.out.println("'treti' podruhe vlozeno");
        }
        System.out.println(set.size() + " " + set);
        for(String s : set) {
            System.out.print(s + ", ");
        }
        if(set.contains("treti") == true) {
            System.out.println("\n'treti' je v mnozine");
        }
        set.remove("treti");
        System.out.println(set);
        set.clear();
    }
    public static void main(String[] args) {
        System.out.println("HashSet:");
        naplneniATisk(new HashSet<>());
        System.out.println("TreeSet:");
        naplneniATisk(new TreeSet<>());
    }    
}
