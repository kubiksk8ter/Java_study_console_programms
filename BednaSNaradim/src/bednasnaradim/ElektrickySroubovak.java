/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bednasnaradim;

/**
 *
 * @author kuba
 */
public class ElektrickySroubovak extends Sroubovak {
    private int kapacita;

    public ElektrickySroubovak(String nazev, int vaha, int kapacita) {
        super(nazev, vaha);
        this.kapacita = kapacita;
    }
    
    
    
    @Override
    String pracuj() {
        return String.format("Elektricky šroubuji");
    }
    
}
