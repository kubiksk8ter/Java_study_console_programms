/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guigridlayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kuba
 */
public class Program extends JFrame implements ActionListener {
    JButton bez;

    public Program() {
        this.setLayout(new GridLayout(2, 3, 5, 15));
        bez = new JButton("Bez mezer");
        bez.addActionListener(this);
        this.add(bez);
        
        for(int i = 1; i <= 5; i++) {
            this.add(new JButton("T1. " + i));           
        }
        
        this.setSize(300, 95);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setLayout(new GridLayout(3, 2));
        this.validate();
    }
    
}
