/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozsahcelychcisel;

/**
 *
 * @author kuba
 */
public class RozsahCelychCisel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program vypíše rozsah celočíselných datových typů.");
        //Byte, Short, Integer, Long
        System.out.println("Byte: " + Byte.MIN_VALUE + " až " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " až " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MIN_VALUE + " až " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " až " + Long.MAX_VALUE);
    }
    
}
