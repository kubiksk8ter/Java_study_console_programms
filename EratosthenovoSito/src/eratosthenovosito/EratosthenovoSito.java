/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenovosito;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class EratosthenovoSito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program pomocí eratosthenova síta nalezne všechny prvočísla v rozsahu od 1 do n.");
        System.out.print("Zadejte n: ");
        int n = sc.nextInt();
        int [] poleCisel = new int [n];
        //vyplnění pole čísly
        for(int i = 0; i<n ; i++){
            poleCisel[i] = i+1;
        }
        
        //algoritmus eratosthenova síta
        String prvocisla = "";
        boolean[] cisla;
        cisla = new boolean[n];
                cisla[0] = cisla[1] = true;
                for(int i = 2; i < Math.sqrt(n); i++) {
                        if (cisla[i] == true) continue;
                        for (int j = 2*i; j < n; j += i)
                                cisla[j] = true;
                }
        String str = "";
                for(int i = 2; i < cisla.length; i++) {
                        if (cisla[i] == false)
                                str += i + ", ";
                }        
        System.out.format("Prvočísa v rozsahu od 1 do %d jsou:\n%s",n,str);
    }
    
}
