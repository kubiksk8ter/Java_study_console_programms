/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekodér.morseovy.abecedy;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class DekodérMorseovyAbecedy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej kódovanou zprávu:");
        String s = sc.nextLine().toLowerCase();
        String zprava = "";
        
        String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz";
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
"..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
"...-", ".--", "-..-", "-.--", "--.."};
        String[] znaky = s.split(" ");
        for(String morseuvZnak : znaky) {
            char abecedniZnak = '?';
            
            int index = -1;
            for(int i=0;i<morseovyZnaky.length;i++){
               if(morseovyZnaky[i].equals(morseuvZnak))
                   index = i;
        }
               if(index >=0) {
                   abecedniZnak=abecedniZnaky.charAt(index);
               }
           zprava += abecedniZnak;
        }
        System.out.println("Dekódovaná zpráva: " + zprava);
    }
    
}
