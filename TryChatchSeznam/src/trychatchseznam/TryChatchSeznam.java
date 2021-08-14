/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trychatchseznam;

/**
 *
 * @author kuba
 */
public class TryChatchSeznam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SeznamException{
        SpojovySeznam s = new SpojovySeznam();
        Integer a = 1;
        String b = "Ahoj";
        Float c = 3.14F;
        
        try{
        s.vyjmiPrvniho();
        s.vloz(a);
        s.vloz(b);
        s.vloz(c);
        s.vypisSeznam();
        s.vyjmiPrvniho();
        s.vypisSeznam();
        }
        catch(SeznamException e){
            e.printStackTrace();
        }
    }
    
}
