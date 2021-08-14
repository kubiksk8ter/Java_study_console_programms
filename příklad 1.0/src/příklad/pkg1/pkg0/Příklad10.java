/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg1.pkg0;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Ahoj. Jak se jmenuješ?");
        String jmeno = sc.nextLine();
        System.out.println("Jaký jsi?");
        String povaha = sc.nextLine();
        System.out.println(jmeno + " je " + povaha);
     }   
    
}
