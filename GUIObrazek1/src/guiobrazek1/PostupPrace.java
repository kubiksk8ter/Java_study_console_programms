/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobrazek1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 *
 * @author kuba
 */
public class PostupPrace extends Canvas {
    private int procent = 0;
    private static final int OKRAJ = 3;
    private int vys = 10 + OKRAJ * 2;
    private boolean zobrazovatCislo;    
    public PostupPrace(boolean zobrazovat) {
        zobrazovatCislo = zobrazovat;}    
    public void nulujProcenta() {
        procent = 0;}    
    public void setProcenta(int p) {
        if(procent < p) {
            procent = p;
            repaint();
        }
    }    
    @Override
    public Dimension getMinimumSize() {
        return new Dimension(102, vys);}    
    @Override
    public Dimension getPreferredSize() {
        return getMinimumSize();}    
    @Override
    public void paint(Graphics g) {
        Dimension d = getSize();
        g.setColor(Color.blue);
        if(procent >= 99) {
            procent = 100;
        }
        if(zobrazovatCislo == true) {
            g.clearRect(1, 1, d.width- 2, d.height - 2);
            String s = "" + procent + "%";
            FontMetrics fm = g.getFontMetrics();
            int sir = fm.stringWidth(s);
            int xc = (d.width - sir);   
            g.drawString(s, xc, d.height -1 - OKRAJ);
            g.setXORMode(Color.white);
        }
        g.drawRect(0, 0, d.width - 1, d.height - 1);
        double p = procent/100.0;
        int xp = (int)(p*d.width);
        g.fillRect(1, 1, xp - 2, d.height - 2);
    }
}
