/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guioramovanisouradnice;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    JLabel sour1LB, sour2LB, opLB;
    Platno p1;
    public Program() {
        opLB = new JLabel ("[000, 000]");
        sour1LB = new JLabel("[000, 000]");
        sour2LB = new JLabel("[000, 000]");
        JPanel horniP = new JPanel();
        horniP.add(opLB);
        horniP.add(sour1LB);
        horniP.add(sour2LB);
        this.add(horniP, BorderLayout.NORTH);
        p1 = new Platno();
        OramovanyPanel op = new OramovanyPanel();
        op.setLayout(new BorderLayout());
        op.add(p1, BorderLayout.CENTER);
        this.add(op, BorderLayout.CENTER);
        this.setSize(300, 150);
        p1.addMouseListener(new ML());
        op.addMouseMotionListener(new MML(opLB));
        p1.addMouseMotionListener(new MML(sour1LB));        
    }
    void vypisSouradnice(int x, int y, JLabel l) {
        String s = "[" + x + ", " + y + "]";
        l.setText(s);}
    class ML extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            vypisSouradnice(e.getX(), e.getY(), sour1LB);
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            vypisSouradnice(e.getX(), e.getY(), sour2LB);
        }
    }
    class MML extends MouseMotionAdapter {
        JLabel kam;
        MML(JLabel l) { kam = l; }
        @Override
        public void mouseMoved(MouseEvent e) {
            vypisSouradnice(e.getX(), e.getY(), kam);
        }
    }
}
