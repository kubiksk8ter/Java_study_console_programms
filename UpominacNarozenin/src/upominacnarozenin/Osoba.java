/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upominacnarozenin;

import java.util.Calendar;

/**
 *
 * @author kuba
 */
public class Osoba {
    private String jmeno;
    private Calendar narozeniny;
    
    public Osoba(String jmeno, Calendar narozeniny) throws IllegalArgumentException{
        this.jmeno = jmeno;
        this.narozeniny = narozeniny;
        
        Datum.nastavPulnoc(narozeniny);
        if(jmeno.length()<3)
            throw new IllegalArgumentException("Jméno je příliš krátké");
        if(narozeniny.after(Calendar.getInstance()))
            throw new IllegalArgumentException("Datum narození nesmí být v budoucnosti");
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @return the narozeniny
     */
    public Calendar getNarozeniny() {
        return narozeniny;
    }
    
    @Override
    public String toString(){
    return jmeno;
}
}
