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
class SeradPodleVahy implements Comparator<Osoba> {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return (int) (o1.vaha - o2.vaha);
        }        
    }
