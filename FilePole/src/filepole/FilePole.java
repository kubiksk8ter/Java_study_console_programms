/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepole;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kuba
 */
public class FilePole {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        File pole = new File("e:\\Download\\test\\POLE.txt");
        if(pole.exists()==false){
            pole.createNewFile();
        }
        int a = 0;
        PrintWriter pw = new PrintWriter(pole);
        for(int i = 1; i<=100;i++){
            pw.print(i);            
            a++;
            if(a!=10){
                pw.print(", ");
            }
            else{                
                pw.println();
                a = 0;
            }
        }
        pw.close();
    }
    
}
