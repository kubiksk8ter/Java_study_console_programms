/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eulerovocislo;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class EulerovoCislo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vypočítá eulerovo číslo s přesností 10 na -7.");
        double e=1;
        double f=1;
        for ( int i=1; i <= 10000000; i++) {
           f = f * (1.0 / i);
           if ( f == 0 ) break;
           e +=  f;
        }
        System.out.println(e);
    }
    
}
