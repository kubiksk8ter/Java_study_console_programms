/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guigridbaglayout2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    GridBagConstraints gbc;
    GridBagLayout gb1;
    
    void vytvorTlacitko(String jmeno, int gridx, int gridy) {
        JButton b = new JButton(jmeno);
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gb1.setConstraints(b, gbc);
        add(b);
    }

    public Program() {
        gb1 = new GridBagLayout();
        this.setLayout(gb1);
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        
        gbc.weightx = 1.0;
        vytvorTlacitko("Tl. 1", 0, 0);
        vytvorTlacitko("Tlač. 2", 1, 0);
        vytvorTlacitko("Tlačítko 3", 2, 0);
        //gbc.weightx = 0.0;
        gbc.gridwidth = 2;
        vytvorTlacitko("Tlač. 4", 0, 1);
        gbc.gridwidth = 1;
        gbc.weighty = 1.0;
        gbc.gridheight = 2;
        vytvorTlacitko("Tlačítko 5", 2, 1);
        gbc.weighty = 0.0;
        gbc.gridheight = 1;
        vytvorTlacitko("Tlačítko 6", 0, 2);
        vytvorTlacitko("T. 7", 1, 2);        
        gbc.gridwidth = 3;
        vytvorTlacitko("Tlačítko 8", 0, 3);
        
        this.setSize(300, 300);                
    }   
}
