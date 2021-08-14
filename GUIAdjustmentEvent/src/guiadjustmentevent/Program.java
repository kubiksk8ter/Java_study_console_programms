/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadjustmentevent;

import java.awt.BorderLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    JLabel hodLB, puvodLB;

    public Program() {
        this.setLayout(new BorderLayout(5, 5));
        JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL, 50, 0, 0, 100);
        this.add(sb, BorderLayout.NORTH);
        sb.addAdjustmentListener(new BAL());
        
        hodLB = new JLabel();
        this.add(hodLB, BorderLayout.WEST);
        
        puvodLB = new JLabel("Zde bude typ změny", JLabel.CENTER);
        this.add(puvodLB, BorderLayout.CENTER);
        
        this.setSize(300, 120);               
    }
    
    class BAL implements AdjustmentListener {
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            if (e.getAdjustmentType() == AdjustmentEvent.BLOCK_DECREMENT) {
                return;
            }
            hodLB.setText(String.valueOf(e.getValue()));
            String s = e.paramString();
            int z = s.indexOf('=');
            int k = s.lastIndexOf(',');
            puvodLB.setText(s.substring(z + 1, k));
        }       
    }    
}
