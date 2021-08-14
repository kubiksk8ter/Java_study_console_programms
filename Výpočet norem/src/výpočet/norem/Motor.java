/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package výpočet.norem;

/**
 *
 * @author kuba
 */
public class Motor {
    //**Číslo motoru*/
    private String cisloM;
    //**Cas na vyrobení v min.*/
    double cas;
    
    public Motor(String cisloM, double cas){
        this.cisloM = cisloM;
        this.cas = cas;

    }    
}
