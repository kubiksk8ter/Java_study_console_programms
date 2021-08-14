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
public class Priklad32Tvar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Obdelnik obdelnik = new Obdelnik("hnědá");
        Trojuhelnik trojuhelnik = new Trojuhelnik("zelená");
        
        double a = obdelnik.obsah(3, 26);
        double b = trojuhelnik.obsah(25, 15, 15);
        
        double c = 4*b + a;
    
        System.out.printf("Obsah stromu je %s cm^2",c);
    }
    
}
