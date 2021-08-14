/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Program extends Frame implements ActionListener {
    Button button;
    String s = "KLICK";
    
    public Program() {
        this.setLayout(new FlowLayout());
        button = new Button(s);
        button.addActionListener(this);
        this.add(button); 
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        s = s.concat("KLICK");
        button.setLabel(s);
        this.validate();
        this.pack();
    }
    
}
