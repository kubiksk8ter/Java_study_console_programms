/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucharka;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class DatabazeReceptu {
    public ArrayList<Recept> recepty = new ArrayList<>(); 
    FileOutputStream fileOut;
    FileInputStream fileIn;
    ObjectOutputStream objectOut; 
    ObjectInputStream objectIn;
    
    public void ulozRecept(Recept r) {
        recepty.add(r);
        //Serializace objektu recept        
        try {
            fileOut = new FileOutputStream("Recepty//" + r.getNazev() + ".ser");
            objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(r);
            objectOut.close();
            fileOut.close();
            System.out.println("Serializace proběhla úspěšně.");
        } 
        catch (IOException e) {
        }
    }
    
    public void nactiRecepty () throws FileNotFoundException, IOException, ClassNotFoundException {
        Recept r = null;
        File f = new File("recepty//");
        String [] soubory = f.list();
        for(String nazev : soubory) {
            try {
                fileIn = new FileInputStream("Recepty//" + nazev);
                objectIn = new ObjectInputStream(fileIn);
                r = (Recept) objectIn.readObject();
                recepty.add(r);
                fileIn.close();
                objectIn.close();           
            } catch (ClassNotFoundException e) {
                System.out.println("Recept se nepodařilo načíst.");
            }
        }    
    }
      
    public void nactiNazvy(List list) {
        for(Recept r : recepty) {
            list.add(r.getNazev());
        }
    }
    
    public String testUlozeni() {
        String s = "";
        for(Recept r : recepty) {
            s += r.getNazev() + ", ";
            s += r.getPopis() + ",";
            s += r.getIngredience();
        }
        return s;
    }
}
