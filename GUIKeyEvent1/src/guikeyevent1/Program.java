/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guikeyevent1;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    JTextArea vysTA;
    JTextField vstupTF;

    public Program() {
        this.setLayout(new BorderLayout(5, 5));
        
        vstupTF = new JTextField ();
        this.add(vstupTF, BorderLayout.NORTH);
        vstupTF.addKeyListener(new TFKL());
        
        vysTA = new JTextArea();
        this.add(vysTA, BorderLayout.CENTER);
        
        this.setSize(220, 150);       
    }
    class TFKL extends KeyAdapter {
        @Override
        public void keyPressed (KeyEvent e) { //keyReleased funguje stejně :)
            if (e.isActionKey()) {
                vysTA.append("Akční; ");
            }
            int kod = e.getKeyCode();
            vysTA.append("Kód = " + kod);
            vysTA.append("; Klávesa = " + KeyEvent.getKeyText(kod) + "\n");
            if (kod == KeyEvent.VK_ESCAPE) {
                System.exit(0);
            }
        }
    }    
}
