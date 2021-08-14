/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg17.rozveselovač.textu;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad17RozveselovačTextu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej text k rozveselení:");
        String s = sc.nextLine();
        //Přidání rozdělovače -
        s = s.replace(("."),(".-"));
        s = s.replace(("!"),("!-"));
        s = s.replace(("?"),("?-"));
        String smaj = (":) :D :P");
        //Rozdělení smajlíků
        String[] smaj1 = smaj.split(" ");
        //Rozdělení textu
        String [] s1 = s.split("-");
        
        //posouvač smajlíků
        int p = 0;
        //cyklovac
        int i = 0;
        //rozveselená věta
        String v = "";
        //Hlavní cyklus
        while (i<s1.length){
            v+=s1[i].replace(".", "")+ " "+ smaj1[p];
            i++;
            p++;
            if(p==3){
               p=0; 
            }
            
        }
        System.out.println("Rozveselený text: "+v);

        }    
 
}
