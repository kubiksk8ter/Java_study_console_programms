/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecislopretizeni;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class ECisloPretizeni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program vypočítá e pomocí dvou metod.");
        System.out.println("e s přesností 10^-7: " + vypoctiE());
        System.out.print("Zadej přesnost pro výpočet e: ");
        double presnost = sc.nextDouble();
        System.out.println(vypoctiE(presnost));
        
        
    }
    static double vypoctiE(){
        double e=1;
        double f=1;
        for ( int i=1; i <= 10000000; i++) {
           f = f * (1.0 / i);
           if ( f == 0 ) break;
           e +=  f;
        }
        return e;
    }
    static double vypoctiE(double presnost){
        double e=1;
        double f=1;
        for ( int i=1; i <= presnost; i++) {
           f = f * (1.0 / i);
           if ( f == 0 ) break;
           e +=  f;
        }       
        return e;
    }
}
