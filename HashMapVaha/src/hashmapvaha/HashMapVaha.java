/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapvaha;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author kuba
 */
public class HashMapVaha {
    static class Vaha {
        double vaha;
        public Vaha(double vaha) { this.vaha = vaha; }
        @Override
        public String toString() { return "" + vaha; }
        @Override
        public int hashCode() { return (int) vaha; }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Vaha == false) {
                return false;
            }
            boolean  stejnaVaha = (vaha == ((Vaha) obj).vaha);
            return stejnaVaha;
        }      
    }
    
    public static void main(String[] args) {
        HashMap<String, Vaha> hm1 = new HashMap<>();
        hm1.put("Pavel", new Vaha(85));
        hm1.put("Venca", new Vaha(105));
        hm1.put("Karel", new Vaha(70));
        
        HashMap<String, Vaha> hm2 = new HashMap<>(hm1);
        hm2.put("Kuba", new Vaha(84));
        
        System.out.println("Mapa: " + hm1);
        System.out.println("Mapa: " + hm2);
        
        System.out.println("hm2 obsahuje hm1: " + hm2.entrySet().containsAll(hm1.entrySet()));
               
    }   
}
