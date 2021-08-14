/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlschema;

/**
 *
 * @author kuba
 */
public class Ovoce {
    int cislo, jednotkovaCena;
    String nazev;
    double vaha;

    public Ovoce(int cislo, int jednotkovaCena, String nazev, double vaha) {
        this.cislo = cislo;
        this.jednotkovaCena = jednotkovaCena;
        this.nazev = nazev;
        this.vaha = vaha;
    }

    @Override
    public String toString() {
        return "Ovoce{" + "cislo=" + cislo + ", jednotkovaCena=" + jednotkovaCena + ", nazev=" + nazev + ", vaha=" + vaha + '}';
    }
    
    
}
