/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guifocusevent;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    JLabel focLB;
    JScrollBar sb;
    Scrollbar obyc;
    public Program() {
        this.setLayout(new BorderLayout (5, 5));
        focLB = new JLabel ("Zde bude label", JLabel.CENTER);
        this.add(focLB, BorderLayout.NORTH);        
        JButton b = new JButton ("Fokus"); b.setName("Button");
        this.add(b, BorderLayout.WEST);
        b.addFocusListener(new FL());
        b.addActionListener(new BAL());        
        sb = new JScrollBar(JScrollBar.HORIZONTAL, 50, 0, 0, 100);
        sb.setName("Scrollbar");
        this.add(sb, BorderLayout.CENTER);
        sb.addFocusListener(new FL());        
        JCheckBox c = new JCheckBox ("Check", false); c.setName("CheckBox");
        this.add(c, BorderLayout.EAST);
        c.addFocusListener(new FL());        
        obyc = new Scrollbar(JScrollBar.HORIZONTAL, 50, 0, 0, 100);
        obyc.requestFocus();
        obyc.addFocusListener(new FL());
        this.add(obyc, BorderLayout.SOUTH);
        
        this.setSize(250, 115);
    }    
    class BAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sb.requestFocus();
        }        
    }    
    class FL implements FocusListener {
        @Override
        public void focusGained(FocusEvent e) {
            focLB.setText(e.getComponent().hasFocus() + " " + e.getComponent().getName());
        }
        @Override
        public void focusLost(FocusEvent e) {
        }        
    }    
}
