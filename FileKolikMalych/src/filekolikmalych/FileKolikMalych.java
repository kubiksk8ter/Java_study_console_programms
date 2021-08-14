/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filekolikmalych;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kuba
 */
public class FileKolikMalych {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File pismena = new File("e:\\Download\\test\\PISMENA.txt");
        File kolik = new File("e:\\Download\\test\\KOLIK.txt");
        if(kolik.exists() == false){
            kolik.createNewFile();
        }
        if (pismena.exists() == true) {
            FileReader fr = new FileReader(pismena);
            FileWriter fw = new FileWriter(kolik);
            BufferedReader bfr= new BufferedReader(fr);
            PrintWriter pw = new PrintWriter(kolik);
            
            String radka;
            
            while((radka = bfr.readLine()) != null){
                System.out.println(radka);
                int pocet = 0;
                for(int i = 0; i< radka.length(); i++){
                    if(Character.isLowerCase(radka.charAt(i))){
                        pocet++;
                    }
                }               
                pw.println(radka);
                pw.println(pocet);
              
            }
            fr.close();            
            pw.close();
            bfr.close();
            fw.close();
            
            
        }
        
    }
    
}
