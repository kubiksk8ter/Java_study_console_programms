/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg4;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in, "Windows-1250");        // TODO code applicatioScanner sc = new Scanner(System.in, "Windows-1250");
System.out.println("Zadej jméno:");
String jmeno = sc.nextLine();
jmeno = jmeno.toUpperCase();
System.out.println("Zadej příjmení:");
String prijmeni = sc.nextLine();
prijmeni = prijmeni.toUpperCase();
System.out.println("Zadej svůj věk:");
int a = Integer.parseInt(sc.nextLine());
int b = a + 1;
System.out.println(jmeno + " " + prijmeni);
System.out.println("Za rok ti bude " + b + " let." );
    }
    
}
