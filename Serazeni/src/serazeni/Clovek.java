/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serazeni;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Random;


/**
 *
 * @author kuba
 */
public abstract class Clovek implements Comparable<Clovek>
{
    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;   

    public Clovek(String jmeno, String prijmeni, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }

    @Override
    public int compareTo(Clovek o){
        if(jmeno.equals(o.jmeno)){
            return o.datumNarozeni.compareTo(datumNarozeni);
        }
        else{
            return o.jmeno.compareTo(jmeno);
        }
    }

    public Clovek plus(Clovek other){
        Clovek dite;
        Random random = new Random();
        int r = random.nextInt(2);
        if(this.getClass().equals(other.getClass())){
            return null;
        }
        else if(r == 1){
            return dite = new Zena("Eva", other.prijmeni, LocalDate.now());
        }
        else{
            return dite = new Muz("Adam", this.prijmeni, LocalDate.now());
        }
        
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s", jmeno, prijmeni, datumNarozeni.format(DateTimeFormatter.ofPattern("yyy")));
    }
    
    
    
    
}
