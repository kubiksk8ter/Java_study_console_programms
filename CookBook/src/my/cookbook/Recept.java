/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.cookbook;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Jakub
 */
public class Recept implements java.io.Serializable {
    private String nazev, popis;
    private HashSet<String[]> ingredienceDB = new HashSet<>();

    /**
     *
     * @param nazev
     */
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    /**
     *
     * @param popis
     */
    public void setPopis(String popis) {
        this.popis = popis;
    }

    /**
     * Nastaví název a množství jednotlivé ingredience
     * @param nazevIng
     * @param mnozstviIng
     */
    public void setIngredience(String nazevIng, String mnozstviIng) {
        if(!nazevIng.equals("")){
            String[] ingredience = new String[2];
            ingredience[0] = nazevIng; ingredience[1] = mnozstviIng;
            ingredienceDB.add(ingredience);
        }
    }
        
    /**
     *
     * @return název receptu
     */
    public String getNazev() {
        return nazev;
    }

    /**
     *
     * @return popis receptu
     */
    public String getPopis() {
        return popis;
    }

    /**
     *
     * @return název a množství všech ingrediencí
     */
    public String IngredienceToString() {
        String s = "[";
        for(String[] field : ingredienceDB) {
            s += "[";           
            for(String text : field) {
                s += text + " ";
            }
            s += "]";
        }
        s += "]";
        return s;        
    }
    
    /**
     * Vrátí buď název, nebo množství ingredience. Jako parametr bere
     * pořadí v kolekci ingredienceDB 
     *(lichá = názevIng, sudá = mnozstviIng).
     * @param pocet
     * @return název, nebo množství ingredience 
     */
    public String getIngredience(int pocet) {
        String ingredience; int i = 0;
        for(String[]ing : ingredienceDB) {
            for(String s : ing) {                                              
                if(i == pocet) {
                    i++;
                    ingredience = s;
                    //Test System.out.println(ingredience + " " + i);
                    return ingredience;
                }
                i++;
            }
        }        
        return null;       
    }
    
    /**
     *
     * @return názvy všech ingrediencí uložené do kolekce
     */
    public ArrayList<String> getNazvyIng() {
        ArrayList<String> nazvy = new ArrayList<String>();
        for(String[] s : ingredienceDB) {
            nazvy.add(s[0]);
        }
        return nazvy;
    }
    
    /**
     *
     * @return všechny ingredience (název i množství) uložené v kolekci
     */
    public HashSet<String[]> getIngredienceDB() {
        return ingredienceDB;
    }             
}
