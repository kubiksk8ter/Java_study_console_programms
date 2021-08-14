/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg29.stárnutí;

/**
 *
 * @author kuba
 */
public class Příklad29Stárnutí {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pes Azor = new Pes("Azor", 1);
        
        System.out.print(Azor);
        
        Osoba Karel = new Osoba("Karel",Azor);
        Osoba Lenka = new Osoba("Lenka",Azor);
        
        Karel.pes.zestarni();
        Lenka.pes.zestarni();
        
        System.out.print(Azor);
    }
    
}
