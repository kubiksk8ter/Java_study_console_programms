/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdelenicisla2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class RozdeleniCisla2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program přečte celé číslo a rozdělí ho mezerami.");
        System.out.print("Zadej číslo: ");
        long l = sc.nextLong();
        System.out.println(rozdelCislo(l));
        
    }
    static String rozdelCislo(long l){
        String cislo = "";
        long a = 0;
        long b = l;
        while(b!=0){
            a = b%10;
            cislo += a;
            b = b/10;
        }
        String cislo2 = "";
        for(int i=cislo.length()-1;i>-1;i--){
            cislo2 += cislo.charAt(i)+"  ";
        }
        return cislo2;
    }
}
