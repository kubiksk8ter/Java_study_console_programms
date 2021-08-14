/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dešifrování.cš;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class DešifrováníCŠ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Napiš zprávu, kterou chceš dešifrovat:");
        String s = sc.nextLine();
        System.out.printf("Původní zpráva: %s\n", s);
        String zprava = "";
        System.out.println("O kolik chceš zprávu posunout:");
        int posun = Integer.parseInt(sc.nextLine());
        
        for(char c : s.toCharArray()){
            int i = (int)c;
            i -= posun;
            if(i < (int)'a'){
                i += 26;
        }
            char znak = (char)i;
            zprava += znak;
        }
        System.out.printf("Dešifrovaná zpáva: %s\n", zprava);
        
    }
    
}
