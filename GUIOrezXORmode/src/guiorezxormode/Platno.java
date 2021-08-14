/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiorezxormode;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 *
 * @author kuba
 */
public class Platno extends Canvas {
    int x1, y1, x2, y2;
    boolean clp = false;

    public Platno() {
        this.addMouseListener(new ML());
        this.addMouseMotionListener(new MML());
    }    
    @Override
    public void paint(Graphics g) {
        if(clp == true){            
            Dimension d = getSize();
            g.drawRect(0, 0, d.width / 2, d.height / 2);
            g.setClip(0, 0, d.width / 2, d.height / 2);
            
            g.setColor(Color.lightGray);
            g.fillRect(1, 1, d.width / 4, d.height / 2);
            g.setColor(Color.yellow);
            g.fillRect(d.width / 4, 1, d.width / 4, d.height / 2);
            g.setXORMode(Color.BLACK);
        }
        g.drawLine(x1, y1, x2, y2);
    }
    class ML extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            x1 = e.getX(); y1 = e.getY();
        }
    }
    class MML extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            x2 = e.getX(); y2 = e.getY();
            repaint();
        }      
    }
}
