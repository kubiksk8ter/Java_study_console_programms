/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg12;

/**
 *
 * @author kuba
 */
public class Příklad12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pole = new int[10];
        pole[0]=10;
        for(int i=0;i<10;i++){
            pole [i]=10-i;
        }
        for(int i: pole){
            System.out.println(i);
        }
    }
    
}
