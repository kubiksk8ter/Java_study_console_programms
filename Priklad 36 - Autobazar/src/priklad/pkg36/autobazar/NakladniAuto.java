/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad.pkg36.autobazar;

/**
 *
 * @author kuba
 */
public class NakladniAuto extends Auto{
    private int nosnost;
    
    public NakladniAuto(String znacka, String SPZ, int cena, int nosnost){
        super(znacka, SPZ, cena);
        this.nosnost = nosnost;
    }
}
