/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad.pkg35.arraylist;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author kuba
 */
public class Priklad35ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        ArrayList<String> slova = new ArrayList<>();
        
        
        String slovo = "";
        while(!slovo.equals("konec")){
            System.out.print("Zadej slovo: ");
            slovo = sc.nextLine();
            
            if(!slova.contains(slovo)){
                slova.add(slovo);
            }
                        
            if(slovo.equals("konec")){
                String vypis = "";
                vypis += slova.toString().replace("[", "").replace("]", "").replace(", konec", "").toLowerCase();
                System.out.println("Zadal jsi tato slova: "+ vypis);
            }
        }

    }
    
}
