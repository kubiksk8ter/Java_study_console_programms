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
public class Priklad36Autobazar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autobazar AAA = new Autobazar("Hulvátská 48");
        
        Auto skodofka = new Auto("Škoda 120","123ABC",10000);
        Auto fabka = new Auto("Škoda Fabia","456DEF",100000);
        Auto ferarko = new Auto("Ferrari FF","789GHI",3000000);
        Auto tatrovka = new NakladniAuto("Tatra811","534NGS",50000,20);
        Auto rencek = new NakladniAuto("Renault Midliner","489GSR",100000,30);
        
        AAA.odkup(skodofka);
        AAA.odkup(fabka);
        AAA.odkup(ferarko);
        AAA.odkup(tatrovka);
        AAA.odkup(rencek);
        
        System.out.print(AAA);
        System.out.print(AAA.cenaAut());
        
        AAA.prodej(ferarko);
        
        System.out.print(AAA);
        System.out.print(AAA.cenaAut());
    }
    
}
