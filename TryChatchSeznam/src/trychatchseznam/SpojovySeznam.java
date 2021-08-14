/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trychatchseznam;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class SpojovySeznam {
    private final ArrayList<Object> seznam = new ArrayList<>();
    
    public void vloz(Object o){
        seznam.add(o);
    }
    
    public void vyjmiPrvniho() throws SeznamException{
        try{
            seznam.remove(0);
        }
        catch(Exception e){
            System.out.println("Seznam je prázdný!");
        }
    }
    
    public void vypisSeznam(){
        System.out.println(seznam.toString());
    }
}
