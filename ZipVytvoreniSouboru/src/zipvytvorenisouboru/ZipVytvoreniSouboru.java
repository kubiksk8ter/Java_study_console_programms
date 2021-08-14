/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zipvytvorenisouboru;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author kuba
 */
public class ZipVytvoreniSouboru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("e:/ahoj/");  f.mkdir();
        File fi = new File("e:/ahoj/ahoj.txt"); fi.createNewFile();
        zapis("e:/vystup.zip", fi);
    }
    
    static void zapis(String cestaUlozeni, File fi) throws FileNotFoundException, IOException {
        FileOutputStream fo = new FileOutputStream(cestaUlozeni);
        ZipOutputStream zfo = new ZipOutputStream(fo);       
        FileInputStream fis = new FileInputStream(fi);
        long delka = fi.length();
        byte[] obsahSouboru = new byte[(int) delka];
        fis.read(obsahSouboru);
        fis.close();
                  
        String jmenoSouboru = "ahoj" + ".txt";
        ZipEntry zeSoub = new ZipEntry(jmenoSouboru);
        zfo.putNextEntry(zeSoub);
        zfo.write(obsahSouboru);
        zfo.closeEntry();
        
        zfo.close();
    }    
}
