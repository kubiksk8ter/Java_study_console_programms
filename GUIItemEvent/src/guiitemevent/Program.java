/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiitemevent;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    JLabel vysLB;
    JCheckBox checkCHB;
    JComboBox choiCH;
    String[] cisla = {"Prvni", "Druhy"}; //komponenty pro ComboBox    
    public Program() {
        this.setLayout(new FlowLayout());
        vysLB = new JLabel("Zde bude vysledek", JLabel.CENTER);
        this.add(vysLB);
        choiCH = new JComboBox(cisla);
        this.add(choiCH);
        choiCH.addItemListener(new CHIL());
        checkCHB = new JCheckBox("Check", true);
        this.add(checkCHB);
        checkCHB.addItemListener(new CHBIL());
        this.setSize(150, 110);
    }    
    class CHIL implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            boolean b = false;
            if ((e.getStateChange() & ItemEvent.ITEM_STATE_CHANGED) != 0){
                b = true;
            }
            Object o = e.getItem(); //Je to String
            vysLB.setText(o + "       -       " + b);
        }        
    }   
    class CHBIL implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            String s = " - neznamy stav";
            if ((e.getStateChange() & ItemEvent.DESELECTED) != 0) {
                s = "   -   vypnuto";
            }
            else {
                s = "   -   zapnuto";
            }
            JCheckBox c = (JCheckBox) e.getItemSelectable();
            vysLB.setText(c.getLabel() + s);
        }    
    }    
}
