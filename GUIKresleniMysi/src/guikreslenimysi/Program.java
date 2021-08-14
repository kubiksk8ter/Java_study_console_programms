/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guikreslenimysi;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    JCheckBox update;
    JCheckBox paint;
    Platno platno;
    public Program() {
        this.setLayout(new BorderLayout());
        platno = new Platno();
        this.add(platno, BorderLayout.CENTER);
        
        paint = new JCheckBox("Paint", true);
        paint.addItemListener((ItemEvent e) -> {
            if(e.getStateChange() == 1) {
                platno.pain = true;                
            }
            else {
                platno.pain = false;
            }
            System.out.println("Paint: " + platno.pain);
        });        
        update = new JCheckBox("Update");
        update.addItemListener((ItemEvent e) -> {
            if(e.getStateChange() == 1) {
                platno.upda = true;
            }
            else {
                platno.upda = false;
            }
            System.out.println("Update: " + platno.upda);
        });
        this.setSize(300, 300);        
        JPanel p = new JPanel();
        this.add(p, BorderLayout.SOUTH);
        p.setLayout(new FlowLayout());
        p.add(paint);
        p.add(update);
    }    
}
