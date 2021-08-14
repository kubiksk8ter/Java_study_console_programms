/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocninarekurze;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class MocninaRekurze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program vypočítá mocninu pomocí rekurzivní metody.");
        System.out.print("Zadej základ mocniny: ");
        double x = sc.nextDouble();
        System.out.print("Zadej exponent: ");
        int n = sc.nextInt();
        System.out.format("Výsledek %f^%d je %f\n",x,n,mocnina(x,n));
    }
        static double mocnina(double x, int n){
          if(n>1){
            return x*mocnina(x,n-1);
        }
          else{
            return x;
        }
    }
}
