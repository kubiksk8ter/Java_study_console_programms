/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overenivetvi;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class OvereniVetvi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program pomocí cyklu for ověří všechny větve v přepínači.");
        System.out.println("1.: vypíše 1.");
        System.out.println("2.: vypíše 2.");
        System.out.println("3.: vypíše 3.");
        System.out.println("4.: konec");
        int volba =  0;
        for(int i = 1;i<5;i++){
            
            System.out.print("Zadej volbu: ");
            volba = i;
        switch (volba){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                return;
            }
        }        
    }   
}
