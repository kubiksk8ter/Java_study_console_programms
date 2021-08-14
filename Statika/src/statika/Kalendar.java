/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statika;

/**
 *
 * @author kuba
 */
class Kalendar {
    
    public String vratNastaveni(){
        String s = "";
        s += String.format("Jazyk: %s\n", Nastaveni.jazyk());
        s += String.format("Barevne schéma: %s\n", Nastaveni.barevneSchema());
        s += String.format("Spustit po staru: %s\n", Nastaveni.spustitPoStartu());
        return s;
    }
    
}
