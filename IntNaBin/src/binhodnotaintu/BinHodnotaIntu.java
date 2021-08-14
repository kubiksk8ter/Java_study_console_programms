/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binhodnotaintu;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class BinHodnotaIntu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program přečte číslo a převede ho na binární hodnotu.");
        System.out.print("Zadej číslo: ");
        int i = sc.nextInt();
        System.out.format("Zadané číslo převedené do binární soustavy: \n%s\n", intNaBin(i));
    }
    
    static String intNaBin(int i){
        int j = i;
        String s = "";
        while(j != 0){
            s += j%2;
            j = j/2;
        }
        String s2 = "";
        for(int k=s.length()-1; k>-1;k--){
            s2 += s.charAt(k);
        }
        return s2;
    }
}
