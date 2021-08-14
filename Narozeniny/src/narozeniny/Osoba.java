/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narozeniny;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class Osoba {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    private LocalDate datumNarozeni;
    private int dny2;//dny do dalších narozenin  
   
    /**
     * @param datumNarozeni the datumNarozeni to set
     */
    public void setDatumNarozeni() {        
        System.out.println("Zadej datum narození:");
        datumNarozeni = LocalDate.parse((sc.nextLine()),DateTimeFormatter.ofPattern("d.M.y"));
        
    }

    /**
     * @return the datumNarozeni
     */
    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
        
    }
    
    public String zjistiVek(){
        Period doba = Period.between(datumNarozeni, LocalDate.now());//doba mezi datumem narození a teď
        LocalDate pristi = datumNarozeni.plusYears(doba.getYears()+1);//další narozky
        Period dobado = Period.between(LocalDate.now(), pristi);//doba mezi teď a dalšími narozeninamy
        
        //Cyklus pro výpočet dní do dalších narozenin
        dny2 = 0+dobado.getDays();
        for(int i = 0; i<dobado.getMonths();i++){
            Period dny = Period.between(LocalDate.now().plusMonths(i), (LocalDate.now().plusMonths(i+1).minusDays(1)));
            dny2 += dny.getDays()+1;            
        }
        return String.format("Je ti %s let a příští narozky máš za %s dní.", doba.getYears(),dny2);
    }       
}
