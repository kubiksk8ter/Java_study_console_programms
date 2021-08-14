/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zipctenizipfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author kuba
 */
public class ZipCteniZipFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {       
        cteni(new ZipFile("e:/pokus.zip"));       
    }
    
    static void cteni(ZipFile zf) throws IOException {
        System.out.println("Pocet zopakovanych polozek: " + zf.size());
        System.out.println("Jmeno: " + zf.getName());
        int cisloPolozky = 0;
        for(Enumeration e = zf.entries(); e.hasMoreElements();) {
            //Procházení složek a souborů
            ZipEntry ze = (ZipEntry) e.nextElement();
            System.out.print("Polozka cislo: " + (++cisloPolozky));
            System.out.println(" - " + (ze.isDirectory() ? "adresar" : "soubor"));
            System.out.print("  jmeno: " + ze.getName());
            System.out.print(", komprimovana velikost: " + ze.getCompressedSize());
            System.out.print(", skutecna velikost: " + ze.getSize() + "\n");
            if(ze.isDirectory()) continue;
            //čtení ze souboru
            InputStream is = zf.getInputStream(ze);
            int len = (int) ze.getSize();
            byte[] b = new byte[len];
            is.read(b, 0, len);
            System.out.println("Obsah souboru:");
            System.out.println(new String(b));                    
        }
    }   
}
