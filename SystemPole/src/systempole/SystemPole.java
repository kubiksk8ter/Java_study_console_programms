/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempole;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kuba
 */
public class SystemPole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File pole = new File("e:\\Download\\test\\POLE.txt");
        if(pole.exists()==false){
            pole.createNewFile();
        }
        //Zápis pomocí PrintWriter
        long k = System.currentTimeMillis();
        int a = 0;
        PrintWriter pw = new PrintWriter(pole);
        for(int i = 1; i<=10;i++){
            pw.print(i);            
            pw.println();
            
        }
        long z = System.currentTimeMillis();
        System.out.println("Čas prvního měření je " + (z-k) + " ms");
        pw.close();
                
    }
    
}

