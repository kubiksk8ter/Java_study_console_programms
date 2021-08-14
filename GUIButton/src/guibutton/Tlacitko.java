/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibutton;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Tlacitko extends Button implements ActionListener {
    int pocitadlo;
    String napis;
    String s;

    public Tlacitko(String napis) {
        super(napis);
        this.napis = napis;
        pocitadlo = 10;        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        pocitadlo--;
        s = napis.concat(String.valueOf(pocitadlo));
        this.setLabel(s);
        
        if (pocitadlo == 0){
            //this.removeActionListener(this);
            ActionListener[] a = (ActionListener[])(this.getListeners(ActionListener.class));
            for (ActionListener a1 : a) {
                this.removeActionListener(a1);
            }
        }
    }        
}
