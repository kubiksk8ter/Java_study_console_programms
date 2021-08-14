/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

import java.awt.Button;
import java.awt.event.ActionEvent;

/**
 *
 * @author kuba
 */
public class Tlacitko4 extends Tlacitko3{
    Button ZdravickoBT;
    
    public Tlacitko4(String jmeno) {
        super(jmeno);
        ZdravickoBT = new Button("Zdravíčko");
        this.add(ZdravickoBT);
        ZdravickoBT.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        String napis = "";
        if(s.equals(ahojBT.getLabel())){
            napis = ahojBT.getLabel();
        }
        else if(s.equals(nazdarBT.getLabel())){
            napis = nazdarBT.getLabel();            
        }
        else if(s.equals(ZdravickoBT.getLabel())){
            napis = ZdravickoBT.getLabel();
        }
        lab.setText(napis);
    }
    
}
