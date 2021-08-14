/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg28.garáž;

/**
 *
 * @author kuba
 */
public class auto {
    public String barva;
    public String spz;
    garaz garaz = new garaz();
    
    
    public void zaparkuj(String spz){ 
        this.spz = spz;
        garaz.cisloGaraze = 1;
        garaz.misto += spz+", ";
        System.out.print(garaz.vypis(1));
        
        
        
        
}
}
