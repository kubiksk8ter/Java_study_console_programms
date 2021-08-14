/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicheckbox;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements ItemListener {
    Checkbox ahojCHB;
    CheckboxGroup radio;
    Label lab;

    public Window() {
        this.setLayout(new GridLayout(2,3));
        
        ahojCHB = new Checkbox("Ahoj");
        this.add(ahojCHB);
        
        radio = new CheckboxGroup();
        
        Checkbox nazdar = new Checkbox("nazdar", radio, false);
        this.add(nazdar);
        
        Checkbox ahojky = new Checkbox("Ahojky", radio, false);
        this.add(ahojky);
        
        Checkbox vytaj = new Checkbox("Vytaj", radio, true);
        this.add(vytaj);
        
        lab = new Label();
        this.add(lab);
        
        ahojCHB.addItemListener(this);
        nazdar.addItemListener(this);
        ahojky.addItemListener(this);
        vytaj.addItemListener(this);
        
        this.setSize(350, 200);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Checkbox c = radio.getSelectedCheckbox();
        String s = c.getLabel() + " ";
        if(ahojCHB.getState()){
            s += ahojCHB.getLabel();
        }
        lab.setText(s);
    }
   
}
