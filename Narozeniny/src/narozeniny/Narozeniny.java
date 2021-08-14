/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narozeniny;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class Narozeniny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Osoba osoba = new Osoba();
        osoba.setDatumNarozeni();
        System.out.println(osoba.zjistiVek());
        
        
    }
    
}
