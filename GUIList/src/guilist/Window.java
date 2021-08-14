/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilist;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements ActionListener, ItemListener {
    List vyberLS;
    Label lab;

    public Window() {
        this.setLayout(new BorderLayout());       
        vyberLS = new List(5);
        vyberLS.add("Druhy");
        vyberLS.add("Prvni");
        vyberLS.add("Vloz AHOJ jako první");
        vyberLS.add("zrus AHOJ");
        vyberLS.add("Zruš vše");
        vyberLS.select(1);
        lab = new Label("V seznamu je " + vyberLS.getItemCount() + " položek");        
        this.add(vyberLS, BorderLayout.WEST);
        this.add(lab, BorderLayout.EAST);
        this.setSize(300, 120);
        this.setLocationByPlatform(true);        
        vyberLS.addItemListener(this);
        vyberLS.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        vyberLS.makeVisible(vyberLS.getItemCount() - 1);
        lab.setText("double-click");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String s = vyberLS.getSelectedItem();
        lab.setText(vyberLS.getSelectedIndex() + ": " + s);
        if(s.compareTo("Vloz AHOJ jako první") == 0){
            vyberLS.add("AHOJ", 0);
        }
        else if(s.compareTo("zrus AHOJ") == 0){
            vyberLS.remove("AHOJ");
        }
        else if(s.compareTo("Zruš vše") == 0){
            vyberLS.removeAll();
        }
    }    
}
