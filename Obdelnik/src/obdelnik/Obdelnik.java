/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obdelnik;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class Obdelnik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program podle zadané šířky a dělky vykreslí obdelník.");
        System.out.print("Zadej délku: ");
        int a = sc.nextInt();
        System.out.print("Zadej šířku: ");
        int b = sc.nextInt();
        
        for(int i = 0;i<b;i++){
            System.out.println("");
            for(int j = 0;j<=a;j++){
                
                if((i==0)||(i==(b-1))||(j==0)||(j==(a-1))){
                    System.out.print("█");
                }
                else{
                    System.out.print("  ");
                }                                                
            }
            
        }        
            
    }
    
}
