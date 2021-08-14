/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorzakladnipouziti;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author kuba
 */
public class IteratorZakladniPouziti {

    static class Hruska {
        private int cena;

        public Hruska(int cena) { this.cena = cena;}

        @Override
        public String toString() { return "Hruska{" + "cena=" + cena + '}';}
        public void tisk () { System.out.print(cena + ", ");}
    }
    
    public static void main(String[] args) {
        ArrayList<Hruska> kosHrusek = new ArrayList<>();
        for(int i = 0; i<10; i++) {
            kosHrusek.add(new Hruska(i + 20));
        }
        for(Iterator<Hruska> it = kosHrusek.iterator(); it.hasNext(); ) {
            System.out.println(it.next() + ", ");
        }
        System.out.println();
        
        Iterator<Hruska> it = kosHrusek.iterator();
        while(it.hasNext()) {
            it.next().tisk();
        }
        System.out.println();        
    }    
}
