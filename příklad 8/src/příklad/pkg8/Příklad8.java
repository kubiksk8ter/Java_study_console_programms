/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg8;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    System.out.println("Zadej smajlíka:");
    String smajlik = sc.nextLine();
        smajlik = smajlik.trim().toUpperCase();
        smajlik = smajlik.replace("-","");
    switch (smajlik)
    {   case ":)" :
             System.out.println("Tvůj smajlík je veselý");
             break;
            
        case ":(" :   
             System.out.println("Tvůj smajlík je smutný");
             break;
           
        case ":*" :
             System.out.println("Tvůj smajlík je zamilovaný");
             break;
            
        case ":P" :
             System.out.println("Tvůj smajlík je s vyplazeným jazykem");
             break; 
        
        default :
            System.out.println("Tvůj smajlík je neznámý");
          }
       
    
        
        }
      
    
    
}
