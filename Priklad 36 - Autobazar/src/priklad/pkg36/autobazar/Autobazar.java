/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad.pkg36.autobazar;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class Autobazar {
    ArrayList<Auto> auta;
    private String adresa;
    private int penizePokladna = 5000000;
    private int cenaAut = 0;
    
    public Autobazar(String adresa){
        auta = new ArrayList();
        this.adresa = adresa;
    }
    
    public void odkup(Auto auto){
        auta.add(auto);
        penizePokladna -= auto.cena;
        cenaAut += auto.cena;
    }
    
    public void prodej(Auto auto){
        auta.remove(auto);
        penizePokladna += auto.cena;
        cenaAut -= auto.cena;
    }
    
    public String cenaAut(){
        return String.format("Celková cena automobilů je %s Kč\n", cenaAut);
    }
    
    
    @Override
    public String toString(){
        return String.format("V bazaru je %s automobilů\nNa pokladně je %s Kč\n", auta.size(),penizePokladna);
    }
}
