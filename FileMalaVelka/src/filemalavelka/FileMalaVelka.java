/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemalavelka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class FileMalaVelka {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File pismena = new File("e:\\Download\\test\\PISMENA.txt");
        File velky = new File("e:\\Download\\test\\VELKY.txt");
        FileReader fr = new FileReader(pismena);
        FileWriter fw = new FileWriter(velky);
        int c;
        for(int i = 0; i< pismena.length();i++){
            c = fr.read();            
            System.out.print((char)c);            
            fw.write(Character.toUpperCase(c));
        }
        fr.close();
        fw.close();
        
        
    }
    
    
}
