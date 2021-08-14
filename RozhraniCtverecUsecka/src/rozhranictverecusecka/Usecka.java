/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozhranictverecusecka;

/**
 *
 * @author kuba
 */
public class Usecka implements Zobrazitelny{
    private final int delka;

    public Usecka(int delka) {
        this.delka = delka;
    }

    @Override
    public void zobraz() {
        System.out.println("");
        for(int i = 0; i<delka; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
