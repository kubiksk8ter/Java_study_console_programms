/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author kuba
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c;
        int i;
        
        c = 'a';
        i = (int)c;
        System.out.printf("Znak %c jsme převedli na ASCII hodnotu %d\n", c,i);
        
        i = 98;
        c = (char)i;
        System.out.printf("ASCII hodnotu %d jsme převedli na znak %c\n", i, c);    }
    
}
