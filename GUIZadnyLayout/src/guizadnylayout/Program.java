/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guizadnylayout;

import java.awt.Scrollbar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {

    public Program() {
        this.setLayout(null);
        JButton b1 = new JButton("Ahoj");
        b1.setBounds(60, 30, 60, 20);
        this.add(b1);
        
        JButton b2 = new JButton("Nazdar");
        b2.setBounds(140, 70, 80, 20);
        this.add(b2);
        
        JScrollBar sb = new JScrollBar(Scrollbar.HORIZONTAL, 0, 0, 0, 100);
        sb.setBounds(10, 60, 100, 15);
        this.add(sb);
        
        this.setSize(300, 150);
    }
    
    
}
