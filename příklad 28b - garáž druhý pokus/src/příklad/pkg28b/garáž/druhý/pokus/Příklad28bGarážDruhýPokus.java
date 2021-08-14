/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg28b.garáž.druhý.pokus;

/**
 *
 * @author kuba
 */
public class Příklad28bGarážDruhýPokus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto = new Auto("123ABC", "modrá");
        
        Garaz garaz = new Garaz();
                
        auto.zaparkuj(garaz);

        System.out.print(garaz);
    }
    
}
