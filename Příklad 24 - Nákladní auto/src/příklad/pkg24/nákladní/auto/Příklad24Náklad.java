/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg24.nákladní.auto;

/**
 *
 * @author kuba
 */
public class Příklad24Náklad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NakladniAuto auto = new NakladniAuto();
        auto.nalozeni(10000);
        auto.nalozeni(500);
        auto.vylozeni(300);
        auto.vylozeni(1000);
        auto.VypisNakladu();
    }
    
}
