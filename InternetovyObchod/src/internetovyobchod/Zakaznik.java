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
public class Zakaznik {
    private int pocetObjednavek;
    private String jmeno;
    private String prijmeni;
    
    public Zakaznik(int pocetObjednavek, String jmeno, String prijmeni){
        this.pocetObjednavek = pocetObjednavek;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @return the cisloZakaznika
     */
    public int getPocetObjednavek() {
        return pocetObjednavek;
    }

    /**
     * @param cisloZakaznika the cisloZakaznika to set
     */
    public void setPocetObjednavek(int pocetObjednavek) {
        this.pocetObjednavek = pocetObjednavek;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @param prijmeni the prijmeni to set
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
}
