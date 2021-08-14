/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pouzitipriorityqueue;

/**
 *
 * @author kuba
 */
public class Vojak implements Comparable<Vojak> {
    private int pocetHvezdicek;
    private String hodnost;
    private String typVojaka;

    public Vojak(int pocetHvezdicek, String hodnost, String typVojaka) {
        this.pocetHvezdicek = pocetHvezdicek;
        this.hodnost = hodnost;
        this.typVojaka = typVojaka;
    }

    @Override
    public int compareTo(Vojak o) {
        return o.pocetHvezdicek - this.pocetHvezdicek;
    }

    @Override
    public String toString() {
        return "\n" + pocetHvezdicek + " " + hodnost + " " + typVojaka;
    }   
}
