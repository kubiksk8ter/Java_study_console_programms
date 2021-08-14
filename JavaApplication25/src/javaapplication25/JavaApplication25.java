/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
/**
 *
 * @author kuba
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Programátor se zasekne ve sprše, protože instrukce na šampónu byly: Namydlit, omýt, opakovat.";
        System.out.println(s);
        s = s.toLowerCase();
        
        int pocetSamohlasek = 0;
        int pocetSouhlasek = 0;
        
        String samohlasky = "aeiouyáéěíóúůý";
        String souhlasky = "bcčdďfghjklmnpqrřsštťvwxzž";
        
        for (char c : s.toCharArray()) {
            if (samohlasky.contains(String.valueOf(c))){
                pocetSamohlasek++;
            }
            else if (souhlasky.contains(String.valueOf(c))){
                pocetSouhlasek++;
            }
        }    
        System.out.printf("Samohlásek: %d\n", pocetSamohlasek);
        System.out.printf("Souhlásek: %d\n", pocetSouhlasek);
        System.out.printf("Počet nepísemných znaků: %d\n", s.length() -(pocetSamohlasek + pocetSouhlasek));        
    }
    
}