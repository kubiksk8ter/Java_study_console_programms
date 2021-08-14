/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayscomparable;


/**
 *
 * @author kuba
 */
class Osoba implements Comparable<Osoba> {
    int vyska;
    double vaha;
    String popis;
    
    public Osoba(int vyska, double vaha, String popis) {
        this.vyska = vyska;
        this.vaha = vaha;
        this.popis = popis;
    }    
    //jednodušší a lepší pro malá čísla
    /* public int compareTo(Osoba os) {
           return this.vyska - os.vyska;
    */   
    @Override
    public int compareTo(Osoba os) {
        if (this.vyska > os.vyska) {
            return +1;
        }
        else if (this.vyska == os.vyska) {
            return 0;
        }
        else {
            return -1;
        }
    }
    @Override
    public String toString() {
        return "vy = " + vyska + ", va = " + vaha + ", " + popis;
    }    
}
    

