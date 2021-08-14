/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pouzitipriorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author kuba
 */
public class PouzitiPriorityQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Vojak> kantyna = new PriorityQueue<>();
        kantyna.add(new Vojak(1, "major", "letectvo"));
        kantyna.add(new Vojak(3, "plukovník", "pěchota"));
        kantyna.add(new Vojak(2, "podplukovnik", "policie"));
        kantyna.add(new Vojak(3, "plukovnik", "spojari"));
        kantyna.add(new Vojak(4, "nadplukovnik" , "chemici"));
        System.out.println("Fronta najednou: " + kantyna);
        System.out.print("\nPoradi vydaje jidel: ");
        while(!kantyna.isEmpty()) {
            System.out.print(kantyna.remove());
        }
    }    
}
