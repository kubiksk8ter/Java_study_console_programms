/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bednasnaradim;

/**
 *
 * @author kuba
 */
public abstract class Nastroj {
    private int vaha;
    private String nazev;
    
    public Nastroj(String nazev, int vaha){
        this.nazev = nazev;
        this.vaha = vaha;
    }
    
    abstract String pracuj();

    /**
     * @return the vaha
     */
    public int getVaha() {
        return vaha;
    }

    /**
     * @param vaha the vaha to set
     */
    public void setVaha(int vaha) {
        this.vaha = vaha;
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
    @Override
    public String toString(){
        return String.format("%s", this.getNazev());
    }    
    
}
