/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verzeprekladace;

/**
 *
 * @author kuba
 */
public class VerzePrekladace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String key = "java.version";        
        System.out.println(System.getProperties().getProperty(key));;
    }
    
}
