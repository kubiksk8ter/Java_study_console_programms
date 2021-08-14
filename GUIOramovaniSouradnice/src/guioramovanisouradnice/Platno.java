/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guioramovanisouradnice;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author kuba
 */
public class Platno extends Canvas {
    @Override
    public void paint (Graphics g) {
        Dimension d = getSize();
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, d.width - 1, d.height - 1);
    }
}
