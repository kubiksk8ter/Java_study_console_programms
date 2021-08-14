/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad34.tovarna;

/**
 *
 * @author kuba
 */
public class Priklad34Tovarna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TovarnaNaCukrovi tovarna = new TovarnaNaCukrovi();

        for(int i=0;i<5;i++){
            System.out.print(tovarna.bananove());
        }
        for(int i=0;i<8;i++){
            System.out.print(tovarna.jahodove());
        }
        for(int i=0;i<12;i++){
            System.out.print(tovarna.coko());
        }
    }
    
}
