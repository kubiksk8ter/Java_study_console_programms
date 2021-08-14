/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg12.meze;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad12Meze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte levou mez 1. intervalu:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte pravou mez 1. intervalu:");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte levou mez 2. intervalu:");
        int c = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte pravou mez 2. intervalu:");
        int d = Integer.parseInt(sc.nextLine());
        System.out.println("Dvojice čísel, jejichž součet leží v některém z intervalů:");
        System.out.println("(1. číslo je z prvního intervalu a 2. z druhého intervalu)");
        for (int y=a ; y<=b ; y++){ 
             for(int z=c ; z<=d ; z++){
                 int k =y+z;
                 if (((k>=a)&&(k<=b))||((k>=c)&&(k<=d)))
                    System.out.print("["+y+","+z+"], ");
                    else{}
                         System.out.println("");
}
}
}
}