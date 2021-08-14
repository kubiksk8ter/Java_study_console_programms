/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zdvojnasobovac;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Zdvojnasobovac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte číslo k zdvojnásobení");
        String s = sc.nextLine();
        int a = Integer.parseInt(s);
        a = a * 2;
        System.out.println(a);
    }
    
}
