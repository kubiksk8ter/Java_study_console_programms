/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg24.nákladní.auto;

/**
 *
 * @author kuba
 */
public class NakladniAuto {
    //**Hmotnost nákladu*/
    public int a = 0;

    public int nalozeni (int naklad){
        a += naklad;        
        if(a>3000){
        a -= naklad;
        }
        return a;
    }
    public int vylozeni (int naklad){
        a -= naklad;
        if(a<0){        
        a += naklad;
        }
        return a;
    }
    public void VypisNakladu(){
        System.out.print("V nákladním autě je naloženo "+ a + " kg");
    }
    
}
