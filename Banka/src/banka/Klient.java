/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author kuba
 */
public class Klient {
    private final String jmeno;
    private LocalDate datumNarozeni = LocalDate.parse("11.12.1986", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    
    public Klient(String jmeno, LocalDate datumNarozeni){
        this.jmeno = jmeno;
        this.datumNarozeni = datumNarozeni;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }
}
