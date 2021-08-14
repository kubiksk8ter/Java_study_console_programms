/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiimg;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

/**
 *
 * @author kuba
 */
public class Program extends Frame {

    public Program() {
        this.setLayout(new FlowLayout());
        Toolkit t = Toolkit.getDefaultToolkit(); //Vytvoří objekt typu Toolkit
        Image img = t.getImage("pretor.gif");    //Načte obrázek pomocí Toolkit
        this.setIconImage(img);
        
        int i = t.getScreenResolution();
        Label dpi = new Label("DPI: " + i);
        this.add(dpi);
        
        Dimension d = t.getScreenSize();
        String s = "[" + d.width + ", " + d.height + "]";
        Label vel = new Label(s);
        this.add(vel);
        
        this.pack();
        this.setLocation(800, 480);              
        this.setResizable(false);                 //Zabrání zvětšení
    }    
}
