/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package losovani;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Losovani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Losovac losovac = new Losovac();
        System.out.println("Tož vitaj v losovačce prde!");
        String volba = "";
        
        while(!(volba.equals("3"))){
            System.out.println("1 - Losovat další číslo");
            System.out.println("2 - Naval numera");
            System.out.println("3 - Zabalto!");
            volba = sc.nextLine();
            
            switch(volba){
                case "1":
                    System.out.printf("Padlo číslo: %s\n", losovac.losuj());
                    break;
                case "2":
                    System.out.printf("Losovaná čísla jsou: %s\n", losovac.Vypis());
                    break;
                case "3":
                    System.out.println("Tož díkes a nazdarec!");
                    break;
                default:
                    System.out.println("Co to mačkáš za kraviny, kurňa! Eště jednůc!");
                    break;                                
            }
        }
    }
    
}
