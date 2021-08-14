/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guimouseevent1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    JButton sMysiBT, vymazBT;
    JComboBox <String> vyslBtCH, vyslMysCH;
    JLabel mysiLB;
    public Program() {
        this.setLayout(new BorderLayout(10, 10));
        sMysiBT = new JButton("S mysi");
        //this.add(sMysiBT, BorderLayout.WEST);
        sMysiBT.addActionListener(new AL());        
        mysiLB = new JLabel ("Myší zóna", JLabel.CENTER);
        mysiLB.setBackground(Color.LIGHT_GRAY);
        mysiLB.setName("Myší lejbl");
        this.add(mysiLB);       
        vymazBT = new JButton("Vymaž");
        this.add(vymazBT, BorderLayout.EAST);
        vymazBT.setBackground(Color.WHITE);
        vymazBT.addActionListener(new AL());        
        vyslBtCH = new JComboBox<String>();
        //this.add(vyslBtCH, BorderLayout.SOUTH);        
        vyslMysCH = new JComboBox<String>();
        this.add(vyslMysCH, BorderLayout.NORTH);        
        sMysiBT.addMouseMotionListener(new ML());
        mysiLB.addMouseMotionListener(new ML());        
        this.setSize(300, 150);
    }    
    class AL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            vyslBtCH.addItem("'" + s + "' vybrán myší");
            vyslBtCH.setSelectedIndex(vyslBtCH.getItemCount() -1);
            if (e.getActionCommand().compareTo("Vymaž") == 0) {
                vyslMysCH.removeAllItems();
                vyslBtCH.removeAllItems();
            }
        }    
    }    
    void vypis (String co, MouseEvent e) {
        String c = String.valueOf(vyslMysCH.getItemCount() +1);
        int x = e.getX();
        int y = e.getY();
        String s = " [" + x + ", " + y + "]"; 
        vyslMysCH.addItem(c + "." + co + " " + s);
        vyslMysCH.setSelectedIndex(vyslMysCH.getItemCount() - 1);
    }    
    class ML implements MouseMotionListener {
        @Override
        public void mouseMoved(MouseEvent e) {
            vypis("pohyb", e);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            vypis("tažení", e);
        }
        
    }   
}
