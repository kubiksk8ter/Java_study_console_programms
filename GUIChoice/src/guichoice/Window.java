/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichoice;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements ItemListener {
    Choice vyber;
    Label lab;

    public Window() {
        this.setLayout(new FlowLayout());
        
        vyber = new Choice();
        this.add(vyber);
        
        vyber.add("1");
        vyber.add("2");
        vyber.add("3");
        vyber.add("4");
        vyber.add("Zruš první položku");
        vyber.add("Vlož 5 jako první");
        vyber.add("Smaž vše");
        
        vyber.addItemListener(this);
        
        lab = new Label("Zvolená položka");
        this.add(lab);
        
        this.setSize(150,120);
    }
    

    @Override
    public void itemStateChanged(ItemEvent e) {
        String s = vyber.getSelectedItem();
        lab.setText(s);
        if(s.compareTo("Zruš první položku") == 0){
            vyber.remove(0);
        }
        else if(s.compareTo("Vlož 5 jako první") == 0){
            vyber.insert("5", 0);
        }
        else if(s.compareTo("Smaž vše") == 0)
            vyber.removeAll();
    }
    
}
