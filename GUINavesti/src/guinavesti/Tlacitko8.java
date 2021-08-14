/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guinavesti;

import java.awt.*;

/**
 *
 * @author kuba
 */
public class Tlacitko8 extends Frame {
    Button ahojBT, nazdarBT;
    Navesti ahojLB, nazdarLB;

    public Tlacitko8() {
        super.setTitle(getClass().getName());
        this.setLayout(new FlowLayout());
        
        ahojBT = new Button();
        this.add(ahojBT);
        ahojLB = new Navesti(ahojBT.getLabel());
        this.add(ahojLB);
        
        nazdarBT = new Button("Nazdar ");
        this.add(nazdarBT);
        nazdarLB = new Navesti("NAZDAR ");
        this.add(nazdarLB);
        //Nastaví potřebnou velikost okna
        this.pack();
        
        ahojBT.addActionListener(ahojLB);
        nazdarBT.addActionListener(nazdarLB);
        
    }    
}
