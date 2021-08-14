/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaplet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author kuba
 */
public class Program extends Applet {
    @Override
    public void paint (Graphics g) {
        g.drawString("Prvni a druhy aplet", 10, 20);
    }
}
