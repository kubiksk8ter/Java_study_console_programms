/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevodbincislanaint;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class PrevodBinCislaNaInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Převede binární hodnotu čísla na dekadickou.");
        System.out.print("Zadej číslo: ");
        long l = sc.nextLong();
        System.out.println(binNaInt(l));
        
    }
    static double binNaInt(long l){
        String s = "";
        long k = l;
        while(k!=0){
            s += k%10;
            k /= 10;
        }
        double vysledek = 0;
        for(int i = s.length()-1; i>-1; i--){           
            vysledek += (s.charAt(i)-48)*Math.pow(2, i);
            System.out.println(vysledek + "=" + (s.charAt(i)) +"*"+ (Math.pow(2, i)));
        }
        return vysledek;
    }
    
}
