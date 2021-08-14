/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiplatnoline;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {

    public Program() {
        this.setLayout(new BorderLayout());
        PlatnoLine p1 = new PlatnoLine();
        this.add(p1, BorderLayout.CENTER);
        this.setSize(200, 100);        
    }    
}
