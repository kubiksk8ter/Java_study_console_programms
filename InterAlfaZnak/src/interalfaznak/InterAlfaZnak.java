/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interalfaznak;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class InterAlfaZnak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program přečte znak a vypíše, jestli je interpunkční, nebo alfanumerický.");
        System.out.print("Zadejte znak: ");
        char c = sc.nextLine().charAt(0);
        System.out.println((int)c);
        if(((int)c>=48&&(int)c<=57)||
           ((int)c>=65&&(int)c<=90)||
           ((int)c>=97&&(int)c<=122)){
            System.out.println("Alfanumerický znak");
        }
        else{
            System.out.println("Interpunkční znak");
        }
    }
    
}
