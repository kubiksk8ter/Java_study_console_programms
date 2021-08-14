/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad32.tvar;

/**
 *
 * @author kuba
 */
public class Obdelnik extends Tvar {
    private double sirka;
    private double vyska;
    private double s;
    
    public Obdelnik(String barva){
        super(barva);        
    }
    
    public double obsah(double sirka, double vyska){        
        this.sirka = sirka;
        this.vyska = vyska;
        s += sirka * vyska;
        return s;
    }           
}
