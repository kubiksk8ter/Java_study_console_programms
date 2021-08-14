/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vyhodnocenilogicekehosoucinu;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class VyhodnoceniLogicekehoSoucinu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program vypíše zkrácený i plný logický součin");
        System.out.println("Zadej první číslo: ");
        int a = sc.nextInt();
        System.out.println("Zadej druhé číslo: ");
        int b = sc.nextInt();
        int plny = a & b;
        a &= 0xAA;
        b &= 0xAA;
        System.out.println("Zkrácený bitový součín je " + a + " pro první číslo a " + b + " pro druhé číslo");
        System.out.println("Plný logický součin těchto dvou čísel je " + plny);
        
    }
    
}
