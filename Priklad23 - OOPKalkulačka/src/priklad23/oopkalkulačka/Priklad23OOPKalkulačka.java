/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad23.oopkalkulačka;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Priklad23OOPKalkulačka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Kalkulacka cisla = new Kalkulacka();
        System.out.println("Zadej 1. číslo");
        cisla.a = Double.parseDouble(sc.nextLine());
        System.out.println("Zadej 2. číslo");
        cisla.b = Double.parseDouble(sc.nextLine());
        
        cisla.soucet(0);
        cisla.rozdil(0);
        cisla.soucin(0);
        cisla.podil(0);
    }
    
}
