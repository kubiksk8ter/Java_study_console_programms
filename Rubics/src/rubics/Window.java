/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubics;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kuba
 */
public final class Window extends Frame {
    Button jedna, dva, tri, ctyri, pet, sest, sedm, osm, devet;
    Label label;
    Random r = new Random();    
    NastaveniBarvy nastavBarvu = new NastaveniBarvy();
    NastaveniBarvy2 nastavBarvu2 = new NastaveniBarvy2();
    ZavreniOkna zavri = new ZavreniOkna();
    Font f = new Font("Serif", Font.BOLD, 25);
    
    public Window() {
        super.setTitle("Rubics");        
        this.addWindowListener(zavri);
        this.setLayout(new GridLayout(3,3));
        
        jedna = new Button();
        this.add(jedna);
        nastavBarvu.nastavBarvu(jedna);
        jedna.addActionListener(new jednaAL());
        jedna.addActionListener(nahodne());
        
        dva = new Button();
        this.add(dva);
        nastavBarvu.nastavBarvu(dva);
        dva.addActionListener(new dvaAL());
        dva.addActionListener(nahodne());
        
        tri = new Button();
        this.add(tri);
        nastavBarvu.nastavBarvu(tri);
        tri.addActionListener(new triAL());
        tri.addActionListener(nahodne());
        
        ctyri = new Button();
        this.add(ctyri);
        nastavBarvu.nastavBarvu(ctyri);
        ctyri.addActionListener(new ctyriAL());
        ctyri.addActionListener(nahodne());
        
        pet = new Button();
        this.add(pet);
        nastavBarvu.nastavBarvu(pet);
        pet.addActionListener(new petAL());
        pet.addActionListener(nahodne());
        
        sest = new Button();
        this.add(sest);
        nastavBarvu.nastavBarvu(sest);
        sest.addActionListener(new sestAL());
        sest.addActionListener(nahodne());
        
        sedm = new Button();
        this.add(sedm);
        nastavBarvu.nastavBarvu(sedm);
        sedm.addActionListener(new sedmAL());
        sedm.addActionListener(nahodne());
        
        osm = new Button();
        this.add(osm);
        nastavBarvu.nastavBarvu(osm);
        osm.addActionListener(new osmAL());
        osm.addActionListener(nahodne());
        
        devet = new Button();
        this.add(devet);
        nastavBarvu.nastavBarvu(devet);
        devet.addActionListener(new devetAL());
        devet.addActionListener(nahodne());
        
        this.setSize(250, 250);
        this.setLocationByPlatform(true);
        
    }
    
    
    
    class jednaAL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nastavBarvu2.nastavBarvu(jedna);
            try {
                zhodnotVyhru();
            } catch (InterruptedException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    class dvaAL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nastavBarvu2.nastavBarvu(dva);
            try {
                zhodnotVyhru();
            } catch (InterruptedException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    class triAL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nastavBarvu2.nastavBarvu(tri);
            try {
                zhodnotVyhru();
            } catch (InterruptedException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    class ctyriAL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nastavBarvu2.nastavBarvu(ctyri);
            try {
                zhodnotVyhru();
            } catch (InterruptedException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    class petAL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nastavBarvu2.nastavBarvu(pet);
            try {
                zhodnotVyhru();
            } catch (InterruptedException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    class sestAL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nastavBarvu2.nastavBarvu(sest);
            try {
                zhodnotVyhru();
            } catch (InterruptedException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    class sedmAL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nastavBarvu2.nastavBarvu(sedm);
            try {
                zhodnotVyhru();
            } catch (InterruptedException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    class osmAL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nastavBarvu2.nastavBarvu(osm);
            try {
                zhodnotVyhru();
            } catch (InterruptedException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    class devetAL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nastavBarvu2.nastavBarvu(devet);
            try {
                zhodnotVyhru();
            } catch (InterruptedException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public ActionListener nahodne(){
        int n = r.nextInt(8);
        if(n == 0){
            return new jednaAL();
        }
        if(n == 1){
            return new dvaAL();
        }
        if(n == 2){
            return new triAL();
        }
        if(n == 3){
            return new ctyriAL();
        }
        if(n == 4){
            return new petAL();
        }
        if(n == 5){
            return new sestAL();
        }
        if(n == 6){
            return new sedmAL();
        }
        if(n == 7){
            return new osmAL();
        }
        else{
            return new devetAL();
        }
               
    }
    
    void zhodnotVyhru() throws InterruptedException {
        if((jedna.getBackground() == dva.getBackground())&&
           (jedna.getBackground() == tri.getBackground())&&
           (jedna.getBackground() == ctyri.getBackground())&&
           (jedna.getBackground() == pet.getBackground())&&
           (jedna.getBackground() == sest.getBackground())&&
           (jedna.getBackground() == sedm.getBackground())&&
           (jedna.getBackground() == osm.getBackground())&&
           (jedna.getBackground() == devet.getBackground())){
            jedna.setFont(f); jedna.setLabel("");
            dva.setFont(f);   dva.setLabel("");
            tri.setFont(f);   tri.setLabel("");
            ctyri.setFont(f); ctyri.setLabel("");
            pet.setFont(f);   pet.setLabel("COOL");
            sest.setFont(f);  sest.setLabel("");
            sedm.setFont(f);  sedm.setLabel("");
            osm.setFont(f);   osm.setLabel("");
            devet.setFont(f); devet.setLabel("");
            Thread.sleep(3000);
            System.exit(1);
        }
    }
    
}
