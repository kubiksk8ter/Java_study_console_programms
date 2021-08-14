/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitextfield;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements ActionListener {
    TextField vstupTF, echoTF;
    Label vysledekLB;

    public Window() {
        this.setLayout(new FlowLayout());
        vstupTF = new TextField(10);
        echoTF = new TextField();
        
        Label popisVstupLB = new Label("Vstup", Label.RIGHT);
        Label popisEchoLB = new Label("Echo", Label.RIGHT);
        vysledekLB = new Label("Zde bude opsan vstup");
        
        this.add(popisVstupLB);
        this.add(vstupTF);
        this.add(popisEchoLB);
        this.add(echoTF);
        this.add(vysledekLB);
        this.setSize(250, 110);
        
        vstupTF.addActionListener(new ActionListener() { //použijeme annonymní vnitřní třídu jako
            @Override                                    //obsluhu událostí, protože v metodě actionPerformed()
            public void actionPerformed(ActionEvent e) { //nelze snadno zjistit, který textfield tuto událost vygeneroval
                vysledekLB.setText(e.getActionCommand());
            }
        });
        
        echoTF.addActionListener((ActionEvent e) -> {    //použití annonymní vnitřní třídy využívající lambda expression
            char echo = e.getActionCommand().charAt(0);
            if(echo == '0'){
                vstupTF.setEchoChar((char)0);
            }
            else{
                vstupTF.setEchoChar(echo);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
