/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobserver;

import java.util.Observable;

/**
 *
 * @author kuba
 */
public class Citac extends Observable {
    protected int hodnota;

    public Citac(int hodnota) {
        setHodnota(hodnota);
    }
    
    public void setHodnota(int hodnota) {
        this.hodnota = hodnota;
        setChanged();   // doslo ke změně
        //Změna je reprezentována novým objektem
        notifyObservers(hodnota);
    }
    
    public void plusJedna() {
        setHodnota(++hodnota);
    }
    
    public void minusJedna() {
        setHodnota(--hodnota);
    }
}
