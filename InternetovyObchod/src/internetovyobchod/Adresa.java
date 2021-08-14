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
public class Adresa {
    private String nazevUlice;
    private int cisloPopisne;
    private int cisloOrientacni;
    private String mesto;
    private String PSC;
    private String stat;
    
    public Adresa(String nazevUlice, int cisloPopisne, int cisloOrientacni, String mesto, String PSC, String stat){
        this.nazevUlice = nazevUlice;
        this.cisloPopisne = cisloPopisne;
        this.cisloOrientacni = cisloOrientacni;
        this.mesto = mesto;
        this.PSC = PSC;
        this.stat = stat;
    }

    /**
     * @return the nazevUlice
     */
    public String getNazevUlice() {
        return nazevUlice;
    }

    /**
     * @param nazevUlice the nazevUlice to set
     */
    public void setNazevUlice(String nazevUlice) {
        this.nazevUlice = nazevUlice;
    }

    /**
     * @return the cisloPopisne
     */
    public int getCisloPopisne() {
        return cisloPopisne;
    }

    /**
     * @param cisloPopisne the cisloPopisne to set
     */
    public void setCisloPopisne(int cisloPopisne) {
        this.cisloPopisne = cisloPopisne;
    }

    /**
     * @return the cisloOrientacni
     */
    public int getCisloOrientacni() {
        return cisloOrientacni;
    }

    /**
     * @param cisloOrientacni the cisloOrientacni to set
     */
    public void setCisloOrientacni(int cisloOrientacni) {
        this.cisloOrientacni = cisloOrientacni;
    }

    /**
     * @return the mesto
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * @param mesto the mesto to set
     */
    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    /**
     * @return the PSC
     */
    public String getPSC() {
        return PSC;
    }

    /**
     * @param PSC the PSC to set
     */
    public void setPSC(String PSC) {
        this.PSC = PSC;
    }

    /**
     * @return the stat
     */
    public String getStat() {
        return stat;
    }

    /**
     * @param stat the stat to set
     */
    public void setStat(String stat) {
        this.stat = stat;
    }
}
