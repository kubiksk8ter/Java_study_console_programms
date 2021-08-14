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
public class Trojuhelnik extends Tvar {
    private double a;
    private double b;
    private double c;
    
    public Trojuhelnik(String barva){
        super(barva);
    }
    
    public double obsah(double a,double b, double c){
        double s = (a+b+c)/2;
        double S = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        this.a = a;
        this.b = b;
        this.c = c;
        return S;
        
    }
}
