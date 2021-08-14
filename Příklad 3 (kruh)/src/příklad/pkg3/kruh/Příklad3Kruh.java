/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg3.kruh;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad3Kruh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej poloměr kruhu (cm): ");
        float r = Float.parseFloat(sc.nextLine());
        float Pi = (float) 3.1415;
        float o = 2*Pi*r ;
        float p = Pi*r*r;
        System.out.println("Obvod zadaného kruhu je:  " + o + " cm");
        System.out.println("Jeho obsah je: " + p + " cm^2");
        
    }
    
}
