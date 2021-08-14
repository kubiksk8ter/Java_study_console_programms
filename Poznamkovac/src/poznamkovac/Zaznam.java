/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poznamkovac;

import java.util.Calendar;

/**
 *
 * @author kuba
 */
public class Zaznam {
    private Calendar datumCas;
    private String text;
    
    public Zaznam (Calendar datumCas, String text){
        this.datumCas = datumCas;
        this.text = text;
    }

    /**
     * @return the datumCas
     */
    public Calendar getDatumCas() {
        return datumCas;
    }

    /**
     * @param datumCas the datumCas to set
     */
    public void setDatumCas(Calendar datumCas) {
        this.datumCas = datumCas;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public String toString(){
        return Diar.formatData.format(datumCas.getTime())+" "+text;
    }
}
