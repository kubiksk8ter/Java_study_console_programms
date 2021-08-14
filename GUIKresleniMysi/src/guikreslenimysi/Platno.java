/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guikreslenimysi;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 *
 * @author kuba
 */
public class Platno extends Canvas {
    private int x1, x2, y1, y2;
    boolean upda = false, pain = true;
    public Platno() {
        this.setForeground(Color.red);
        this.setSize(400, 400);
        this.addMouseListener(new ML());
        this.addMouseMotionListener(new MML());}
    class ML extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            setPocatek(e.getX(), e.getY());
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            setKonec(e.getX(), e.getY());
    }   }
    class MML extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            if(pain == false) {
                Graphics grP1 = Platno.this.getGraphics();
                grP1.drawLine(x1, y1, e.getX(), e.getY());}
            else 
                setKonec(e.getX(), e.getY());            
    }   }
    void setPocatek(int x, int y) {
        x1 = x;
        y1 = y;}
    void setKonec(int x, int y) {
        x2 = x;
        y2 = y;
        repaint();}
    @Override
    public void update(Graphics g) {
        if(upda == true) 
            paint(g);        
        else 
            super.update(g);}
    @Override
    public void paint(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }
}
