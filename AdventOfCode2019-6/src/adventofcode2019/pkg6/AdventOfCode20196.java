/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2019.pkg6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author kuba
 */
public class AdventOfCode20196 {
    public static ArrayList<String> najdiCestuAUloz (ArrayList<String> mapa, String objekt) {
        ArrayList<String> cesta = new ArrayList<>();
        while(!objekt.equals("COM")){
            for(String s : mapa) {
                String[]a = s.split("\\)");
                if(a[1].equals(objekt)) {
                    cesta.add(a[0]);
                    objekt = a[0];                      
                }
            }           
        }
        return cesta;
    }

    public static int najdiCestu (ArrayList<String> mapa, String objekt, String cil) {
        int pocet = 0;        
        while(!objekt.equals(cil)){
            for(String s : mapa) {
                String[]a = s.split("\\)");
                if(a[1].equals(objekt)) {
                    objekt = a[0]; 
                    System.out.println(objekt);
                    pocet++;                    
                }
            }
        }
        return pocet;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //pole pro mapu
        ArrayList<String> mapa = new ArrayList<>();
        //čtení ze souboru a uložení do mapy
        try (BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")))) {
            String line = br.readLine();
            while(line != null) {
                mapa.add(line);
                line = br.readLine();
            }
        }
        //načtení a uložení jednotlivých objektů
        HashSet<String> objekty = new HashSet<>();
        for(String s : mapa) {
            String[] a = s.split("\\)");
            objekty.add(a[0]);
            objekty.add(a[1]);
        }
        //Výpis společných prvků
        ArrayList<String> spolecne = new ArrayList<>();
        for(String s : najdiCestuAUloz(mapa, "YOU")) {
            for(String s1 : najdiCestuAUloz(mapa, "SAN")) {
                if(s.equals(s1)) {
                    spolecne.add(s);
                }
            }
        }
        int i = najdiCestuAUloz(mapa, "YOU").indexOf("59F");
        int y = najdiCestuAUloz(mapa, "SAN").indexOf("59F");
        System.out.println(i + ", " + y);
        //String spolecnyObjekt = spolecne.get(0);
        //System.out.println(spolecnyObjekt);
        //System.out.println(najdiCestu(mapa, "YOU", "59F"));
        //System.out.println(najdiCestu(mapa, "SAN", "COM"));
    }    
}
