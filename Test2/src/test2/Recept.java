/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.HashSet;

/**
 *
 * @author kuba
 */
public class Recept implements java.io.Serializable {
    private String nazev, popis;
    private String[] ingredience;
    private HashSet<String[]> ingredienceDB = new HashSet<>();;    

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public void setIngredience(String nazevIng, String mnozstviIng) {
        ingredience = new String[2];
        ingredience[0] = nazevIng; ingredience[1] = mnozstviIng;
        ingredienceDB.add(ingredience);
    }
        

    public String getNazev() {
        return nazev;
    }

    public String getPopis() {
        return popis;
    }

    public String getIngredience() {
        String s = "[";
        for(String[] field : ingredienceDB) {
            s += "[";
            for(String text : ingredience) {
                s += text + " ";
            }
            s += "]";
        }
        s += "]";
        return s;        
    }
       
}
