/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg16.průměr.známek;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad16PrůměrZnámek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Výpočet průměru známek \nZadejte známky oddělené čárkou:");
        String z = sc.nextLine();
       
        
        String[] z1 = z.split(",");
        double z2 = 0;         
        for (String z11 : z1) {
            z2 += Integer.parseInt(z11);
        }
        
        double prumer = z2/z1.length;
        System.out.println("Průměr: " + prumer);
    }
    
}
