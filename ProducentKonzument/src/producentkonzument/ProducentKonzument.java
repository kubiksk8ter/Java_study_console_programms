/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producentkonzument;

/**
 *
 * @author kuba
 */
public class ProducentKonzument {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cteni ct1 = new Cteni("e:\\Download\\test\\POLE.txt");
        Producent vlPr1 = new Producent(ct1);
        Konzument vlKon1 = new Konzument(ct1);
        vlKon1.start();
        vlPr1.start();
    }
    
}
