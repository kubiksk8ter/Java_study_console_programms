/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibutton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame {
    Tlacitko ahojBT;
    Button stopBT;

    public Window() {
        super.setTitle(getClass().getName());
        this.setLayout(new FlowLayout());
        
        ahojBT = new Tlacitko("Ahoj ");
        this.add(ahojBT);        
        
        stopBT = new Button("STOP ihned");
        this.add(stopBT);
        
        ahojBT.addActionListener(ahojBT);
        stopBT.addActionListener(new StopAL());
      
        this.setSize(250, 80);       
    }
    
    class StopAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ahojBT.removeActionListener(ahojBT);
        }        
    }    
}
