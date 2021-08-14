/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad.pkg26.unava;

/**
 *
 * @author kuba
 */
public class Priklad26Unava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Javista karlos = new Javista("Karel Nový", 25 , "JAVA");
        System.out.print(karlos);
        
        karlos.behej(10);
        karlos.behej(10);
        
        karlos.programuj(5);        
        karlos.behej(10);
        
        karlos.spi(8);
        System.out.println(karlos.unava);
        karlos.programuj(100);
        System.out.println(karlos.unava);
        
        
    }
    
}
