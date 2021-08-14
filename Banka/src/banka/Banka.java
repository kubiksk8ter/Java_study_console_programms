/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class Banka {
    ArrayList<BankovniUcet>ucty = new ArrayList<>();
    
    public void vlozUcet(BankovniUcet ucet){
        ucty.add(ucet);
    }
    /**
     * Vypíše kolik je celkem uloženo v bance
     * @return String
     */
    public String vypisPenizeVBance(){
        int celkem = 0;
        for (BankovniUcet i : ucty) {
            celkem += i.getPenize();
        }
        return String.format("\nV bance je uloženo celkem: %d Kč", celkem);
    }
    
    

}
