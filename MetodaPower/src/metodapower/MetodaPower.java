/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodapower;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class MetodaPower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program pomocí metody power vypíše tabulku mocnin x od 1 do n.");
        System.out.print("Zadej číslo, které chceš mocnit: ");
        double x = sc.nextDouble();
        System.out.print("Zadej mocninu: ");
        int n = sc.nextInt();
        System.out.println("");
        power(x,n);
        
    }
    static void power(double x, int n) {
            for(int i = 1; i <= n; i++){
                System.out.format("%f^%d = %f\n",x,i,(Math.pow(x, i)));
            }
        }
}
