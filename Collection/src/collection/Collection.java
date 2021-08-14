/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author kuba
 */
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList al2 = new ArrayList();
        al2.add(2);
        al.add(1);
        al.add(2);
        al.add("tři");
        al.add("tři");
        System.out.println(al);
        
        System.out.println(al.retainAll(al2));
        System.out.println(al);
    }    
}
