/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Pole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        int[] pole = new int[10];
        pole[0] = 1;
        for (int i=0;i<10;i++){
           pole[i]=i+1;
        }
        for (int i: pole){
            System.out.print(i+ " ");
        }
        System.out.println(" ");
        String[] simpsnovi = {"Homer","Marge","Bart","Lisa","Maggie"};
        Arrays.sort(simpsnovi);
        for(String s:simpsnovi){
            System.out.print(s+" ");
        }
        System.out.println("");
        System.out.println("Zadej Simpsna (z rodiny Simpsnů): ");
        String simpson = sc.nextLine();
        int pozice = Arrays.binarySearch(simpsnovi, simpson);
        if (pozice >= 0)
            System.out.print("Jo, to je Simpson!");
        else
            System.out.print("Hele, tohle není Simpson!");
        System.out.println(" ");
        int[] pole2 = {2,3,1};
        Arrays.sort(pole2);
        for(int a : pole2){
            System.out.print(a+" ");
        }
            
        
        
        
        
    
    
}
}    
