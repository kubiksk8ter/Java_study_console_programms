/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad.pkg36.autobazar;

/**
 *
 * @author kuba
 */
public class Auto {
    protected String znacka;
    protected String SPZ;
    protected int cena;
    
    public Auto(String znacka, String SPZ, int cena){
        this.SPZ = SPZ;
        this.cena = cena;
        this.znacka = znacka;
    }
}
