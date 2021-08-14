/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkanoyd;

/**
 *
 * @author kuba
 */
public class Arkanoyd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        HerniPlocha plocha = new HerniPlocha();
        
        plocha.vytvorPlochu();
        plocha.vlozCihlicku(4, 3);
        plocha.vlozCihlicku(5, 3);
        plocha.vlozCihlicku(6, 3);
        plocha.vlozCihlicku(7, 3);
        plocha.vlozCihlicku(8, 3);
        plocha.vlozCihlicku(9, 3);
        plocha.vlozCihlicku(10, 3);
        plocha.vlozCihlicku(11, 3);
        plocha.vlozCihlicku(12, 3);
        plocha.Hraj();
        
        System.out.print(plocha.VypisPoleSCihlickami());
    }
    
}
