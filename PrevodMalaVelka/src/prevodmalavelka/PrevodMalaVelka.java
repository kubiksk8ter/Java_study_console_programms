/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevodmalavelka;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class PrevodMalaVelka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program převede malá písmena na velká v závislosti na posledním znaku.");
        System.out.println("l(L)převede malá písmena na velká");
        System.out.println("u(U)převede velká písmena na malá");
        System.out.println("x(X)přehodí malá a velká písmena");
        System.out.print("Zadej znakový řetězec: ");
        String s = sc.nextLine();
        Prevodnik vystup = new Prevodnik();
        System.out.println(vystup.preved(s));
    }
    
}
