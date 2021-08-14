/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlistiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author kuba
 */
public class TestListIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedSet<String> a = new TreeSet<>();       
        a.add("ahoj");
        a.add("jak");
        a.add("se");
        a.add("mas");
        a.add("?");
        System.out.println(a.subSet("d", "r"));
       
        System.out.println(a);
    }    
}
