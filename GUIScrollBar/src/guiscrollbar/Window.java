/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiscrollbar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements ActionListener, 
        AdjustmentListener {
    
    Scrollbar posunSB, velJezdceSB;
    TextField hodnotaTF;
    static final int MAX = 100;
    static final int MIN = 0;

    public Window() {
        this.setLayout(new BorderLayout());
        
        posunSB = new Scrollbar(Scrollbar.HORIZONTAL, MAX/2, 0, MIN, MAX + 1);
        hodnotaTF = new TextField("50", 3);
        velJezdceSB = new Scrollbar(Scrollbar.HORIZONTAL, 1, 0, MIN, 60 + 1);
        
        this.add(posunSB, BorderLayout.CENTER);
        this.add(hodnotaTF, BorderLayout.EAST);
        this.add(velJezdceSB, BorderLayout.SOUTH);
        this.setSize(250, 90);
               
        hodnotaTF.addActionListener(this);
        posunSB.addAdjustmentListener(this);
        velJezdceSB.addAdjustmentListener((AdjustmentEvent er) -> {
            int visible = velJezdceSB.getValue();
            int hod = posunSB.getValue();
            posunSB.setValues(hod, visible, MIN, MAX + visible);
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        int i = Integer.parseInt(s);
        posunSB.setValue(i);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int i = posunSB.getValue();
        hodnotaTF.setText(String.valueOf(i));
    }
    
}
