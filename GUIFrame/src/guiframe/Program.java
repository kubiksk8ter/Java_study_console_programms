/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiframe;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Program extends Frame implements ActionListener {
    Label vypLB;

    public Program() {
        this.setLayout(new FlowLayout());
        Button ikBT = new Button("Ikona");
        this.add(ikBT);
        Button skBT = new Button("Skryj");
        this.add(skBT);
        Button doBT = new Button("Dozadu");
        this.add(doBT);
        vypLB = new Label("viditelné");
        this.add(vypLB);
        this.pack();
        ikBT.addActionListener(this);
        skBT.addActionListener(this);
        doBT.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean b;
        vypLB.setText("                  ");
        if (e.getActionCommand().compareTo("Ikona") == 0) {
            this.setState(Frame.ICONIFIED); b = cekej();
            this.setState(Frame.NORMAL);
        }
        else if (e.getActionCommand().compareTo("Skryj") == 0) {
            this.setVisible(false); b = cekej();
            this.setVisible(true);
        }
        else {
            this.toBack(); b = cekej(); this.toFront();            
        }
        vypLB.invalidate(); //Zobrazí celý výpis
        vypLB.setText(String.valueOf(b));
        this.validate();
    }
    private boolean cekej() {
        long z = System.currentTimeMillis();
        while (System.currentTimeMillis() < z + 2000);
        return this.isShowing();
    }   
}
