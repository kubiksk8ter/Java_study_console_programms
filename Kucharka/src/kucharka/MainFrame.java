/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucharka;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Jakub
 */
public class MainFrame extends JFrame {
    private JButton pridej;    
    private final Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
    public DatabazeReceptu DB;;
    private List list;

    public MainFrame() throws IOException, FileNotFoundException, ClassNotFoundException, ClassNotFoundException {
        this.DB = new DatabazeReceptu();
        InitializeMF();                
    }

    public final void InitializeMF() throws IOException, FileNotFoundException, ClassNotFoundException {
        DB.nactiRecepty();
        //Zavření okna křížkem
        this.addWindowListener(new WindowAdapter(){  
            @Override
            public void windowClosing(WindowEvent e) {  
                System.exit(0);
            }
        });
        //Konstruktory
        pridej = new JButton("Přidej recept");
        list = new List(); DB.nactiNazvy(list);//nefunkční. Proč?
        System.out.println(DB.recepty.size());
        
        //Hlavní okno
        super.setTitle("Kuchařka");
        this.setLayout(new GridBagLayout());
        this.setSize(500, 500);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        
        //Levý panel
        gbc.weightx = 1.0; gbc.weighty = 1.0; gbc.gridx = 0; gbc.gridy = 0;
        
        JPanel panelL = new JPanel();
        panelL.setBorder(border);
        panelL.setLayout(new GridLayout());
        this.add(panelL, gbc);               
        panelL.add(list);
        
        //Pravý panel
        gbc.weightx = 0.0; gbc.gridx = 1; gbc.gridy = 0;
        
        JPanel panelP = new JPanel();
        panelP.setBorder(border);
        this.add(panelP, gbc);        
        pridej.addActionListener(new pridejAL());
        panelP.add(pridej);
    }

    public class pridejAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ReceptFrame RF = new ReceptFrame();
            RF.setVisible(true);
        }
        
    }
    
}
