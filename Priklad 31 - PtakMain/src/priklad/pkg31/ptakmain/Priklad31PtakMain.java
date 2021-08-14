/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad.pkg31.ptakmain;

/**
 *
 * @author kuba
 */
public class Priklad31PtakMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ptak ptak = new Ptak();
        System.out.print(ptak);
        ptak.snez(20);
        System.out.print(ptak);
        
        AngryPtak angryptak = new AngryPtak();
        System.out.print(angryptak);
        angryptak.provokuj(5);
        System.out.print(angryptak);
        angryptak.snez(100);
        angryptak.provokuj(5);
        System.out.print(angryptak);
    }
    
}
