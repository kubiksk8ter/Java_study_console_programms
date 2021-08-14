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
public class clovek {
    String jmeno = "";
    int vek = 0;
    
    public void clovek(){      
    }
    public String pozdrav(clovek jmeno0){
        return String.format("Ahoj, já jsem "+jmeno+", je mi "+vek+" let a můj kamarád je "+jmeno0.jmeno+" a je mu "+jmeno0.vek+" let.");
    }
                   
}
