/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicursor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame {
    final int pocetKurzoru = 14;
    int aktKurzor = 0;
    Button zmenBT;
    Label typLB;
    
    public Window() {
        super.setTitle("Kurzory");
        this.setLayout(new GridLayout(2,1));
        zmenBT = new Button("Změň kurzor");
        this.add(zmenBT);
        
        typLB = new Label();
        this.add(typLB);
        
        this.setSize(350, 150);
        this.setLocationByPlatform(true);
        
        zmenBT.addActionListener(new zmenAL());
        typKurzoru(zmenBT.getCursor());
    
    }
    
    class zmenAL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(++aktKurzor ==  pocetKurzoru){
                aktKurzor = 0;
            }
            Cursor c = new Cursor(aktKurzor);
            typLB.setCursor(c);
            typKurzoru(c);
        }
        
    }
    void typKurzoru(Cursor c){
        String s = "    " + c.getName().concat(", typ = ").concat(Integer.toString(c.getType()));
        typLB.setText(s);
    }       
}
