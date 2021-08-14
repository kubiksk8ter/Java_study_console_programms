/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubics;

import java.awt.event.*;

/**
 *
 * @author kuba
 */
public class ZavreniOkna extends WindowAdapter {
    
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(1);
    }
    
}
