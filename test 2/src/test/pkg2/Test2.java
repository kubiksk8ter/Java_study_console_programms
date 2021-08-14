/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkg2;

import java.util.Arrays;
import static java.util.Arrays.deepToString;

/**
 *
 * @author kuba
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] S = {"O","O","O"};
        String S1 = deepToString(S);
        System.out.print(S1);
        String P = "[O, O, O]";
        if(P.contains(S1)){
            System.out.print("vyhra");
        }
    }
    
}
for(int j=0;j<pole.length;j++){
                for(int i=0;i<pole[0].length;i++){
                  poleD += pole[i][j];