/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guizpristupneni;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements ActionListener {
    Button pristBT, skryjBT;

    public Window() {
        super.setTitle(getClass().getName());
        this.setLayout(new FlowLayout());
        
        pristBT = new Button("Pristupny");
        this.add(pristBT);
        
        skryjBT = new Button("Skryj");
        this.add(skryjBT);
        
        pristBT.addActionListener(this);
        skryjBT.addActionListener(this);
        
        this.setSize(170, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pristBT.setVisible(! pristBT.isVisible());
        skryjBT.setLabel(skryjBT.getLabel().equals("Skryj") ? "obnov" : "Skryj");
        System.out.println("Viditelnost komponenty: " + pristBT.isVisible());
    }
    
}
