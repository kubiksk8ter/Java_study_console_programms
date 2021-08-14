/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiposunobjektu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements ActionListener {
    Button tlacBT;
    Label oknoLB, tlacLB;
    int i = 0;

    public Window() {
        super.setTitle("Posun");
        this.setLayout(new GridLayout(5, 8));
        tlacBT = new Button("Posun na [0,0]");
        this.add(tlacBT);
        oknoLB = new Label();
        this.add(oknoLB);
        tlacLB = new Label();
        this.add(tlacLB);
        this.setSize(500, 500);
        
        tlacBT.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tlacBT.setLocation(i,39);
        tlacBT.setSize(150, 80);
        rozmery(tlacLB, tlacBT, "tlac");
        i++;
    }
    
    void rozmery(Label kam, Component co, String popis){
        Dimension d = co.getSize();
        Point p = co.getLocation();
        String s = popis + ": [" + p.x + ", " + p.y + "], sirka = " + d.width + ", vyska = " + d.height;
        kam.setText(s);
    }
    
}
