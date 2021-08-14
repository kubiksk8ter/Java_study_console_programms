/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobrazek1;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

/**
 *
 * @author kuba
 */
public class Platno extends Canvas implements ImageObserver {
    Image img;
    PostupPrace pp;

    public Platno(PostupPrace p) {
        pp = p;
    }
    
    @Override
    public boolean imageUpdate(Image img, int info, int x, int y, int w, int h) {
        double celkVyska = (double) img.getHeight(this);
        int proc = (int)((y/celkVyska) * 100.0);
        pp.setProcenta(proc);
        boolean hotovo = ((info & (ERROR|ALLBITS)) != 0);
        if(hotovo) {
            repaint();
        }
        return !hotovo;
    }
           
    void nactiObrazek (String jmeno) {
        Toolkit t = this.getToolkit();
        img = t.getImage(jmeno);
        pp.nulujProcenta();
        repaint();
    }
    
    @Override
    public void paint(Graphics g) {
        Dimension d = getSize();
        if(img != null) {
            g.drawImage(img, 0, 0, d.width - 1, d.height - 1, this);
        }
    }        
}
