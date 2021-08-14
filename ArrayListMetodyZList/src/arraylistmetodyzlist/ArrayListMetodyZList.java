/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistmetodyzlist;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class ArrayListMetodyZList {
    public static void tiskni(String jmeno, ArrayList<String> ar) {
        int vel = ar.size();
        System.out.print(jmeno + " (" + vel + ") : ");
        for(int i = 0; i < vel; i++) {
            System.out.print("[" + i + "]=" + ar.get(i) + ", ");
        } System.out.println(); }

    public static void main(String[] args) {
        System.out.println("\nVytvoření seznamu");
        ArrayList<String> ar = new ArrayList<>();
        ar.add("První");
        ar.add("Druhý");
        ar.add("První");
        tiskni("ar1", ar);
        
        System.out.println("\nPřidávání, změna a ubírání " + "prvku");
        ar.add(2, "Třetí");
        tiskni("ar", ar);
        ar.set(1, "DRUHÝ");
        tiskni("ar", ar);
        ar.remove(2);
        tiskni("ar", ar);
        
        System.out.println("\nHledání prvku");
        ar.add("Čtvrtý");
        tiskni("ar", ar);
        System.out.println("'Čtvrtý' má index: " + ar.indexOf("Čtvrtý"));
        System.out.println("Poslední 'První' má index: " + ar.lastIndexOf("První"));       
        }}

