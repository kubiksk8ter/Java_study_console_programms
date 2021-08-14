/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad5;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    System.out.println("Zadej řetězec:");
    String a = sc.nextLine().toLowerCase();
    System.out.println(a.contains("itnetwork"));
    
    
    
    }
    
}
