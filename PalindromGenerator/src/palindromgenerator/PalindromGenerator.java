/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromgenerator;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class PalindromGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program generuje slova z jejich první poloviny zadané z klávesnice.");
        System.out.print("Zadej polovinu slova: ");
        String a = sc.nextLine();
        Palindrom b = new Palindrom(a);
        
        System.out.println("Palindrom: " + b.PalindromGenerator());
    }
    
}
