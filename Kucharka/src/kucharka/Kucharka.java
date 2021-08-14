/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucharka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Jakub
 */
public class Kucharka {
    static MainFrame MF;
        
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        MF = new MainFrame();
        MF.setVisible(true);
        /**
        Recept r = new Recept();//test
        r.setNazev("Vejce");//test
        MF.DB.ulozRecept(r);//test
        System.out.println(MF.DB.recepty.size());//test
        */
    }
    
}
