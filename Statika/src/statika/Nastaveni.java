/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statika;

/**
 *
 * @author kuba
 */
class Nastaveni {
    private static String jazyk = "CZ";
    private static String barevneSchema = "cervene";
    private static boolean spustitPoStartu = true;
    
    private Nastaveni(){
        
    }
    
    public static String jazyk(){
        return jazyk;
    }
    
    public static String barevneSchema(){
        return barevneSchema;
    }
    
    public static boolean spustitPoStartu(){
        return spustitPoStartu;
    }

}
    
