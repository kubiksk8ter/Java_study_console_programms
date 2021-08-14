/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipnuti;

import java.awt.Toolkit;

/**
 *
 * @author kuba
 */
public class Pipnuti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program způsobí krátké pípnutí");
        // ASCII bell
        System.out.print("\007");
        System.out.flush();
        java.awt.Toolkit.getDefaultToolkit().beep();
    }
    
}
