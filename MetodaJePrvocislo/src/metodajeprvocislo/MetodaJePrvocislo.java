/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodajeprvocislo;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class MetodaJePrvocislo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program zjistí, zda zadané číslo je prvočíslo.");
        System.out.print("Zadej číslo: ");
        int i = 0;
        try{
        i = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Špatně zadané číslo!\n");
        }
        if(jePrvocislo(i)==true){
            System.out.format("Číslo %d je prvočíslo.\n", i);
        }else{
            System.out.format("Číslo %d není prvočíslo.\n", i);
        }
    }
    static boolean jePrvocislo(int p) {
        int k = 0;
        for(int i = 1; i <= p ; i++){
            if((p%i)==0){
                k++;
            }
        }
        if(k==2){
            return true;
        }
        else{
            return false;
        }
    }            
}
