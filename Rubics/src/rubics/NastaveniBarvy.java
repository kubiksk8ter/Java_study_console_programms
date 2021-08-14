/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubics;

import java.awt.Button;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author kuba
 */
public class NastaveniBarvy {
    Random r = new Random();
    
    void nastavBarvu(Button b){
        int barva = r.nextInt(6);  
        switch (barva) {
            case 0:
                b.setBackground(Color.red);
                break;
            case 1:
                b.setBackground(Color.blue);
                break;
            case 2:
                b.setBackground(Color.yellow);
                break;
            case 3:
                b.setBackground(Color.ORANGE);
                break;
            case 4:
                b.setBackground(Color.WHITE);
                break;
            case 5:
                b.setBackground(Color.GREEN);
                break;
            default:
                break;
        }
        
    }
    
    
}
