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
public class Auto {
    //** SPZ automobilu*/
    public String spz;
    //** Barva automobilu*/
    public String barva;
        
    public Auto (String spz, String barva){
        this.spz = spz;
        this.barva = barva;
    }
    //**Zaparkuje automobil*/
    public void zaparkuj(Garaz garaz){         
        garaz.sluc(this);
    }    
}
