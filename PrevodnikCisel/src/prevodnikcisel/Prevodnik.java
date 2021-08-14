/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevodnikcisel;

/**
 *
 * @author kuba
 */
public class Prevodnik {
    static private String cislo = "";
    
    public Prevodnik(String cislo){
        Prevodnik.cislo = cislo;
    }
    /**
     * Metoda převede čísla(Hex.,Okta. a dec.) do binární soustavy čísel 
     * @return String
     */
    public String prevedDoBin(){
        String vysledek;
        int dek;
        char c = cislo.charAt(0);
        char c2 = cislo.charAt(1);
        //hexadecimální do binární
        if((c == '0')&&((c2 == 'x')||(c2=='X'))){
            vysledek = hexToBin(cislo);
        }
        //oktální do binární
        else if(c == '0'){
            vysledek = oktToBin(cislo);
        }
        //dekadické do binární
        else{
            dek = Integer.parseInt(cislo);
            vysledek = Integer.toBinaryString(dek);
        }
        return vysledek;
    }
    /**
     * Převede Oktální čísla do binární soustavy
     * @return String
     */
    static String oktToBin(String cislo){
        //Otočení oktálního čísla
        String s = otoc(cislo);
        //Převod oktálního číslo do dekadického
        int vysledek = 0;
        String aktCislo = "";
        for(int i = 0;i < s.length()-1 ;i++){
            aktCislo += s.charAt(i);
            int j = Integer.parseInt(aktCislo);
            vysledek += j*(Math.pow(8, i));
            aktCislo = "";
        }
        //Finální převod do binární soustavy
        String binCislo = Integer.toBinaryString(vysledek);
        return binCislo;
    }
    /**
     * Převede hexadecimální číslo do binární sousatavy
     * @param cislo
     * @return String
     */
    static String hexToBin(String cislo){
        cislo = cislo.substring(2);
        String otocene = otoc(cislo);
        //Uložení čísel do pole
        int [] pole = new int[otocene.length()];
        String znak = "";
        for(int i = 0; i < otocene.length(); i++){
            znak += otocene.charAt(i);
            if(Character.isLetter(znak.charAt(0))){
                pole[i] = (int)znak.charAt(0)-55;
            }
            else{
                pole[i] = Integer.parseInt(znak);
            }
            znak = "";
        }
        //přepočet na dekadické číslo
        int dek = 0;
        for(int i = pole.length-1; i>=0; i--){
             dek += pole[i]*Math.pow(16, i);
        }
        //dekadické na binární
        String vysledek = Integer.toBinaryString(dek);
        return vysledek;
    }
    /**
     * Metoda k otočení zadaného čísla
     * @param cislo
     * @return String
     */
    static String otoc(String cislo){
        String s = "";
        for(int i = cislo.length()-1; i >= 0; i--){
            s += cislo.charAt(i);
        }
        return s;
    }
}
