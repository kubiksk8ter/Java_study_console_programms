/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poznamkovac;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class Poznamkovac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    Diar diar = new Diar();
    String volba = "";
    // hlavní cyklus
    while (!volba.equals("4")) {
        diar.vypisUvodniObrazovku();
        System.out.println();
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat záznam");
        System.out.println("2 - Vyhledat záznamy");
        System.out.println("3 - Vymazat záznam");
        System.out.println("4 - Konec");
        volba = sc.nextLine();
        System.out.println();
        // reakce na volbu
        switch (volba) {
            case "1":
                diar.pridejZaznam();
                break;
            case "2":
                diar.vyhledejZaznam();
                break;
            case "3":
                diar.vymazZaznamy();
                break;
            case "4":
                System.out.println("Libovolnou klávesou ukončíte program...");
                break;
            default:
                System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                break;
            }
        
        }
        
    }
    
}
