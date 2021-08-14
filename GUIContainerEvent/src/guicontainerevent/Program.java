/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicontainerevent;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author kuba
 */
public class Program extends Frame {
    Label zmenaLB;
    Button zmenaBT, novyBT;
    Frame f;

    public Program() {
        this.setLayout(new BorderLayout(5, 5));
        zmenaLB = new Label("Zde bude typ zmeny", Label.CENTER);        
        this.add(zmenaLB, BorderLayout.NORTH);
        this.addContainerListener(new CL());
        
        zmenaBT = new Button("Pridej");
        this.add(zmenaBT, BorderLayout.WEST);
        zmenaBT.addActionListener(new BAL());
        
        novyBT = new Button("Novy");
        novyBT.setEnabled(false);
        novyBT.setVisible(false);
        
        this.setSize(300, 150);
        f = this;
    }
    
    class BAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (novyBT.isVisible() == false) {
                f.add(novyBT, BorderLayout.EAST);
                novyBT.setVisible(true);
                zmenaBT.setLabel("Uber");
            }
            else {
                f.remove(novyBT);
                novyBT.setVisible(false);
                zmenaBT.setLabel("Pridej");
            }
            f.validate();
        }        
    }
    
    class CL implements ContainerListener {
        @Override
        public void componentAdded(ContainerEvent e) {
            String s1 = e.getChild().getName();
            String s2 = e.getContainer().getName();
            zmenaLB.setText(s1 + " přidáno do " + s2);
        }
        @Override
        public void componentRemoved(ContainerEvent e) {
            String s = ((Button) e.getChild()).getLabel();
            zmenaLB.setText(s + " ubráno");
        }
    }    
}
