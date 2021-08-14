/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicolor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements ActionListener {
    Button barvaBT;
    int cervena = 255;
    Color pozadi;
    Label label;
    int font = 40;
    Font f = new Font("SansSerif", Font.BOLD, 25);

    public Window() {
        super.setTitle("Barva");
        this.setLayout(new FlowLayout());
        
        barvaBT = new Button("Zmena");
        barvaBT.setBackground(Color.black);
        barvaBT.setForeground(Color.white);
        barvaBT.addActionListener(this);
        this.add(barvaBT);
        
        label = new Label("Ahojky");
        this.add(label);
        
        label.setFont(f);
        System.out.println(label.getFont());
        
        this.setBackground(pozadi);
        
        this.setSize(250, 100);
        
    }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            cervena = ((cervena - 50) > 0) ? cervena - 50 : 255;
            this.setBackground(new Color(cervena , 0 , 0));
            font = ((font - 8) > 0) ? font - 8 : 40;
            label.setFont(new Font("SansSerif", Font.BOLD, font));
            
            
            
    }
}