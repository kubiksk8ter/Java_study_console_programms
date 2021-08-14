/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad34.tovarna;

/**
 *
 * @author kuba
 */
public class TovarnaNaCukrovi {
    
    static Cukrovi bananove(){
        return new Cukrovi("žlutá","kulatý",20); 
    }
    
    static Cukrovi jahodove(){
        return new Cukrovi("červená", "kulatý" , 15);
        
    }
    
    static Cukrovi coko(){
        return new Cukrovi("hnědá", "hranatý", 25);        
    }
}
