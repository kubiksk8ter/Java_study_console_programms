/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicodevdesitkovesoustave;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class UnicodeVDesitkoveSoustave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program načte znak a vypíše jeho unicode hodnotu v desítkové soustavě");
        System.out.print("Zadej znak: ");
        char c = sc.nextLine().charAt(0);
        System.out.format("%c = %d%n",c,((int)c));
    }
    
}
