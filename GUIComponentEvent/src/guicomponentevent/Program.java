/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicomponentevent;

import java.awt.BorderLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    JLabel zmenaLB;

    public Program() {
        this.setLayout(new BorderLayout(5, 5));
        zmenaLB = new JLabel("Zde bude ty změny", JLabel.CENTER);
        this.add(zmenaLB, BorderLayout.CENTER);
        
        this.addComponentListener(new CL());
        this.setSize(300, 100);
    }
    
    private void typZmeny (ComponentEvent e) {
        zmenaLB.setText(e.paramString());
    }
    
    class CL implements ComponentListener {
        @Override
        public void componentResized(ComponentEvent e) {
            typZmeny(e);
        }
        @Override
        public void componentMoved(ComponentEvent e) {
            typZmeny(e);
        }
        @Override
        public void componentShown(ComponentEvent e) {
            typZmeny(e);
        }
        @Override
        public void componentHidden(ComponentEvent e) {
            typZmeny(e);
        }        
    }   
}
