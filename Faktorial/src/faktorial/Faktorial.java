/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vypočítá faktorial zadaného čísla.");
        System.out.print("Zadej číslo: ");
        long f = sc.nextLong();
        System.out.format("%d! = %d\n",f,(fakt(f)));
        
    }
    
    public static long fakt(long n) {
        if(n>1){
            return n * fakt(n - 1);
        }
        else{
            return 1;
        }
    }
}
