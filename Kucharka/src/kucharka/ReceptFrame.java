/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucharka;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author kuba
 */
public class ReceptFrame extends JFrame {
    private final Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
    private JLabel popisReceptuL, ingredienceLabel, nazevLabel;
    private JTextArea popisTA;
    private JButton uloz;
    private JTextField nazevTF, ingredience1, ingredience2, ingredience3, ingredience4,
        ingredience5, ingredience6, ingredience7, ingredience8, ingredience9,
        ingredience10;
    private Recept recept = new Recept();
       
    public ReceptFrame() {
        Initialize();
    }
    public final void Initialize() {
        
        super.setTitle("Recept");        
        this.setSize(400, 400);
        this.setLocation(50, 50);
        //Zavření okna křížkem
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                this.windowClosed(e);                
            }
        });
        //Konstruktory
        popisReceptuL = new JLabel("Návod na přípravu", JLabel.CENTER);
        ingredienceLabel = new JLabel("Ingredience", JLabel.CENTER);
        nazevLabel = new JLabel("Název Receptu: ");
        nazevTF = new JTextField(14);
        popisTA = new JTextArea("", 15, 20); popisTA.setBorder(border);
        uloz = new JButton("Ulož");
        ingredience1 = new JTextField();
        ingredience2 = new JTextField();
        ingredience3 = new JTextField();
        ingredience4 = new JTextField();
        ingredience5 = new JTextField();
        ingredience6 = new JTextField();
        ingredience7 = new JTextField();
        ingredience8 = new JTextField();
        ingredience9 = new JTextField();
        ingredience10 = new JTextField();
        recept = new Recept();
                        
        this.setLayout(new GridBagLayout());
        this.setSize(400, 400);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        
        //Levý horní panle
        gbc.weightx = 1.0; gbc.weighty = 1.0; gbc.gridx = 0; gbc.gridy = 0;
        
        JPanel panelLH = new JPanel();
        panelLH.setLayout(new BorderLayout());
        panelLH.add(nazevLabel, BorderLayout.WEST);
        panelLH.add(nazevTF, BorderLayout.EAST);
        this.add(panelLH);

        //Levý dolní panel
        gbc.gridx = 0; gbc.gridy = 1; gbc.ipady = 0;
        JPanel panelLD = new JPanel();
        panelLD.setBorder(border);
        panelLD.setLayout(new BorderLayout());     
        panelLD.add(popisReceptuL, BorderLayout.NORTH);        
        panelLD.add(popisTA);
        this.add(panelLD, gbc);                
                
        //Pravý panel 
        gbc.weightx = 1.0; gbc.gridx = 1; gbc.gridy = 0; gbc.gridheight = 2;
        JPanel panelP = new JPanel();
        panelP.setBorder(border);
        panelP.setLayout(new GridLayout(12, 1));
        panelP.add(ingredienceLabel);
        panelP.add(ingredience1);
        panelP.add(ingredience2);
        panelP.add(ingredience3);
        panelP.add(ingredience4);
        panelP.add(ingredience5);
        panelP.add(ingredience6);
        panelP.add(ingredience7);
        panelP.add(ingredience8);
        panelP.add(ingredience9);
        panelP.add(ingredience10);
        panelP.add(uloz);
        this.add(panelP, gbc);
        //Uložení receptu do databáze a zavření okna
        uloz.addActionListener((ActionEvent e) -> {
            recept.setNazev(nazevTF.getText());
            recept.setPopis(popisTA.getText());
            recept.setIngredience(ingredience1.getText());
            recept.setIngredience(ingredience2.getText());
            recept.setIngredience(ingredience3.getText());
            recept.setIngredience(ingredience4.getText());
            recept.setIngredience(ingredience5.getText());
            recept.setIngredience(ingredience6.getText());
            recept.setIngredience(ingredience7.getText());
            recept.setIngredience(ingredience8.getText());
            recept.setIngredience(ingredience9.getText());
            recept.setIngredience(ingredience10.getText());
            Kucharka.MF.DB.ulozRecept(recept);
            System.out.println(Kucharka.MF.DB.testUlozeni()); //test
            try {
                Kucharka.MF.InitializeMF();
            } catch (IOException ex) {
                Logger.getLogger(ReceptFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ReceptFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();            
        });        
    }    
}
