/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayequalszakladni;

import java.util.Arrays;

/**
 *
 * @author kuba
 */
public class ArrayEqualsZakladni {

    final static int POCET = 10;
    
    public static void main(String[] args) {
        int[] pole1 = new int[POCET];
        int[] pole2 = new int[POCET * 2];
        int[] pole3 = new int[POCET];
        
        for(int i = 0; i < pole1.length; i++) {
            pole1[i] = i;
        }
        
        System.arraycopy(pole1, 0, pole2, 0, pole1.length);
        System.arraycopy(pole1, 0, pole3, 0, pole1.length);
        
        System.out.println("Pole 1 a 2 se rovnají? " + Arrays.equals(pole1, pole2));
        System.out.println("Pole 1 a 3 se rovnají? " + Arrays.equals(pole1, pole3));
        
        System.out.println("Změna prvku pole3");
        pole3[3] = 123;
        
        System.out.println("Pole 1 a 3 se rovnají? " + Arrays.equals(pole1, pole3));
    }    
}
