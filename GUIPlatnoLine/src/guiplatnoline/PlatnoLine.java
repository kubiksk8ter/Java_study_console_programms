/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiplatnoline;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author kuba
 */
public class PlatnoLine extends JPanel {
    @Override
    public void paint(Graphics g) {
        int x2 = getWidth() - 25;
        int y2 = getHeight() - 10;
        g.drawLine(15, 20, x2, y2);
    }   
}
