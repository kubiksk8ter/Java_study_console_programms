/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vypispatek13;

import java.text.ParseException;
import java.util.Scanner;
import static java.time.DayOfWeek.FRIDAY;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 *
 * @author kuba
 */
public class VypisPatek13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        
        System.out.println("Pro zadaný interval datumů vypíše všechny pátky 13.:");
        //první interval
        System.out.println("Zadej 1. datum:"); 
        LocalDate prvni = LocalDate.parse((sc.nextLine()),DateTimeFormatter.ofPattern("d.M.y"));
        
        //druhý interval        
        System.out.println("Zadej 2. datum:"); 
        
        LocalDate druhy = LocalDate.parse((sc.nextLine()),DateTimeFormatter.ofPattern("d.M.y"));        
        //Doba mezi prvním a druhým intervalem
        Period doba = Period.between(prvni, druhy);       
        //List pro uložení patků 13.
        ArrayList<LocalDate> patky13 = new ArrayList<>();
        //Cyklus pro zjištění pátků 13.
        for(int i = 0; i < (doba.toTotalMonths())*31;i++){
            LocalDate x = prvni.plusDays(i);            
            if(x.getDayOfWeek().equals(FRIDAY)&&(x.getDayOfMonth()==13)){
                patky13.add(x);                
            }             
        }
        System.out.println("Pátky 13.:");
        //cyklus pro výpis listu
        for(int i = 0; i<patky13.size();i++){
        System.out.print(patky13.get(i).format(DateTimeFormatter.ofPattern("d.M.y, ")));    
        }
        
    }
    
}
