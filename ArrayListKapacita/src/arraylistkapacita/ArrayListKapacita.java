/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistkapacita;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class ArrayListKapacita {
    public static final int POKUS = 10000000;
    static long zac;
    static long kon;
    
    public static void main(String[] args) {        
        ArrayList<Integer> ar = new ArrayList<>();
        zac = System.currentTimeMillis();
        for(int i = 0; i< POKUS; i++) {
            ar.add(new Integer(i));
        }
        kon = System.currentTimeMillis();
        System.out.println("Trvání bez kapacity: " + (kon - zac) + " [msec]");
        
        ar = null;
        System.gc();
        
        ArrayList<Integer> ar2 = new ArrayList<>(POKUS);
        zac = System.currentTimeMillis();
        for(int i = 0; i< POKUS; i++) {
            ar2.add(new Integer(i));
        }
        kon = System.currentTimeMillis();
        System.out.println("Trvání s plnou kapacitou: " + (kon - zac) + " [msec]");
    }
       
}
