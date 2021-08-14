/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guirozdelenikomponent;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.*;

/**
 *
 * @author kuba
 */
public class Window extends Frame {
    Button a;
    Label l;
    String sizeLoc;

    public Window() {  
        a = new Button("a");
        this.add(a);
        a.setSize(20, 20);      //Nastavení velikosti
        a.setLocation(20, 50);  //Nastavení pozice
        
        l = new Label();
        this.add(l);
        this.setSize(250, 200); //Velikost okna
        
        rozmery();
        l.setText(sizeLoc);
    }
    
    void rozmery(){
        Dimension d = a.getSize();
        Point p = a.getLocation();
        sizeLoc = "Šířka: " + d.width + " , "
                + "Výška: " + d.height+ " , "
                + "Pozice: [" + p.x + "," + p.y + "]";         
    } 
    
}
