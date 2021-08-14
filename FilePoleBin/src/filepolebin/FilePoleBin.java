/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepolebin;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author kuba
 */
public class FilePoleBin {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Vytvoření instancí
        FileReader fr = new FileReader(new File("e:\\Download\\test\\POLE.txt"));
        BufferedReader br = new BufferedReader(fr);       
        //Čtení souboru a výpis do konzole
        //for(int i = 0; i < 10; i++){
            //System.out.println(br.readLine());
        //}
        //Uložení souboru do dvourozměrného pole
        String s = "";
        String[]radka = null;
        int[][] pole = new int[10][10];       
        for(int x = 0;x<10;x++) {  
            s = br.readLine();
            radka = s.split(", ");
            for(int y = 0; y<10;y++) {               
                pole[y][x]=Integer.parseInt(radka[y]);
            }
        }        
        //Výpis dvourozměrného pole
        for(int y = 0;y<pole[0].length;y++){
            for(int x = 0;x<pole.length;x++){
                System.out.print(pole[x][y]+" ");
            }
            System.out.println();
        }
        //Uložení dvourozměrného pole do bin
        File poleInt = new File("e:\\Download\\test\\POLEINT.bin");
        if(poleInt.exists()==false){
            poleInt.createNewFile();
        }
        FileOutputStream poleBin = new FileOutputStream(poleInt);
        DataOutputStream fw = new DataOutputStream(poleBin);
        for(int y = 0;y<pole[0].length;y++){
            for(int x = 0;x<pole.length;x++){
                fw.writeInt(pole[x][y]);
            }
        }
        fr.close();
        br.close();
        fw.close();
        //Porovnání souborů POLE.txt a POLEINT.bin
        RandomAccessFile frr = new RandomAccessFile("e:\\Download\\test\\POLE.txt","r");
        RandomAccessFile frrr = new RandomAccessFile("e:\\Download\\test\\POLEINT.bin","r");
        
        System.out.println("Velikost souboru POLE.txt: " + frr.length());
        System.out.println("Velikost souboru POLEINT.bin: " + frrr.length());

        
        
    }
    
}
