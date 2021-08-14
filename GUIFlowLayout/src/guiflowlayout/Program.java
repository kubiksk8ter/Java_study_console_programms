/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiflowlayout;

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
    JButton vlevo, stred, vpravo;

    public Program() {
        this.setLayout(new FlowLayout());
        
        vlevo = new JButton("Vlevo");
        vlevo.addActionListener(this);
        this.add(vlevo);
        
        stred = new JButton("Střed");
        stred.addActionListener(this);
        this.add(stred);
        
        vpravo = new JButton("Vpravo");
        vpravo.addActionListener(this);
        this.add(vpravo);
        
        this.setSize(200, 120);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.compareTo("Vlevo") == 0) {
            this.setLayout(new FlowLayout(FlowLayout.LEFT));
        }
        else if(s.compareTo("Střed") == 0) {
            this.setLayout(new FlowLayout(FlowLayout.CENTER)); 
        }
        else if(s.compareTo("Vpravo") == 0) {
            this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        }
        this.validate();
    }    
}
