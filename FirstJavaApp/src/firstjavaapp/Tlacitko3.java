/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author kuba
 */
public class Tlacitko3 extends Tlacitko2{
    Button nazdarBT;

    public Tlacitko3(String jmeno) {
        super(jmeno);
        nazdarBT = new Button("Nazdar");
        this.add(nazdarBT);
        nazdarBT.addActionListener(this);
    }
    
    
    
}
