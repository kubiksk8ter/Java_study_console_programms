/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Tlacitko2 extends Tlacitko1 implements ActionListener {

    public Tlacitko2(String jmeno) {
        super(jmeno);
        ahojBT.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        lab.setText("Ahoj");
    }
}
