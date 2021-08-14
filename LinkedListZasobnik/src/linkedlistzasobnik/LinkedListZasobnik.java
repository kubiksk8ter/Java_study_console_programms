/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistzasobnik;

import java.util.LinkedList;

class Zasobnik<E> {
        private LinkedList<E> zasob = new LinkedList<>();        
        public void add(E elem) {
            zasob.addFirst(elem);}        
        public E remove() {
            return zasob.removeLast();}        
        public E get() {
            return zasob.getFirst();}        
        public boolean isEmpty() {
            return zasob.isEmpty();}
    }
public class LinkedListZasobnik {   
    public static void main(String[] args) {
        Zasobnik <String> z = new Zasobnik<>();
        z.add("První");
        z.add("Druhý");
        z.add("Třetí");
        System.out.println(z.get());
        while(z.isEmpty() == false) {
            System.out.print(z.remove() + ", ");
        }
        System.out.println();
        
        Zasobnik <Integer> z2 = new Zasobnik<>();
        z2.add(8);
        z2.add(9);
        while(z2.isEmpty() == false) {
            System.out.print(z2.remove() + ", ");
        }    }    }
