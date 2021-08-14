/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiscrollpane;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Program extends Frame implements ActionListener {
    ScrollPane sp;

    public Program() {
        this.setLayout(new FlowLayout());
        
        sp = new ScrollPane();
        sp.setSize(100, 50);
        this.add(sp);
        
        Panel p = new Panel(new FlowLayout());
        Dimension d = sp.getViewportSize();
        String s = "[" + d.width + ", " + d.height + "]";
        Label velLB = new Label(s);
        p.add(velLB);
        Button nahoru = new Button("Nahoru");
        p.add(nahoru);
        sp.add(p);
        
        this.setSize(180, 120);
        nahoru.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        sp.setScrollPosition(0, 0);
    }   
}
