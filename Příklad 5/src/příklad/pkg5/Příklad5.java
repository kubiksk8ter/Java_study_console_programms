/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg5;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte delší slovo:");
        String delsi = sc.nextLine();
        delsi = delsi.trim();
        System.out.println("Zadejte kratší slovo:");
        String kratsi = sc.nextLine();
        kratsi = kratsi.trim();
        int a = delsi.length() - kratsi.length();
        System.out.printf("Slova se liší délkou o %d znaků",a );
        
    }
    
}
