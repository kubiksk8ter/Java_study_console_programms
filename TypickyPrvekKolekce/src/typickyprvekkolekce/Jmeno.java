/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typickyprvekkolekce;

import java.util.Objects;

/**
 *
 * @author kuba
 */
public class Jmeno implements Comparable<Jmeno> {
    private String krestni, prijmeni;
    public Jmeno(String krestni, String prijmeni) {
        if(krestni == null || prijmeni == null) {
            throw new NullPointerException();
        } 
        this.krestni = krestni;
        this.prijmeni = prijmeni;
    }
    public String getKrestni() {
        return krestni;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.krestni);
        hash = 67 * hash + Objects.hashCode(this.prijmeni);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if ((obj instanceof Jmeno) == false) {
            return false; }
        Jmeno j = (Jmeno)obj;
        boolean stejneKrestni = krestni.equals(j.krestni);
        boolean stejnePrijmeni = prijmeni.equals(j.prijmeni);
        return stejneKrestni && stejnePrijmeni;
    }
    @Override
    public String toString() {
        return krestni + " " + prijmeni;
    }
    @Override
    public int compareTo(Jmeno j) {
        int pom = prijmeni.compareTo(j.prijmeni);
        return(pom == 0 ? krestni.compareTo(j.krestni) : pom);
    }    
}
