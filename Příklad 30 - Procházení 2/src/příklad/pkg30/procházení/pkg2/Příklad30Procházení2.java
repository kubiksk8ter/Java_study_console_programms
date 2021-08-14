/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg30.procházení.pkg2;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class Příklad30Procházení2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
                         
        Hra pozice = new Hra();
        
        pozice.pozice1(); 
        pozice.pozice2();
        
    }
    
}
