/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobserver;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame {
    Citac citac;
    CitacTextField ctf;
    CitacScrollbar csb;
    Button plusBT, minusBT;

    public Window() {
        this.setLayout(new BorderLayout(10, 10));
        
        minusBT = new Button("-");
        this.add(minusBT, BorderLayout.WEST);
        minusBT.addActionListener(new minusBTAL());
        
        ctf = new CitacTextField(0);
        this.add(ctf, BorderLayout.CENTER);
        
        plusBT = new Button("+");
        this.add(plusBT, BorderLayout.EAST);
        plusBT.addActionListener(new plusBTAL());
        
        csb = new CitacScrollbar(0, -10, 10+1);
        this.add(csb, BorderLayout.SOUTH);
        
        citac = new Citac(0);
        citac.addObserver(ctf);
        citac.addObserver(csb);
        csb.o.addObserver(ctf);
        
        this.pack();                
    }
    
    class plusBTAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            citac.plusJedna();
        }       
    }
    
    class minusBTAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            citac.minusJedna();
        }        
    }    
}
