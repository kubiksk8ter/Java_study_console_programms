/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guikeyboarddraw;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    Platno platno;

    public Program() {
        this.setLayout(new BorderLayout());
        platno = new Platno();
        this.add(platno, BorderLayout.CENTER);
        this.setSize(300, 300);
    }
    
    
}
