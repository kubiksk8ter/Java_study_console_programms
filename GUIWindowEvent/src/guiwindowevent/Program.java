/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiwindowevent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    JButton noveBT, zrusBT;
    JComboBox <String> vyslWinCH;
    JFrame okno;

    public Program() {
        this.setLayout(new FlowLayout());
        
        noveBT = new JButton("Nové okno");
        this.add(noveBT);
        noveBT.addActionListener(new NAL());
        
        zrusBT = new JButton("Zruš okno");
        this.add(zrusBT);
        zrusBT.addActionListener(new ZAL());
        
        vyslWinCH = new JComboBox();
        vyslWinCH.addItem("Události nového okna");
        this.add(vyslWinCH);
        
        this.setSize(220, 120);
        
        okno = new JFrame("Nové okno");
        okno.setSize(160, 60);
        okno.setLocation(150, 150);
        okno.addWindowListener(new WL());               
    }    
    class NAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            okno.setVisible(true);
        }        
    }
    class ZAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            okno.dispose();
        }       
    }
    void vypis(String co) {
        String c = String.valueOf(vyslWinCH.getItemCount());
        vyslWinCH.addItem(c + "." + co);
        vyslWinCH.getItemAt(vyslWinCH.getItemCount() - 1);
    }
    class WL implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            vypis("Poprvé otevřeno");
        }
        @Override
        public void windowClosing(WindowEvent e) {
            vypis("Zavření myší");
            e.getWindow().dispose();
        }
        @Override
        public void windowClosed(WindowEvent e) {
            vypis("Zavření programem");
        }
        @Override
        public void windowIconified(WindowEvent e) {
            vypis("Ikona");
        }
        @Override
        public void windowDeiconified(WindowEvent e) {
            vypis("Obnovení");
        }
        @Override
        public void windowActivated(WindowEvent e) {
            vypis("Aktivace");
        }
        @Override
        public void windowDeactivated(WindowEvent e) {
            vypis("Deaktivace");
        }        
    }    
}
