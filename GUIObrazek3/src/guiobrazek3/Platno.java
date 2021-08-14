/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobrazek3;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author kuba
 */
public class Platno extends Canvas {
    Image img = null;
    @Override
    public Dimension getMinimumSize() {
        return new Dimension(Program.ROZSAH,
                             Program.ROZSAH);
    }
    @Override
    public Dimension getPreferredSize() {
        return getMinimumSize();
    }
    void vykresliObrazek(Image img) {
        this.img = img;
    }
    @Override
    public void update(Graphics g) {
        paint(g);
    }
    @Override
    public void paint(Graphics g) {
        Dimension d = getSize();
        if(img != null) {
            g.drawImage(img, 0, 0, d.width - 1, d.height - 1, this);
        }
    }
}
