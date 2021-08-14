/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guioramovanisouradnice;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;

/**
 *
 * @author kuba
 */
public class OramovanyPanel extends JPanel{
    private final static int OKRAJ = 10;
    @Override
    public Insets getInsets() {
        return new Insets (OKRAJ, OKRAJ, OKRAJ, OKRAJ);
    }
    @Override
    public void paint (Graphics g) {
        Dimension d = getSize();
        g.drawRect(1, 1, d.width - 3, d.height - 3);
    }
}
