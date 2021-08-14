/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistmetodyzcollection;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class ArrayListMetodyZCollection {
    public static void tiskni(String jmeno, ArrayList<String> ar) {
        int vel = ar.size();
        System.out.print(jmeno + " (" + vel + ") : ");
        for(int i = 0; i < vel; i++) {
            System.out.print("[" + i + "]=" + ar.get(i) + ", ");
        } System.out.println(); }

    public static void main(String[] args) {
        System.out.println("\nVytvoření seznamu");
        ArrayList<String> ar1 = new ArrayList<>();
        System.out.println("ar1 je prázdný: " + ar1.isEmpty());
        ar1.add("První");
        ar1.add("Druhý");
        ar1.add("První");
        System.out.println("ar1 je prázdný: " + ar1.isEmpty());
        tiskni("ar1", ar1);
        
        System.out.println("\nPřidávání a ubírání prvků");
        ArrayList<String> ar2 = new ArrayList<>(ar1);
        ar2.add("Třetí");
        tiskni("ar2", ar2);
        ar2.remove("První");
        tiskni("ar2", ar2);
        ar2.removeAll(ar1);
        tiskni("ar2", ar2);
        ar2.addAll(ar1);
        tiskni("ar2", ar2);
        ar2.retainAll(ar1);
        tiskni("ar2", ar2);
        
        System.out.println("\nHledání prvku");
        ArrayList<String> ar3 = new ArrayList<>(ar1);
        ar3.add("Čtvrtý");
        System.out.println("ar3 obsahuje Pátý: " + ar3.contains("Pátý"));
        System.out.println("ar3 obsahuje ar1: " + ar3.containsAll(ar1));
        
        System.out.println("\nPřevod na pole");
        Object[] pole = ar1.toArray();
        int i = 0;
        for(Object s : pole) {
            System.out.print("[" + i + "]=" + (String) s + ", ");
            i++;
        }}}
