/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guinejprehlednejsi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Nejprehlednejsi extends Frame{
    private Label lab;
    
    public Nejprehlednejsi(){
        super.setTitle(getClass().getName());
        this.setLayout(new FlowLayout());
        
        Button ahojBT = new Button("Ahoj");
        this.add(ahojBT);
        ahojBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                lab.setText("Ahoj");
            }
        });
        
        lab = new Label("Výstup");
        this.add(lab);
        
        //Použití lambda expression
        Button nazdarBT = new Button("Nazdar");
        this.add(nazdarBT);
        nazdarBT.addActionListener((ActionEvent e) -> {
            lab.setText("Nazdar");
        });    
        
        
        this.setSize(300, 150);
    }

    public Label getLab() {
        return lab;
    }
    
    
    
}
