/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiswing;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kuba
 */
public class Program extends JFrame implements ActionListener {
    JButton button;
    Button button2;
    String s = "Ahoj";

    public Program() {
        this.setLayout(new FlowLayout());
        
        button = new JButton(s);
        button.addActionListener(this);
        this.add(button); 
        
        button2 = new Button(s);
        button2.addActionListener(this);
        this.add(button2);
        
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {        
        s = s.concat(" Ahoj");
        button.setLabel(s);
        this.validate();
        this.pack();
    }
}
