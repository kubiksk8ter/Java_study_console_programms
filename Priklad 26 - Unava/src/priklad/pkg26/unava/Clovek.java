/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad.pkg26.unava;

/**
 *
 * @author kuba
 */
public class Clovek {
    protected String jmeno;
    protected int vek;
    protected double unava;
    
    //**Konstruktor*/
    public Clovek(String jmeno, int vek){
        this.jmeno = jmeno;
        this.vek = vek;
    }
    @Override
    public String toString(){
        return String.format("%s (%s)\n",jmeno,vek);
    }

     //**Metoda vyvolávající běh*/
    public double behej (double pocetKm){
        unava += pocetKm;
        if(unava>20){            
            System.out.println("Jsem příliš unavený");
            unava -= pocetKm;
        }
        return unava;
    }
    //**Metoda vyvolávající spánek*/
    public double spi (int pocetH){
        unava -= pocetH*10;
        if(unava<0){
            unava = 0;
        }
        return unava;
    }
}
