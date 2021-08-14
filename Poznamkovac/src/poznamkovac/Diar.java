/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poznamkovac;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class Diar {
    private Databaze databaze;
    private Scanner sc = new Scanner(System.in, "Windows-1250");
    public static DateFormat formatData = new SimpleDateFormat("d.MM.yyyy H:mm");
    public static DateFormat formatDataBezCasu = new SimpleDateFormat("d.MM.yyyy");
    
    public Diar(){
        databaze = new Databaze();
    }
    
    private Calendar zjistiCalendar(DateFormat formatData){
        Calendar datumCas = Calendar.getInstance();
        try{
            datumCas.setTime(formatData.parse(sc.nextLine()));
            datumCas.setLenient(false);
            datumCas.getTime();
        }catch(Exception e){
            System.out.println("Nesprávně zadáno, zadejte prosím znovu"); 
            return zjistiCalendar(formatData);
        }
        return datumCas;
    }
    private Calendar zjistiDatumCas(){
        System.out.println("Zadejte datum a čas ve tvaru [1.1.2013 14:00]:");
        return zjistiCalendar(formatData);
    }
    private Calendar zjistiDatum(){
        System.out.println("Zadejte datum ve tvaru [1.1.2013]:");
        return zjistiCalendar(formatDataBezCasu);
    }
    public void vypisZaznamy(Calendar den){
        ArrayList<Zaznam> zaznamy = databaze.najdiZaznamy(den, false);
        for(Zaznam z:zaznamy){
            System.out.println(z);
        }
    }
    public void pridejZaznam(){
        Calendar datumCas = zjistiDatumCas();
        System.out.println("Zadejte text záznamu: ");
        String text = sc.nextLine();
        databaze.pridejZaznam(datumCas, text);
    }
    public void vyhledejZaznam(){
        Calendar datumCas = zjistiDatum();
        ArrayList<Zaznam> zaznamy = databaze.najdiZaznamy(datumCas, false);
        if(zaznamy.size()>0){
            System.out.println("Nalezeny tyto záznamy: ");
            for(Zaznam z : zaznamy){
                System.out.println(z);
            }
        }else{
            System.out.println("Nebyli nalezeny žádné záznamy.");
        }
    }
    public void vymazZaznamy(){
        System.out.println("Budou vymazány záznamy v daný den a hodinu");
        Calendar datumCas = zjistiDatumCas();
        databaze.vymazZaznam(datumCas);
    }
    public void vypisUvodniObrazovku(){
        System.out.println();
        System.out.println();
        System.out.println("Výtej v diáři!");
        Calendar dnes = Calendar.getInstance();
        System.out.printf("Dnes je: %s\n", formatData.format(dnes.getTime()));
        System.out.println();
        System.out.println("Dnes:\n-----");
        vypisZaznamy(dnes);
        System.out.println();
        System.out.println("Zítra:\n-----");
        Calendar zitra = Calendar.getInstance();
        zitra.add(Calendar.DAY_OF_MONTH, 1);
        vypisZaznamy(zitra);
        System.out.println();       
    }
}
