/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiborderlayout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kuba
 */
public class Program extends JFrame implements ActionListener {
    JButton stred;

    public Program() {
        this.setLayout(new BorderLayout(5, 10));
        
        this.add(new JButton("Sever"), BorderLayout.NORTH);
        this.add(new JButton("Jih"), "South");
        this.add(BorderLayout.WEST, new JButton("Západ"));
        this.add("East", new JButton("Východ"));
        stred = new JButton("Stred");
        this.add(stred, BorderLayout.CENTER);
        
        this.setSize(300, 200);
        stred.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        stred.setSize(stred.getMinimumSize());
    }    
}
