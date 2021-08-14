/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class BankovniUcet {
    final Klient klient;
    private int penize;
    final LocalDateTime datumVytvoreni;
    private LocalDateTime datumZmeny;
    
    public BankovniUcet(Klient klient){
        this.klient = klient;
        penize = 0;
        datumVytvoreni = LocalDateTime.now();
    }
    /**
     * Metoda pro zadávání PIN
     * @return Scanner
     */
    private int ctiPin(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();       
    }
    /**
     * Oveří PIN
     * @param pin
     * @return boolean
     */
    private boolean overPin(int pin){
        return (pin == 0);
    }
    /**
     * Metoda pro vklad hotovosti
     * @param kolik 
     */
    void vlozPenize(int kolik){
        datumZmeny = LocalDateTime.now();
        if(kolik > 0){
            penize += kolik;
            System.out.println(datumZmeny + "\nVloženo: " + kolik);
        }
        else{
            System.out.println(datumZmeny + "\nPodezřelý vklad: " + kolik);
        }
    }
    /**
     * Metoda pro výběr hotovosti
     * @param kolik
     * @return int
     */
    int vyberPenize(int kolik){
        datumZmeny = LocalDateTime.now();
        System.out.print("Zadej PIN: ");
        int pin = ctiPin();
        if(overPin(pin)){
            if(getPenize() >= kolik){
                penize -= kolik;
                System.out.println(datumZmeny + "\nVybráno: " + kolik);
                return kolik;
            }
            else{
                System.out.println("Nedostatek hotovosti!");
            }
        }
        else{
            System.out.println("PIN nesouhlasí!");
        }
        return 0;
    }
    
    /**
     * Výpis z účtu
     * @return String
     */
    public String vypisZUctu(){
        String s = "";
        s += "\nVýpis z účtu " + klient.getJmeno();
        s += "\nDatum založení: " + datumVytvoreni.getDayOfMonth()+ "." + datumVytvoreni.getMonth()+ "." + datumVytvoreni.getYear();
        s += "\nZůstatek hotovosti: " + getPenize();
        s += "\nDatum poslední změny: " + datumZmeny.getDayOfMonth()+ "." + datumZmeny.getMonth()+ "." + datumZmeny.getYear();
        return s;
    }

    /**
     * @return the penize
     */
    public int getPenize() {
        return penize;
    }
}
