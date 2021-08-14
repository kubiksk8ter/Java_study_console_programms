/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorzmenakolekce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;

/**
 *
 * @author kuba
 */
public class IteratorZmenaKolekce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        if(args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        System.out.println(n);
    }    
}
