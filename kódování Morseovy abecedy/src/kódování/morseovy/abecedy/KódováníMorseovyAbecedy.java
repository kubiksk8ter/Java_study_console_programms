/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kódování.morseovy.abecedy;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class KódováníMorseovyAbecedy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte zprávu k zakódování:");
        String s = sc.nextLine().toLowerCase();
        String zprava = "";
        
        String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz";
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
"..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
"...-", ".--", "-..-", "-.--", "--.."};
        String znaky = " ";
        for(int i=0;i<s.length();i++){
            for(int y=0;y<abecedniZnaky.length();y++){
                if(s.charAt(i)==abecedniZnaky.charAt(y)){
                    znaky+=morseovyZnaky[y]+" ";
                }
            }           
        }
        System.out.println("Zakódovaná zpráva: " + znaky);
    }
}    
                    
        
         
        
    
    

