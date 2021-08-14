/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucharka;

import java.util.HashSet;

/**
 *
 * @author Jakub
 */
public class Recept implements java.io.Serializable {
    private String nazev, popis;
    private HashSet<String> ingredience = new HashSet<>();    

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public void setIngredience(String text) {
        ingredience.add(text);
    }
        

    public String getNazev() {
        return nazev;
    }

    public String getPopis() {
        return popis;
    }

    public String getIngredience() {
        String s = "[";
        for(String text : ingredience) {
            s += text + ", ";
        }
        s += "]";
        return s;        
    }
    
    
}
