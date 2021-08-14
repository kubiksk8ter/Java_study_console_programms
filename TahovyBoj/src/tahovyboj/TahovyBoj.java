/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;

/**
 *
 * @author kuba
 */
public class TahovyBoj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vytvoření objektů
        Kostka kostka = new Kostka(10);
        Bojovnik bojovnik1 = new Bojovnik("Kubikson",100,20,10,kostka);
        Bojovnik bojovnik2 = new Mag("Brutalitson",60,18,15,kostka,30,45);
        Arena arena = new Arena(bojovnik1,bojovnik2,kostka);
        //Zápas
        arena.zapas();
        

    }    
}
