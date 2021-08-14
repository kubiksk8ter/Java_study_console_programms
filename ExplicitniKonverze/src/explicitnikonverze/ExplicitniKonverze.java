/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicitnikonverze;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class ExplicitniKonverze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program načte znak z konzole a následně vypíše znak s hodnotou o jednu vyšší.");
        System.out.print("zadej znak: ");
        char c = sc.nextLine().charAt(0);
        System.out.format("Zadali jste: %-10cZnak s hodnotou o jednu vyšší je: %c%n",c,((char)((int)c+1)));
    }
    
}
