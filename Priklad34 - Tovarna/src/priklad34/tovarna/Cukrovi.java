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
public class Cukrovi {
    static String barva;
    static String tvar;
    static int vaha;
    
    public Cukrovi(String barva, String tvar, int vaha){
        this.barva = barva;
        this.tvar = tvar;
        this.vaha = vaha;
    }
    
    @Override
    public String toString(){
        return String.format("Cukroví barvy %s, tvaru %s a váhy %sg\n", Cukrovi.barva,Cukrovi.tvar, Cukrovi.vaha);
    }
}
