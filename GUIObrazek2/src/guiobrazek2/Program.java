/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobrazek2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kuba
 */
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Program extends JFrame {
    Platno platno;
    boolean cely = false,
            zmenseny = false,
            natazeny = false;

    public Program() {
        this.setSize(500, 500);
        platno = new Platno();
        this.add(platno, BorderLayout.CENTER);
        JButton b1 = new JButton("Vykresli");
        b1.addActionListener((ActionEvent e) -> {
            platno.vykresliObrazek(cely, zmenseny, natazeny);
        });
        ButtonGroup bg = new ButtonGroup();
        JRadioButton celyB = new JRadioButton("Celý");
        bg.add(celyB);
        JRadioButton zmensenyB = new JRadioButton("Zmenšený");
        bg.add(zmensenyB);
        JRadioButton natazenyB = new JRadioButton("Natažený");
        bg.add(natazenyB);
        JPanel p1 = new JPanel();
        this.add(p1, BorderLayout.SOUTH);
        p1.add(celyB);
        p1.add(zmensenyB);
        p1.add(natazenyB);
        p1.add(b1);
        celyB.addActionListener((ActionEvent e) -> {
            cely = true;
            zmenseny = false;
            natazeny = false; 
        });
        zmensenyB.addActionListener((ActionEvent e) -> {
            cely = false;
            zmenseny = true;
            natazeny = false; 
        });
        natazenyB.addActionListener((ActionEvent e) -> {
            cely = false;
            zmenseny = false;
            natazeny = true; 
        });
    }    
}
