/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serazeni;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kuba
 */
public class Serazeni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Clovek> lide = new ArrayList<>();
        
        Clovek a = new Muz("Karel","Novák",LocalDate.of(1988, 2, 5));
        Clovek b = new Muz("Josef","Nový",LocalDate.of(1978, 3, 19));
        Clovek c = new Muz("Jan","Marek",LocalDate.of(1968, 4, 28));
        Clovek d = new Muz("Karel","Novák",LocalDate.of(1958, 6, 25));
        Clovek e = new Zena("Marie","Nová",LocalDate.of(1988, 8, 15));
        Clovek f = new Zena("Věra","Nováková",LocalDate.of(1978, 10, 2));
        Clovek g = new Zena("Simona","Mladá",LocalDate.of(1968, 1, 8));
        Clovek h = new Zena("Michaela","Marná",LocalDate.of(1958, 12, 6));
        
        lide.add(a);
        lide.add(b);
        lide.add(c);
        lide.add(d);
        lide.add(e);
        lide.add(f);
        lide.add(g);
        lide.add(h);
        
        Collections.sort(lide);
        Collections.reverse(lide);
        
        for(Clovek z : lide){
            System.out.println(z);
        }
        
        System.out.println();
        
        System.out.printf("%s a %s spolu mají dítě %s", a, e, a.plus(e));
    }
    
}
