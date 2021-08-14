/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlschema;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class ZpracovaniDatVPameti {
    public static void tiskniVse(ArrayList<Ovoce> ar) {
        for(Ovoce o: ar) {
            System.out.println(o);
        }
    }
    
    public static double celkovaVaha(ArrayList<Ovoce> ar) {
        double celkovaVaha = 0;
        for(Ovoce o: ar) {
            celkovaVaha += o.vaha;
        }
        return celkovaVaha;
    }
    
    public static double celkovaCena(ArrayList<Ovoce> ar) {
        double celkovaCena = 0;
        for(Ovoce o: ar) {
            celkovaCena += o.vaha * o.jednotkovaCena;
        }
        return celkovaCena;
    } 
}
