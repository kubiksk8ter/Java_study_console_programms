/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiorezxormode;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author kuba
 */
public class Program extends JFrame implements ItemListener {
    Platno platno;
    JCheckBox clip;
    int x1, y1, x2, y2;

    public Program() {
        this.setLayout(new BorderLayout());
        platno = new Platno();
        this.add(platno, BorderLayout.CENTER);
        clip = new JCheckBox("Clip");
        clip.addItemListener(this);
        this.add(clip, BorderLayout.SOUTH);
        this.setSize(300, 300);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == 1) {
            platno.clp = true;
        }
        else {
            platno.clp = false;
        }
        System.out.println(platno.clp);
    }    
}
