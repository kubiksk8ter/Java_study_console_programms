/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

import java.awt.*;

/**
 *
 * @author kuba
 */
public class Tlacitko1 extends Frame {
    Button ahojBT;
    Label lab;
    
    public Tlacitko1(String jmeno){
        try{
            this.setTitle(jmeno);          //V hlavičce okna se zobrazí název
            initMetoda();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void initMetoda() {              
        this.setLayout(new FlowLayout());   //Zajistí jednoduchý způsob umisťování komponent
        ahojBT = new Button("Ahoj");        //Vytvoření instance a pojmenování (a zobrazení na tlačítku) tlačítka
        this.add(ahojBT);                   //Příkaz zajistí zobrazení v okně
        lab = new Label("Stiskni!");
        this.add(lab);
        this.setSize(500, 250);             //Nastavení rozměrů okna(šířka, výška) v pixelech
    }
}
