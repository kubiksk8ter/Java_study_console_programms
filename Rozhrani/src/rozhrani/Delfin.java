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
public class Delfin extends Zvire {
    
    public Delfin(int vaha) {
        super(vaha);
    }
    
    public void vyskoc(){
        System.out.println("Vyskočil jsem...");
    }

    @Override
    public void presunSe() {
        System.out.println("Plavu...");
    }
    
}
