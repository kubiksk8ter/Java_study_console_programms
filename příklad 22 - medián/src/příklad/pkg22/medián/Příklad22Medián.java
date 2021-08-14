/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg22.medián;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author kuba
 */
public class Příklad22Medián {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej počet čísel:");
        int pocet = Integer.parseInt(sc.nextLine());
        int pole[] = new int [pocet];
        float median = 0;
        for(int i = 0; i<=pole.length-1;i++){
            System.out.print("Zadej "+(i+1)+ ". číslo: ");
            pole[i]+=Integer.parseInt(sc.nextLine());
        }
        //duplicita pole
        int pole2[] = new int [pole.length];        
        for(int i = 0;i<pole.length;i++){
            pole2[i]+=pole[i];
        }

        //Cyklus pro lichý počet
        if(pole.length % 2 == 1){
            //seřazení pole
            Arrays.sort(pole);
            median += pole[pole.length/2];
            for(int i =0;i<pole.length;i++){
                System.out.println(pole2[i] + " se od mediánu odchyluje o " + (pole2[i]-median));
            }            
        }
        //Cyklus pro sudý počet
        else{
            Arrays.sort(pole);
            median += pole[pole.length/2];
            for(int i =0;i<pole.length;i++){
                System.out.println(pole2[i] + " se od mediánu odchyluje o " + (pole2[i]-median));
        }
                
    }
    }    
}
