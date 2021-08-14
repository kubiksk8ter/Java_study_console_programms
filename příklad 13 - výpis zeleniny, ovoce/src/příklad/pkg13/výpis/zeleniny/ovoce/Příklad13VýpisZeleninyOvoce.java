/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg13.výpis.zeleniny.ovoce;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author kuba
 */
public class Příklad13VýpisZeleninyOvoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        String[] ovoce = { "jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};
        Arrays.sort(ovoce);
        String[] zelenina = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
        Arrays.sort(zelenina);
        
        int pocet = 0;
        String pokracovat="ano";
        while(pokracovat.equals("ano")){
        System.out.println("Zadej název libovonlného ovoce nebo zeleniny:");
        String x = sc.nextLine();
        x=x.toLowerCase();
        int ovoce1 = Arrays.binarySearch(ovoce, x);
        int zelenina1 =Arrays.binarySearch(zelenina, x);
        if (ovoce1>=0)
            System.out.println("Zadal jsi ovoce");
        else if (zelenina1>=0)
            System.out.println("Zadal jsi zeleninu");
        else 
            System.out.println("Tvoje slovo nemám v seznamu");
        System.out.println("Přeješ si zadat další slovo? (ano/ne)");
        pokracovat = sc.nextLine().toLowerCase();
        pocet++;
        }
        System.out.println("Zadal jsi " + pocet + " slov");
        }
    }
    

