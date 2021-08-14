/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class NovyDialog extends Dialog implements ActionListener {
    TextField tf;

    public NovyDialog(Frame owner, boolean modal) {
        super(owner, "Nový dialog", modal);
        this.setLayout(new FlowLayout());
        this.setSize(100, 90);
        this.setLocation(80, 80);
        tf = new TextField(5);
        this.add(tf);
        Button zavri = new Button("Zavři");
        zavri.addActionListener(this);
        this.add(zavri);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
    }
    
    public String getText(){
        return tf.getText();
    }
    
}
