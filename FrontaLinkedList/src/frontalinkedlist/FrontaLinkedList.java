/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontalinkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author kuba
 */
public class FrontaLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> fifoFronta = new LinkedList<>();
        fifoFronta.add("5");
        fifoFronta.add("1");
        fifoFronta.add("3");
        System.out.println(fifoFronta);
        
        fifoFronta.add("2");
        fifoFronta.add("4");
        System.out.println(fifoFronta);
        
        System.out.println("Na cele je: " + fifoFronta.element());
        
        while (!fifoFronta.isEmpty()) {
            System.out.print(fifoFronta.remove() + ", ");
        }        
    }    
}
