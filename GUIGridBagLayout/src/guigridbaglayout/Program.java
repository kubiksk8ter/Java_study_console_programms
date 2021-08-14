/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guigridbaglayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    GridBagConstraints gbc;
    GridBagLayout gb1;
    
    void vytvorTlacitko(String jmeno, int gridwidth) {
        JButton b = new JButton(jmeno);
        gbc.gridwidth = gridwidth;
        gb1.setConstraints(b, gbc);
        add(b);
    }

    public Program() {
        gb1 = new GridBagLayout();
        this.setLayout(gb1);
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH; //Každá komponenta zcela vyplní jí přidělené místo, tj. nebude mít svoji přirozenou velikost
        
        gbc.weightx = 1.0; //všechny 3 sloupce jsou vodorovně roztažitelné
        vytvorTlacitko("T1. 1", 1);
        vytvorTlacitko("Tlač. 2", GridBagConstraints.RELATIVE); //umístění za předešlou komponentu
        vytvorTlacitko("Tlačítko 3", GridBagConstraints.REMAINDER); //umístění jako poslední na řádce        
        gbc.weightx = 0.0; //roztažitelnost možno vypnout, je nastavena z první řádky
        vytvorTlacitko("Tlač. 4", 2); //šířka přes 2 buňky
        gbc.weighty = 1.0; //svislá roztažitelnost
        gbc.gridheight = 2; //výška přes 2 buňky
        vytvorTlacitko("Tlačítko 5", GridBagConstraints.REMAINDER);
        gbc.weighty = 0.0; //roztažitelnost opět možno vypnout, je nastavena tlačítkem 5
        gbc.gridheight = 1; //výška tlačítek 1 buňka
        gbc.gridx = 0; //první sloupec
        gbc.gridy = 2; //třetí řádka
        vytvorTlacitko("Tlačítko 6", 1);
        gbc.gridx = 1; //druhý sloupec
        vytvorTlacitko("T. 7", 1);
        
        this.setSize(300, 300);
    }   
}


