/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexadecimalnikonstanta;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class HexadecimalniKonstanta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte znaky 0-9 a A-F a program vypíše hexadecimální hodnotu těchto znaků dekadicky.");
        //Zadání čísla
        System.out.print("Zadej číslo od 0-9: ");        
        byte i;
        try{          
          while(true){
            i = sc.nextByte();
            if((i>9)||(i<0)){
              System.out.print("Špatně zadané číslo. Zadej ho znovu: ");            
            }
            else{
                break;
            }
          }
        }
        catch(Exception e){
            System.out.println("Není číslo!");
            return;
        }
        //Zadání písmena
        System.out.print("Zadej znak od A do F: ");
        char c;               
        while(true){
            c = sc.next().charAt(0);
            int z = (int)c;
            if((z<65)||(z>70)){
                System.out.print("Špatně zadané písmeno. Zadej ho znovu: ");
            }
            else{
                break;
            }
        }
        double a = (i*(Math.pow(16, 1))+(((int)c)-55)*(Math.pow(16, 0)));
        System.out.println("Hexadecimální hodnota čísla 0x"+(i)+(c)+" je: "+a);
        
    }
    
}
