/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.cookbook;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author kuba
 */
public class Obrazky {
    private Image img;
    
    /**
     * Uloží obrázek do složky obrázky
     * @param imgCesta
     * @param nazevImg
     * @throws IOException
     */
    public void ulozObrazek(String imgCesta, String nazevImg) throws IOException {
        try {
            File file = new File(imgCesta);
            img = ImageIO.read(file);
            ImageIO.write((RenderedImage) img, "jpg", new File("Recepty//Obrazky//" + nazevImg + ".jpg"));
            System.out.println("Obrázek " + nazevImg + " byl úspěšně uložen");
            
        }
        catch (IOException e) {
            System.out.println("Obrázek se nepodařilo uložit");
            System.out.println(e.getLocalizedMessage());
        }        
    }
    
    /**
     * Načte obrázek ze složky Obrázky
     * @param nazev
     * @return obrázek receptu
     */
    public Image nactiObrazek(String nazev) {
        try {
            img = ImageIO.read(new File("Recepty//Obrazky//" + nazev + ".jpg"));
        } catch (IOException ex) {
            System.out.println("Obrázek se nepodařilo načíst");
            Logger.getLogger(Obrazky.class.getName()).log(Level.SEVERE, null, ex);
        }
        return img;
    }
    
    /**
     * Vymaže obrázek ze složky Obrázky
     * @param nazev
     */
    public void vymazObrazek(String nazev) {
        File file = new File("Recepty//Obrazky//" + nazev + ".jpg");      
        file.delete();
    }
}
