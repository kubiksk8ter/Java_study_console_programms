/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevodnikcisel;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class PrevodnikCisel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program převede čísla(Hex.,Okta. a dec.) do binární soustavy čísel.");
        System.out.println("Oktální čísla začínej 0 a hexadecimální 0x, nebo 0X");
        try{
            System.out.print("Zadej číslo: ");        
            String s = sc.nextLine();
        }
        catch(Exception e){
            System.out.println("Špatně zadané čílo!");
        }
        System.out.print("Zadej číslo: ");        
        String s = sc.nextLine();
        Prevodnik p = new Prevodnik(s);
        System.out.println(p.prevedDoBin());
        
    }
    
}
