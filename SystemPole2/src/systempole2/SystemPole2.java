/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempole2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kuba
 */
public class SystemPole2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File pole = new File("e:\\Download\\test\\POLE.txt");
        if(pole.exists()==false){
            pole.createNewFile();
        }
        //Zápis pomocí PrintWriter
        PrintWriter fw = new PrintWriter(pole);
        BufferedWriter bw = new BufferedWriter(fw);
        long k = System.currentTimeMillis();
        int a = 0;
        for(int i = 1; i<=10;i++){
            bw.write(String.valueOf(i));            
            a++;
            if(a!=10){
                bw.write(", ");
            }
            else{                
                bw.newLine();
                a = 0;
            }
        }
        long z = System.currentTimeMillis();
        System.out.println("Čas prvního měření je " + (z-k) + " ms");
        fw.close();
                
    }
    
}

