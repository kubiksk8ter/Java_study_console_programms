/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidelbaprace;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 *
 * @author kuba
 */
public class Window extends Frame {
    Faktorial fakt = new Faktorial();
    Mocnina mocn = new Mocnina();
    TextField vstupTF, faktTF, mocnTF;
    final int PRVNI = 5;
    int n = PRVNI;

    public Window() {
        this.setLayout(new FlowLayout());
        this.add(new Label("Vstup", Label.RIGHT));
        vstupTF = new TextField(String.valueOf(PRVNI));
        this.add(vstupTF);
        vstupTF.addActionListener(new VstupTF());
        vstupTF.addFocusListener(new FocusVstupTF());
        
        Button faktBT = new Button("Faktorial");
        this.add(faktBT);
        faktBT.addActionListener(new FaktBT());
        
        faktTF = new TextField(15);
        faktTF.setEditable(false);
        this.add(faktTF);
        
        Button mocnBT = new Button("Mocnina");
        this.add(mocnBT);
        mocnBT.addActionListener(new MocnBT());
        
        mocnTF = new TextField(5);
        mocnTF.setEditable(false);
        this.add(mocnTF);
        
        this.pack();
        
    }
    
    class FocusVstupTF extends FocusAdapter {
        @Override
        public void focusLost(FocusEvent e) {
            n = Integer.parseInt(vstupTF.getText());
        }
    }
    
    class VstupTF implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            n = Integer.parseInt(vstupTF.getText()); 
        }       
    }
    
    class FaktBT implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            long f = fakt.factorial(n);
            faktTF.setText(String.valueOf(f));
        }       
    }
    
    class MocnBT implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            long m = mocn.mocnina(n);
            mocnTF.setText(String.valueOf(m));
        }
        
    }
 
}
