/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayscomparable;

import java.util.Comparator;

/**
 *
 * @author kuba
 */
class SeradPodlePopisu implements Comparator<Osoba> {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            String s1 = o1.popis;
            String s2 = o2.popis;
            return s1.compareTo(s2);
        }        
    }
