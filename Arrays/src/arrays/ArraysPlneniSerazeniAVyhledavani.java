/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Arrays;

/**
 *
 * @author kuba
 */
public class ArraysPlneniSerazeniAVyhledavani {
    int POCET = 5;
    
    public void vypisPole(int[] pole) {
        for(int i = 0; i < pole.length; i++) {
            System.out.print("[" + i + "]=" + pole[i] + ", ");
        }
        System.out.println();
    }
    public void najdi(int[] pole, int hodnota) {
        int k = Arrays.binarySearch(pole, hodnota);
        System.out.print("[" + k + "]=" + hodnota);
        if(k < 0) {
            System.out.println("\t[" +  - (k + 1) + "]=" + hodnota);
        }
        else {
            System.out.println();
        }
    }
}
