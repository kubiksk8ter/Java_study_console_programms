/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistproblemsublist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kuba
 */
public class ArrayListProblemSublist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            ar.add(new Integer(i + 10));
        }
        System.out.println("Cely seznam: " + ar);
        List<Integer> sl = ar.subList(2, 5);
        System.out.println("Podseznam: " + sl);
        System.out.println("Ubrání prvku [2] z celého seznamu");
        /* 
        ar.remove(2);
        ar.add(2, new Integer(77));
        sl.remove(0);
        sl.add(new Integer(77));
        */
        System.out.println("Celý seznam: " + ar);
        System.out.println("Podseznam: " + sl);
        
    }    
}
