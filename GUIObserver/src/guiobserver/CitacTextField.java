/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobserver;

import java.awt.TextField;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author kuba
 */
public class CitacTextField extends TextField implements Observer {

    public CitacTextField(int hodnota) {
        this.setColumns(6);
        this.setEditable(false);
        this.setText("" + hodnota);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        this.setText(arg.toString());
    }    
}
