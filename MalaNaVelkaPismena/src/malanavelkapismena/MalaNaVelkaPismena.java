/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malanavelkapismena;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class MalaNaVelkaPismena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program načte 3 malá písmena a přepíše je na 3 velká písmena");
        System.out.print("Zadej první písmeno: ");
        char a = sc.nextLine().charAt(0);
        System.out.print("Zadej druhé písmeno: ");
        char b = sc.nextLine().charAt(0);
        System.out.print("Zadej třetí písmeno: ");
        char c = sc.nextLine().charAt(0);
        System.out.format("první: %c%n",((int)a)-32);
        System.out.format("druhé: %c%n",((int)b)-32);
        System.out.format("třetí: %c%n",((int)c)-32);
    }
    
}
