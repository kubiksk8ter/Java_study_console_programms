/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papousek;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Papousek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zdarec, jsem virtuální papoušek a rád opakuji!");
        System.out.println("Napiš něco: ");
        String vstup;
        vstup = sc.nextLine();
        String vystup;
        vystup = vstup + "," + vstup + "!";
        System.out.println(vystup);
    }
    
}
