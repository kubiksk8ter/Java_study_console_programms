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
public class Ctverec implements Zobrazitelny{
    private final int strana;

    public Ctverec(int strana) {
        this.strana = strana;
    }

    @Override
    public void zobraz() {
        System.out.println("");
        for(int y = 0; y<getStrana();y++){
            for(int x = 0; x<getStrana(); x++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    /**
     * @return the vyska
     */
    public int getStrana() {
        return strana;
    }

    
    
}
