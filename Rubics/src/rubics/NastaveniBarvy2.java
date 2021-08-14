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
public class NastaveniBarvy2 {
    
    void nastavBarvu(Button b){
        if(b.getBackground().equals(Color.red)){
            b.setBackground(Color.yellow);
        }
        else if(b.getBackground().equals(Color.yellow)){
            b.setBackground(Color.blue);
        }
        else if(b.getBackground().equals(Color.blue)){
            b.setBackground(Color.orange);
        }
        else if(b.getBackground().equals(Color.orange)){
            b.setBackground(Color.green);
        }
        else if(b.getBackground().equals(Color.green)){
            b.setBackground(Color.white);
        }
        else{
            b.setBackground(Color.red);
        }
        
    }
}
