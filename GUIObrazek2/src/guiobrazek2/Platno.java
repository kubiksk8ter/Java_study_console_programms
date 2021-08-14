/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobrazek2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JLabel;

/**
 *
 * @author kuba
 */
public class Platno extends Canvas {
    Image img;
    int sirka, vyska;
    boolean cely, zmenseny, natazeny;
    Platno() {
        this.setBackground(Color.red);
        Toolkit t = this.getToolkit();
        MediaTracker mt = new MediaTracker(this);
        img = t.getImage("kocka.jpg");
        mt.addImage(img, 0);
        try { mt.waitForAll(); }
        catch (InterruptedException e) {e.printStackTrace(); }
        sirka = img.getWidth(this);
        vyska = img.getHeight(this);
    }
    void vykresliObrazek (boolean c, boolean z, boolean n) {
        cely = c;
        zmenseny = z;
        natazeny = n;
        repaint();    }
    @Override
    public void paint(Graphics g) {
        Dimension d = getSize();
        double pomerx = (double) d.width/sirka;
        int px = d.width;
        int py = (int) (vyska * pomerx);
        int dy = (d.height - py) / 2;
        int dx = 0;
        if(py > d.height) {
            double pomer = (double) d.height/vyska;
            px = (int)(sirka*pomer);
            py = d.height;
            dx = (d.width - px) / 2;
            dy = 0;
        }
        if(cely == true) {
            g.drawImage(img, 0, 0, this);
        }
        if(zmenseny == true) {
            g.drawImage(img, dx, dy, px, py, this);
        }
        if(natazeny == true) {
            g.drawImage(img, 0, 0, d.width - 1, d.height - 1, this);
        }    }   }
