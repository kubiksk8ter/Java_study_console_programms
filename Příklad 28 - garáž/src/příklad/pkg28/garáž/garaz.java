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
public class garaz {
    public int cisloGaraze;
    public String misto = "";
    
    public void parkuj(int cisloGaraze){
        this.cisloGaraze = cisloGaraze;
        misto += "";
        
    }    
    public String vypis(int cisloGaraze){
        this.cisloGaraze = cisloGaraze;
        return String.format("V garáži je auto: %s",misto);
    }
   
        
}
