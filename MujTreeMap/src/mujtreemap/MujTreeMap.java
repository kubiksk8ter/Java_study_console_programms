/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mujtreemap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author kuba
 */
public class MujTreeMap {

    static void praceSMapou(TreeMap<VahaKlic, String> tm) {
        Comparator<? super VahaKlic> c = tm.comparator();
        String s = c.getClass().getName();
        
        System.out.println("Komparator: " + s);
        
        tm.put(new VahaKlic(85), "Pavel");
        tm.put(new VahaKlic(105), "Venca");
        tm.put(new VahaKlic(74), "Karel");
        
        System.out.println("Mapa: " + tm);
        
        VahaKlic v = tm.lastKey();
        System.out.println("Nejvice vazi: " + v + "=" + tm.get(v));

        SortedMap<VahaKlic, String> pom = tm.tailMap(new VahaKlic(85));
        System.out.println("Dva nejtezsi: " + pom + "\n");        
    }
    public static void main(String[] args) {
        praceSMapou(new TreeMap<VahaKlic, String>(new VahovyKomparator()));
    }   
}
