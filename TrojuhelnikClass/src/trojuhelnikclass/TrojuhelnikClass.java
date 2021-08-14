/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trojuhelnikclass;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class TrojuhelnikClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Třída vypočítá obsah rovnoramenného trojuhelníku s delkou odvesen 1.");
        PravouhlyTrojuhelnik rptrj = new PravouhlyTrojuhelnik();
        System.out.println("Obsah je: " + rptrj.obsah());
        System.out.println("\nTřída vypočítá délku přepony.");
        System.out.print("Zadej délku první odvěsny: ");
        int o1 = sc.nextInt();
        System.out.print("Zadej délku druhé odvěsny: ");
        int o2 = sc.nextInt();
        PravouhlyTrojuhelnik ptrj = new PravouhlyTrojuhelnik(o1,o2);
        System.out.println("Délka přepony je: " + ptrj.delkaPrepony());
        System.out.println("\nTřída uživateli poskytuje metody odvod() a jePravouhly().");
        System.out.print("Zadej stranu A: ");
        int a = sc.nextInt();
        System.out.print("Zadej stranu B: ");
        int b = sc.nextInt();
        System.out.print("Zadej stranu C: ");
        int c = sc.nextInt();
        
        Trojuhelnik trj = new Trojuhelnik(a,b,c);
        
        System.out.println("Obvod trojúhelniku je: " + trj.obvod());
        if(trj.jePravouhly()){
            System.out.println("Trojúhelník je pravoúhlý");            
        }
        else{
            System.out.println("Trojúhelník není pravoúhlý");
        }
        
        System.out.println("Vytvoření rovnostranného trojúhelníku: ");
        Trojuhelnik trj2 = new Trojuhelnik(a);
        System.out.println("Obvod rovnostranného trojúhelníku je: " + trj2.obvod());
        
        System.out.println("Vytvoření rovnoramenného trojúhelníku: ");
        Trojuhelnik trj3 = new Trojuhelnik(a,b);
        System.out.println("Obvod rovnoramenného trojúhelníku je: " + trj3.obvod());
    }
    
}
