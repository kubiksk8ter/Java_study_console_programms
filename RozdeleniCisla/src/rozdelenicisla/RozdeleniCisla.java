/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdelenicisla;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class RozdeleniCisla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program načte trojciferné celé číslo a rozdělí ho mezerami.");
        System.out.print("Zadej trojciferné číslo: ");
        int i = sc.nextInt();
        if((i<100)||(i>1000)){
            System.out.println("Není trojcifermé číslo.");
            return;
        }
        
        double i1 = Math.floor(i/100);
        double i2 = Math.floor((i-(i1*100))/10);
        double i3 = i-(i1*100)-(i2*10);
        
        
        System.out.format("%d  %d  %d\n",(int)i1,(int)i2,(int)i3);
    }
    
}
