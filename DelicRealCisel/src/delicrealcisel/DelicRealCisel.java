/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delicrealcisel;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class DelicRealCisel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Program vydělí dvě reálná čísla.\nZadej prví číslo: ");
        try{
            int a = Integer.parseInt(sc.next());
            System.out.println("Zadej druhé číslo: ");
            int b = Integer.parseInt(sc.next());
            int vysledek = a/b;
            System.out.println("Výsledek: " + vysledek);
        }catch(Exception e){
            System.out.println("Dělitel je příliš malé číslo.");
        }        
        
    }
    
}
