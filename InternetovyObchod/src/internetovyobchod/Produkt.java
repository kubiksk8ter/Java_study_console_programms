/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetovyobchod;

/**
 *
 * @author kuba
 */
public class Produkt {
    private String nazev;
    private String popis;
    private int cena;
    
    public Produkt(String nazev, String popis, int cena){
        this.nazev = nazev;
        this.popis = popis;
        this.cena = cena;
    }

    /**
     * @return the nazev
     */
    public String getNazev() {
        return nazev;
    }

    /**
     * @param nazev the nazev to set
     */
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    /**
     * @return the popis
     */
    public String getPopis() {
        return popis;
    }

    /**
     * @param popis the popis to set
     */
    public void setPopis(String popis) {
        this.popis = popis;
    }

    /**
     * @return the cena
     */
    public int getCena() {
        return cena;
    }

    /**
     * @param cena the cena to set
     */
    public void setCena(int cena) {
        this.cena = cena;
    }
    
}
