/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocetdesetinnychmist;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class PocetDesetinnychMist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Na kolik desetinných míst chceš vyjádřit číslo Pí: ");
        int desetMist = sc.nextInt();
        tiskPI(desetMist);
        
    }
    static void tiskPI(int desetMist){
        String s = String.valueOf(Math.PI);
        int i = s.indexOf('.');
        s = s.substring(0, i+1+desetMist);
        System.out.println(s);
    }
    
}
