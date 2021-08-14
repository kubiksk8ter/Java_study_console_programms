/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayscomparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kuba
 */
public class ArraysComparable {  
    static Osoba[] poleOsob;    
    static void vypisOsoby() {
        for (int i = 0; i < poleOsob.length; i++) {
            System.out.println("[" + i + "]" + poleOsob[i]);
        }    
    }    
    static void najdi(double vaha) {
        Osoba os = new Osoba(0, vaha, "nedůležité");
        int k = Arrays.binarySearch(poleOsob, os, new SeradPodleVahy());
        System.out.print("[" + k + "]=" + vaha);
        if(k<0) {
            System.out.println(" --> [" + -(k + 1) + "]=" + vaha);
        }
        else {
            System.out.println();
        }    
    }
    static String vypis(List <Osoba> list) {
        String s = "";
        for(Osoba o: list) {
            s += o.popis + ": va: " + o.vaha + ", vy: " + o.vyska + "\n";
        }
        return s;
    }
    public static void main(String[] args) {
        List<Osoba> sez = new ArrayList<>();
        sez.add(new Osoba(186, 82.5, "muz"));
        sez.add(new Osoba(172, 63.0, "zena"));
        sez.add(new Osoba(105, 26.1, "dite"));
        sez.add(new Osoba(116, 80.5, "obezni trpasli"));
        
        Collections.sort(sez, new SeradPodleVahy());
        System.out.println("Abs. řazení podle váhy: " + "\n" + vypis(sez));
        
        Collections.reverse(sez);              
        System.out.println("Podle výhy sestupně: " + "\n" + vypis(sez));
        
        Collections.shuffle(sez);
        System.out.println("Zamícháno: " + "\n" + vypis(sez));
        
        System.out.println("Nejvyšší: " + Collections.max(sez));
        
        System.out.println("Nejlehčí: " + Collections.min(sez, new SeradPodleVahy()));
        
        Osoba robot = new Osoba(180, 75.0, "robot");
        Collections.fill(sez, robot);
        System.out.println("Vyplněno: "  + "\n" + vypis(sez));
        int pocet = Collections.frequency(sez, robot);
        System.out.println("Počet robotů: " + pocet);                
    }   
}
