/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seradpole;

import java.util.Arrays;

/**
 *
 * @author kuba
 */
public class SeradPole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program seřadí čísla vzestupně.");
        int [] x = {5,3,6,9,8,11,21,5,86,49,2,3,77};
        int [] y = new int[x.length];
        for(int i = 0; i<x.length;i++){
            System.out.print(x[i] + ", ");
        }
        System.out.println("");
        serad(x,y);
    }
    static void serad(int[]x,int[]y){
        Arrays.sort(x);
        System.arraycopy(x, 0, y, 0, x.length);
        System.out.println("Seřazené pole:");
        for(int i = 0; i<x.length;i++){
            System.out.print(y[i] + ", ");
        }
    }
    @Override
    public String toString(){
        System.out.println("Program seřadí čísla vzestupně.");
        int [] x = {5,3,6,9,8,11,21,5,86,49,2,3,77};
        int [] y = new int[x.length];
        for(int i = 0; i<x.length;i++){
            System.out.print(x[i] + ", ");
        }
        System.out.println("");
        serad(x,y);
        String s = "";
        return s;
    }
    
}
