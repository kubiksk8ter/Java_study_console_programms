/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibutton;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Navesti extends Label implements ActionListener{
    int pocitadlo;
    String napis;

    public Navesti(String napis) {
        super(napis);
        this.napis = napis;
        pocitadlo = 0;
    }
    //Počítadlo vypíše počet stisků
    @Override
    public void actionPerformed(ActionEvent e) {
        pocitadlo++;
        String s = napis.concat(String.valueOf(pocitadlo));
        this.setText(s);
    }
    
}
