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
public class Ptak {
    protected int hlad = 100;
    protected int vaha = 50;
    
    protected void snez(int potrava){
        hlad -= potrava;
        vaha += potrava;         
    }
    
    @Override
    public String toString(){
        return String.format("Jsem pták s váhou "+vaha+" a hladem "+hlad+".\n");
    }
}
