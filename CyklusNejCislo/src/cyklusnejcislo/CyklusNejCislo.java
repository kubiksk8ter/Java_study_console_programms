/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyklusnejcislo;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class CyklusNejCislo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program načítá čísla dokud se nezadá 0, poté vypíše číslo s nejvetší hodnotou.");
        int i=0;
        int zadane = 1;
        while(zadane != 0){
            System.out.print("Zadej číslo: ");
            zadane = sc.nextInt();
            if(zadane>i){
                i=zadane;
            }
        }
        System.out.println("Největší zadané číslo je: " + i);
        
    }
    
}
