/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg28b.garáž.druhý.pokus;

/**
 *
 * @author kuba
 */
public class Garaz { 
    public Auto auto;
    private String spz = ""; 
    //**Sloučí automobil s garáží*/
    public void sluc(Auto auto){
        this.auto = auto;
        spz += this.auto.spz+" ";
    }
    //**Výpis garáže
    @Override    
    public String toString(){        
        return String.format("V garáži je auto: %s",spz);
    }    
    
}
