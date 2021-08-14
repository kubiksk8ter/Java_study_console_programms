/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg7;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej své jméno:");
        String jmeno = sc.nextLine();
        int a = jmeno.length();
        if ((a>3)&&(a<10))
           { System.out.println("Normální jméno.");
           }
        else {System.out.println("Máš moc krátké nebo moc dlouhé jméno!");
        }
        
                
              
    }
    
}
