/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad.pkg31.ptakmain;

/**
 *
 * @author kuba
 */
public class AngryPtak extends Ptak{
    private int vztek = 50;
    
    public void provokuj(int provokace){        
        if(hlad ==100){
            provokace *=2;
        }
        vztek += provokace;
    }
    @Override
    public String toString(){
        return String.format("Jsem angry-pták s váhou %s a hladem %s, míra mého vzteku je %s.\n", vaha,hlad,vztek);
    }
}
