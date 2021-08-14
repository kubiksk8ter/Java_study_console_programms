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
public class Pila extends Nastroj{

    public Pila(String nazev, int vaha) {
        super(nazev, vaha);
    }

    @Override
    String pracuj() {
        return String.format("Piluji");
    }
    
}
