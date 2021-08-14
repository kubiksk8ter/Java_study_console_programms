/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad34.singleton;

/**
 *
 * @author kuba
 */
public class Priklad34Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Databaze databaze = Databaze.getInstance(); 
        Databaze databaze2 = Databaze.getInstance();
        
        databaze.setJmeno("hok");

        System.out.println(databaze.getJmeno()); 
        System.out.println(databaze2.getJmeno());
    }
    
}
