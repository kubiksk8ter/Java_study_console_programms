/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidialog;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author kuba
 */
public class Program extends Frame implements ActionListener, ItemListener {
    boolean modal = false;
    Label vypLB;

    public Program() {
        this.setLayout(new FlowLayout());
        Button dialBT = new Button("Dialog");
        this.add(dialBT);
        Checkbox modalCHB = new Checkbox("modalni");
        this.add(modalCHB);
        vypLB = new Label("Zde bude text z dialog");
        this.add(vypLB);
        this.setSize(240, 110);
        dialBT.addActionListener(this);
        modalCHB.addItemListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        NovyDialog nd = new NovyDialog(this, modal);
        nd.show();
        vypLB.setText(nd.getText());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        modal = !modal;
    }
    
}
