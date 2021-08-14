/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vlaknozapiscteni;

/**
 *
 * @author kuba
 */
public class VlaknoZapisCteni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VlaknoZapis VZ = new VlaknoZapis("e:\\Download\\test\\VlaknaTest.txt");
        VZ.start();
        VlaknoCteni VC = new VlaknoCteni("e:\\Download\\test\\VlaknaTest.txt");
        VC.start();
    }
    
}
