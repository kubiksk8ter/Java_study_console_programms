/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozhrani;

/**
 *
 * @author kuba
 */
public class Ptak extends Zvire implements PtakInterface {

    public Ptak(int vaha) {
        super(vaha);
    }
    
    @Override
    public void pipni(){
        System.out.println("♫ ♫ ♫");
    }    
    
    public void klovni(){
        System.out.println("Klov, klov!");
    }

    @Override
    public void presunSe() {
        System.out.println("Letím...");
    }
}
