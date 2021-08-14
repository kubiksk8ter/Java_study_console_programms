/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysidealcomparator;

import java.util.Comparator;

/**
 *
 * @author kuba
 */
public class PorOsoba implements Comparable<PorOsoba> {
    int vyska;
    double vaha;
    String popis;

    public PorOsoba(int vyska, double vaha, String popis) {
        this.vyska = vyska;
        this.vaha = vaha;
        this.popis = popis;
    }
    
    @Override
    public int compareTo(PorOsoba os) {
        return this.vyska - os.vyska;
    }
    
    @Override
    public String toString() {
        return "vy = " + vyska + ", va = " + vaha + ", " + popis + "\n";
    }
    
    public static final Comparator<PorOsoba> PODLE_VYSKY = new Comparator<PorOsoba>() {
        @Override
        public int compare(PorOsoba os1, PorOsoba os2) {
            return os1.vyska - os2.vyska;
        }
    };
    
    public static final Comparator<PorOsoba> PODLE_VAHY = new Comparator<PorOsoba>() {
        @Override
        public int compare(PorOsoba os1, PorOsoba os2) {
            return (int)(os1.vaha - os2.vaha);
        }
    };
    
    public static final Comparator<PorOsoba> PODLE_POPISU = new Comparator<PorOsoba>() {
        @Override
        public int compare(PorOsoba os1, PorOsoba os2) {
            return os1.popis.compareTo(os2.popis);
        }
    };    
}
