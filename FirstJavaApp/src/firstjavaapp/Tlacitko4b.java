/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

import java.awt.event.ActionEvent;

/**
 *
 * @author kuba
 */
public class Tlacitko4b extends Tlacitko4 {
    
    public Tlacitko4b(String jmeno) {
        super(jmeno);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        String napis = "";
        if(o.equals(ahojBT)){
            napis = ahojBT.getLabel();
        }
        else if(o.equals(nazdarBT)){
            napis = nazdarBT.getLabel();            
        }
        else if(o.equals(ZdravickoBT)){
            napis = ZdravickoBT.getLabel();
        }
        lab.setText(napis);
    }
    
    
}
