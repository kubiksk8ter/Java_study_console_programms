/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitextarea;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements TextListener, ActionListener {
    Label vysledekLB;
    TextArea vstupTA;
    Button pridejBT, vlozBT, nahradBT, novyBT;

    public Window() {
        this.setLayout(new FlowLayout());        
        pridejBT = new Button("Přidej");
        vlozBT = new Button("Vlož");
        nahradBT = new Button("Nahraď");
        novyBT = new Button("Novy");
        vstupTA = new TextArea("Java je ", 3, 20, TextArea.SCROLLBARS_BOTH);
        vysledekLB = new Label("Zde bude opsan vstup");        
        this.add(pridejBT);
        this.add(vlozBT);
        this.add(nahradBT);
        this.add(novyBT);
        this.add(vstupTA);
        this.add(vysledekLB);       
        this.setSize(250, 180);
        this.setLocationByPlatform(true);       
        vstupTA.addTextListener(this);
        pridejBT.addActionListener(this);
        vlozBT.addActionListener(this);
        nahradBT.addActionListener(this);
        novyBT.addActionListener(this);
    }
    @Override
    public void textValueChanged(TextEvent e) {
        vysledekLB.setText(vstupTA.getText());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.compareTo(pridejBT.getLabel()) == 0) {
            vstupTA.append(" bezva");
        }
        else if(s.compareTo(vlozBT.getLabel()) == 0) {
            vstupTA.insert("fakt ", 0);
        }
        else if(s.compareTo(nahradBT.getLabel()) == 0) {
            vstupTA.replaceRange(" vážně", 12, 12);
        }
        else {
            vstupTA.setText("Java je ");
        }
    }    
}
