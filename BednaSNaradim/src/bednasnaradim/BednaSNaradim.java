/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bednasnaradim;

/**
 *
 * @author kuba
 */
public class BednaSNaradim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instance bedny na nářadí
        Bedna bedna = new Bedna(10000);
        //instance nástrojů
        Kladivo kladivko = new Kladivo("Kladívko", 1200, false);
        Kladivo kladivo = new Kladivo("Velké kladivo", 3000, true);
        Kladivo obourucniKladivo = new Kladivo("Bourací kladivo", 4000, true);
        Nastroj sroubovak = new Sroubovak("Šroubovák Philips", 800);
        Nastroj pila = new Pila("Zrezivělá pila", 2500);
        Nastroj elSroubovak = new ElektrickySroubovak("Elektrický šroubovák Bosh", 1800, 100);
        
        System.out.println(bedna);
       
        bedna.Vloz(kladivko);
        bedna.Vloz(kladivo);
        bedna.Vloz(obourucniKladivo);
        bedna.Vloz(sroubovak);
        bedna.Vloz(pila);
        bedna.Vloz(elSroubovak);
        
        System.out.println(bedna);
        bedna.PracujVse();
        System.out.println(bedna.getVahaKladiv());
        
        
        
        
    }
    
}
