/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodokmeny;

/**
 *
 * @author kuba
 */
public class Osoba {
    public String jmeno;
    public Osoba otec;
    public Osoba matka;
    
    public Osoba(String jmeno){
        this.jmeno = jmeno;
    }
    
    public void otec(Osoba otec){
        this.otec = otec;
    }
    
    public void matka(Osoba matka){
        this.matka = matka;
    }
    
    public String vypisRod(){
        String rodokmen = "";
        rodokmen += jmeno + "\n";       
        if(otec != null){  
        rodokmen += otec.vypisRod();
        }
        if(matka != null){  
        rodokmen += matka.vypisRod();
        }
        return rodokmen;
    }
}
