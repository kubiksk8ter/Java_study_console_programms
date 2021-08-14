/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package výpočet.norem;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class VýpočetNorem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    
    //DATABÁZE MOTORŮ
    Motor a = new Motor("1014026", 9);

    
    //Inicializace počtu pracovníků
    System.out.print("Zadej počet pracovníků na směně: ");
    int pocetPrac = Integer.parseInt(sc.nextLine());
    
    //POMOCNÉ INTEGERY
    //čas všech seríí
    int casSerii = 0;
    //čas směny
    int casSmeny = (420*pocetPrac); 
    
    //HLAVNÍ CYKLUS
    while(casSmeny > 0){
        System.out.print("Zadej typ motoru: \n");
        
        Motor motor = a;
       
        
        System.out.print("Zadej počet motorů v serii: ");
        int pocetMotoru = Integer.parseInt(sc.nextLine());
        Norma casSerie = new Norma(pocetMotoru, motor);
        casSerii = casSerie.casSerie();
        if(casSmeny>casSerii){
            casSmeny -= casSerii;
            }
        else{
            double vysledek = Math.ceil(casSmeny/a.cas);
            System.out.printf("Z této série je nutno udělat %s motorů\n",vysledek);
            System.exit(0);
        }
        System.out.print("Čas serie je: " + casSerie);
        
        }    
    }
    
}
