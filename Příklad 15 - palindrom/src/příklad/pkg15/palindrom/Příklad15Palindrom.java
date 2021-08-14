/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg15.palindrom;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad15Palindrom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej palindrom:");
        String p = sc.nextLine();

        String pozpatku = "";
        
        for(int i=p.length()-1;i>-1;i--){
                pozpatku+=p.charAt(i);
            }        
        if(p.equals(pozpatku)){
            System.out.println("Ano, toto je palindrom.");
        }
        else{
            System.out.println("Toto není palindrom.");
        }
    }
    
}
