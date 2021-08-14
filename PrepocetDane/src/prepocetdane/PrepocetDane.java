/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepocetdane;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class PrepocetDane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program připočítává 25% daň");
        System.out.print("Zadej cenu: ");
        double d = sc.nextDouble();
        System.out.format("Prodejní cena s daní (25%%): %f",(d*1.25));
        
    }
    
}
