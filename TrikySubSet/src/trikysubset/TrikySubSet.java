/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trikysubset;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author kuba
 */
public class TrikySubSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] s = {"ahoj", "babi", "co", "dela", "deda", "a", "eva"};
        System.out.println(Arrays.asList(s));
        TreeSet<String> ts = new TreeSet<>(Arrays.asList(s));
        System.out.println(ts);
        SortedSet<String> sub = ts.subSet("b", "e");
        System.out.println("Pocet slov mezi 'a' a 'e':  " + sub.size() + " " + sub);
        System.out.println("Triky s mezemi");
        sub = ts.subSet("a", "co");
        System.out.println("Pocet slov mezi 'a' a 'co': " + sub.size() + " " + sub);
        sub = ts.subSet("a", "co\0");
        System.out.println("Pocet slov mezi 'a' a 'co' vcetne:  " + sub.size() + " " + sub);
        sub = ts.subSet("a\0", "co");
        System.out.println("Pocet slov mezi 'a' a 'co' bez: " + sub.size() + " " + sub);
        System.out.println();
        ts.subSet("d", "e").clear();
        System.out.println("Bez slov od 'd': " + ts);
        
        System.out.println("Predchudci a naslednici");
        String pred = (String) ts.headSet("babi").last();
        System.out.println("Predchudce 'babi': " + pred);
        String po = (String) ts.tailSet("babi\0").first();
        System.out.println("Naslednik 'babi': " + po);
        
        System.out.println("Pocty slov od jednotlivych pismen");
        for (char ch = 'a'; ch <= 'e'; ch++) {
            String zac = new String(new char[] {ch});
            String kon = new String(new char[] {(char)(ch + 1)});
            System.out.print(zac + ": " + ts.subSet(zac, kon).size() + ", ");
        }
    }   
}
