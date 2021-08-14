/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiprimitiva;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kuba
 */
public class Program extends JFrame{
    JComboBox tvar;
    JCheckBox vypln;
    Platno platno;

    public Program() {
        this.setLayout(new BorderLayout());
        platno = new Platno();
        this.add(platno, BorderLayout.CENTER);
        
        tvar = new JComboBox(JmenaTvaru.jmena);
        tvar.addItemListener((ItemEvent e) -> {
            platno.setTypTvaru(tvar.getSelectedIndex());           
        });
        this.setSize(300, 300);
        
        vypln = new JCheckBox();
        vypln.addItemListener((ItemEvent e) -> {
            if(e.getStateChange() == 1) {
                platno.setVypln(true);
            }
            else {
                platno.setVypln(false);
            }
        });
        JPanel p = new JPanel();
        this.add(p, BorderLayout.SOUTH);
        p.setLayout(new FlowLayout());
        p.add(tvar);
        p.add(vypln);
    }   
}
