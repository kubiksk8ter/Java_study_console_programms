/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobrazek1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    Platno p1;
    PostupPrace pp;
    
    public Program() { Initialize(); }  
    
    private void Initialize() {
        pp = new PostupPrace(true);
        p1 = new Platno(pp);
        this.add(p1, BorderLayout.CENTER);
        
        JButton b1 = new JButton("První obrázek");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.nactiObrazek("kocka.png");
            }
        });
        
        JButton b2 = new JButton("Druhý obrázek");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.nactiObrazek("kouzelnik.jpg");
            }
        });
        
        JPanel p = new JPanel();
        p.add(b1);
        p.add(pp);
        p.add(b2);
        this.add(p, BorderLayout.SOUTH);
        
        this.setSize(1000, 1000);        
    }
    
}
