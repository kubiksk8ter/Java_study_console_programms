/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datum.a.čas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author kuba
 */
public class DatumACas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime datumCas = LocalDateTime.of(2019, Month.MARCH, 13, 23, 12, 6);
        System.out.println(datumCas);
        LocalDate datum = LocalDate.of(2019, Month.MARCH, 17);
        System.out.println(datum);
        LocalTime cas = LocalTime.of(12,34,5);
        System.out.println(cas);
        
        LocalDateTime datumCas2 = LocalDateTime.now();
        
        System.out.println(datumCas2.format(DateTimeFormatter.ofPattern("d.M.y\nH:m:ss")));
        
    }
    
}
