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
public class Javista extends Clovek {
    private String IDE;
    
    public Javista(String jmeno, int vek,String IDE){
        super(jmeno,vek);
        this.IDE = IDE;
    }
    public void programuj(double pocetRadku){
        unava += pocetRadku/10;
        if(unava>20){
            unava = 20;
            System.out.println("Jsem příliš unavený, abych programoval");
        }
    }
}
