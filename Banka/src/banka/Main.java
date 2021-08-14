/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author kuba
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banka banka = new Banka();
        Klient kuba = new Klient("Jakub H.", LocalDate.parse("11.12.1986", DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        Klient jakub = new Klient("Kuba H.", LocalDate.parse("27.07.1987", DateTimeFormatter.ofPattern("dd.MM.yyyy")));
                
        BankovniUcet ucetkuba = new BankovniUcet(kuba);
        BankovniUcet ucetjakub = new BankovniUcet(jakub);
        
        banka.vlozUcet(ucetkuba);
        banka.vlozUcet(ucetjakub);
        
        ucetkuba.vlozPenize(1000);
        ucetjakub.vlozPenize(5080);
        ucetkuba.vyberPenize(580);
        
        System.out.println(ucetkuba.vypisZUctu());
        System.out.println(banka.vypisPenizeVBance());
    }
    
}
