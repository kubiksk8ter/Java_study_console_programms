/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiudalost;

import java.awt.AWTEvent;
import java.awt.Button;
import java.awt.event.ActionEvent;

/**
 *
 * @author kuba
 */
public class UdalostBT extends Button {

    public UdalostBT(String jmeno) {
        super(jmeno);
    }
    
    @Override
    public void processEvent(AWTEvent e){
        super.processEvent(e);
    }
    
    void provedUdalost() {
        String s = this.getLabel();
        super.processEvent(new ActionEvent(this, 1, s));
    }
}
