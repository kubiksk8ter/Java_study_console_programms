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
public class PtakoJester extends Zvire implements JesterInterface, PtakInterface {

    public PtakoJester(int vaha) {
        super(vaha);
    }

    @Override
    public void plazSe() {
        System.out.println("Plazím se...");
    }
    
    @Override
    public void pipni() {
        System.out.println("♫ ♫♫ ♫ ♫ ♫♫");
    }

    @Override
    public void presunSe() {
        System.out.println("Plazoletím...");
    }


    
}
