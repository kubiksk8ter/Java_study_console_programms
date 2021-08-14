/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrascisly;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class HraSCisly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program načte 3 celá čísla a vypíše jejich součet, součin, průměr a nejvetší a nejmenší číslo.");
        System.out.print("Zadej první číslo: ");
        int a = sc.nextInt();
        System.out.print("Zadej první číslo: ");
        int b = sc.nextInt();
        System.out.print("Zadej první číslo: ");
        int c = sc.nextInt();
        System.out.println();
        System.out.format("Součet: %d%n", (a+b+c));
        System.out.format("Součin: %d%n", (a*b*c));
        System.out.format("Průměr: %d%n", ((a+b+c)/3));
        //Největší číslo
        if((a>b)&&(a>c)){
            System.out.println("Největší číslo je: " + a);            
        }
        if((b>a)&&(b>c)){
            System.out.println("Největší číslo je: " + b);            
        }
        if((c>b)&&(c>a)){
            System.out.println("Největší číslo je: " + c);            
        }        
        //Nejmenší číslo
        if((a<b)&&(a<c)){
            System.out.println("Nejmenší číslo je: " + a);            
        }
        if((b<a)&&(b<c)){
            System.out.println("Nejmenší číslo je: " + b);            
        }
        if((c<b)&&(c<a)){
            System.out.println("Nejmenší číslo je: " + c);            
        }
    }
    
}
