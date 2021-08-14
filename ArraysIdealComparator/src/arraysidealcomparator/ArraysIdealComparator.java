/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysidealcomparator;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author kuba
 */
public class ArraysIdealComparator {
    static PorOsoba[] poleOsob;

    public static void main(String[] args) {
        poleOsob = new PorOsoba[4];
        poleOsob[0] = new PorOsoba(186, 82.5, "muz");
        poleOsob[1] = new PorOsoba(172, 63.0, "zena");
        poleOsob[2] = new PorOsoba(105, 26.1, "dite");
        poleOsob[3] = new PorOsoba(116, 80.5, "obezni trpasli");
        
        Arrays.sort(poleOsob, PorOsoba.PODLE_VAHY);
        System.out.println("Absolutní řazení podle váhy: \n" + Arrays.asList(poleOsob));
        
        Arrays.sort(poleOsob, PorOsoba.PODLE_POPISU);
        System.out.println("Absolutní řazení podle popisu: \n" + Arrays.asList(poleOsob));
        
        Arrays.sort(poleOsob, PorOsoba.PODLE_VYSKY);
        System.out.println("Absolutní řazení podle výšky: \n" + Arrays.asList(poleOsob));
        
        Arrays.sort(poleOsob, Collections.reverseOrder(PorOsoba.PODLE_VYSKY));
        System.out.println("Absolutní řazení podle výšky sestupně: \n" + Arrays.asList(poleOsob));
    }
    
}
