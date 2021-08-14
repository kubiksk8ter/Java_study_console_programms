/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg25.kamaradi;

/**
 *
 * @author kuba
 */
public class Příklad25Kamaradi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clovek karlos = new clovek();
        karlos.jmeno = "Karel Novák";
        karlos.vek = 33;
        clovek pepan = new clovek();
        pepan.jmeno = "Josef nový";
        pepan.vek = 27;
        System.out.println(karlos.pozdrav(pepan));
        System.out.println(pepan.pozdrav(karlos));
    }
    
}
