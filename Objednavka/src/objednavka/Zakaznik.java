/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objednavka;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author kuba
 */
public class Zakaznik {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.jmeno);
        hash = 23 * hash + Objects.hashCode(this.prijmeni);
        hash = 23 * hash + Objects.hashCode(this.datumNarozeni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zakaznik other = (Zakaznik) obj;
        if (!Objects.equals(this.jmeno, other.jmeno)) {
            return false;
        }
        if (!Objects.equals(this.prijmeni, other.prijmeni)) {
            return false;
        }
        if (!Objects.equals(this.datumNarozeni, other.datumNarozeni)) {
            return false;
        }
        return true;
    }
    public String jmeno;
    public String prijmeni;
    public LocalDate datumNarozeni;

    public Zakaznik(String jmeno, String prijmeni, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }

}
