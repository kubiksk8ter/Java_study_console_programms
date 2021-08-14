/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicardlayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;

/**
 *
 * @author kuba
 */
public class Program extends JFrame implements ItemListener {
    JPanel bloky;

    public Program() {
        this.setLayout(new BorderLayout(10, 10));
        
        JComboBox volba = new JComboBox();
        volba.addItem("1");
        volba.addItem("2");
        volba.addItemListener(this);
        
        JPanel p1 = new JPanel();
        p1.add(new JButton("A"));
        p1.add(new JButton("B"));
        
        JPanel p2 = new JPanel();
        p2.add(new JCheckBox("C"));
        p2.add(new JCheckBox("D"));
        
        bloky = new JPanel();
        bloky.setLayout(new CardLayout());
        bloky.add("1", p1);
        bloky.add("2", p2);
        
        this.add(bloky, BorderLayout.NORTH);
        this.add(volba, BorderLayout.SOUTH);
        this.setSize(200, 150);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        CardLayout c = (CardLayout) bloky.getLayout();
        c.show(bloky, (String)e.getItem());
    }    
}
