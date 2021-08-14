/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guikeyboarddraw;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 *
 * @author kuba
 */
public class Platno extends Canvas {
    private int x1, y1;
    private int x2, y2;
    private boolean kruznice = false;
    public Platno() {
        this.addMouseListener(new ML());
        this.addMouseMotionListener(new MML());
        this.addKeyListener(new KL());        
    }
    class ML extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            x1 = e.getX(); y1 = e.getY();}
    }
    class MML extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            x2 = e.getX(); y2 = e.getY();
            repaint();}
    }
    class KL extends KeyAdapter {
        @Override
        public void keyPressed (KeyEvent e) {
            if(e.isShiftDown()) {
                kruznice = true;
                repaint();}
        }
        @Override
        public void keyReleased (KeyEvent e) {
            kruznice = false;
            repaint();}
    }
    @Override
    public void paint (Graphics g) {
        int sir = x2 - x1;
        int vys = y2 - y1;
        if(kruznice == true) {
            g.setColor(Color.red);
            int prumer = (sir + vys);
            sir = vys = prumer;
        }
        g.drawOval(x1, y1, sir, vys);
    }
}
