/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiudalost;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame {
    Button ahojBT;
    UdalostBT nazdarBT;
    Label ahojLB, nazdarLB;

    public Window() {
        super.setTitle(getClass().getName());
        this.setLayout(new FlowLayout());
        
        ahojBT = new Button("Ahoj");
        this.add(ahojBT);
        ahojBT.addActionListener(new AAL());
        
        ahojLB = new Label("Ahoj ");
        this.add(ahojLB);
        
        nazdarLB = new Label("Nazdar ");
        this.add(nazdarLB);
        
        nazdarBT = new UdalostBT("Nazdar");
        this.add(nazdarBT);
        
        nazdarBT.addActionListener(new NAL());
        nazdarBT.provedUdalost();
        
        this.setSize(250, 100);
    }
    
        class AAL implements ActionListener {
            int n = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                String s = "ahoj " + n;
                ahojLB.setText(s);
                s = nazdarBT.getLabel();
                //První možnost
                nazdarBT.processEvent(new ActionEvent(nazdarBT, 1, s));
                //Druhá možnost
                nazdarBT.provedUdalost();
            }            
        }
        
        class NAL implements ActionListener {
            int n = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                String s = "nazdar " + n;
                nazdarLB.setText(s);
            }
        }
        
}
