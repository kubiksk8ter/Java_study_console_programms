/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cykluscisel;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class CyklusCisel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program načítá čísla, poté vypíše počet čísel v intervalu 18-32.");
        System.out.print("Zadej kolik čísel budeš zadávat: ");
        int n = sc.nextInt();
        int pocet = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Zadej "+(i+1)+". číslo: ");
            int j = sc.nextInt();
            if((j>17)&&(j<33)){
                pocet++;            
            }
        }
        System.out.println("Počet čísel v intervalu 18-32 je "+pocet);
        
    }
    
}
