/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datumacas2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


/**
 *
 * @author kuba
 */
public class DatumACas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=0;i<7;i++){
            LocalDate den = LocalDate.of(2016, 11, 27);
            den = den.plusDays(i);
            int rok = den.getYear();
            int dny = den.getDayOfMonth();
            int mesic = den.getMonthValue();
            System.out.println(den.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))+" - "+(rok+dny+mesic));
            
            
        }
        
    }
    
}
