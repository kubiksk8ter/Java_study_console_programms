/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poznamkovac;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author kuba
 */
public class Databaze {
    private ArrayList<Zaznam> zaznamy;
    
    public Databaze(){
        zaznamy = new ArrayList<>();
    }
    
    public void pridejZaznam(Calendar datumCas, String text){
        zaznamy.add(new Zaznam(datumCas, text));
    }
    
    public ArrayList<Zaznam> najdiZaznamy (Calendar datum, boolean dleCasu){
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for(Zaznam z : zaznamy){
            if(((dleCasu)&&(z.getDatumCas().equals(datum)))//dle data a času
                    ||
            ((!dleCasu)&&//pouze dle data
            (z.getDatumCas().get(Calendar.DAY_OF_MONTH) == datum.get(Calendar.DAY_OF_MONTH)) &&
            (z.getDatumCas().get(Calendar.MONTH) == datum.get(Calendar.MONTH))) &&
            (z.getDatumCas().get(Calendar.YEAR) == datum.get(Calendar.YEAR)))      
            nalezene.add(z);
        }
        return nalezene;
    }
    
    public void vymazZaznam(Calendar datum){
        ArrayList<Zaznam> nalezeno = najdiZaznamy(datum, true);
        for(Zaznam z : nalezeno){
            zaznamy.remove(z);
        }
        
    }
}
