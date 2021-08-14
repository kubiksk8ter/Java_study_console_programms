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
public class Rodokmeny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Osoba bart = new Osoba("Bart Simpson");
        Osoba homer = new Osoba("Homer Simpson");
        Osoba herb = new Osoba("Herb Powers");
        Osoba abe = new Osoba("Abraham Simpson");
        Osoba penelope = new Osoba("Penelope Olsen");
        Osoba marge = new Osoba("Marge Bouvier");
        Osoba selma = new Osoba("Selma Bouvier");
        Osoba panB = new Osoba("Pan Bouvier");
        Osoba jackie = new Osoba("Jackie Bouvier");
        
        bart.otec(homer);
        bart.matka(marge);
        
        homer.otec(abe);
        homer.matka(penelope);
        
        marge.otec(panB);
        marge.matka(jackie);
        
        System.out.println("Rodokmen pro osobu Bart Simpson \n" + bart.vypisRod());
        System.out.println("Rodokmen pro osobu Homer Simpson \n" + homer.vypisRod());
    }
    
}
