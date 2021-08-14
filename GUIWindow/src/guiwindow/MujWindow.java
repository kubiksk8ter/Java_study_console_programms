/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiwindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;

/**
 *
 * @author kuba
 */
public class MujWindow extends Frame {
    public MujWindow() {
        this.setLayout(new BorderLayout());
        Window w = new Window(this);
        w.setLayout(new BorderLayout());
        w.setSize(100, 75);
        w.setLocation(85, 15);
        w.setBackground(Color.lightGray);
        w.setVisible(true);
        this.setSize(250, 65);
    }
    
    
}
