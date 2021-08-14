/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg18.šachovnice;

/**
 *
 * @author kuba
 */
public class Příklad18Šachovnice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] s = new String [8][8];
        
        for(int i = 0;i<8;i++){
            for(int y =0;y<8;y++)
                s[i][y]="█";                
            }
        for(int i = 1;i<8;i+=2){
            for(int y =0;y<8;y++)
                s[i][y++]="  ";
            }
        for(int i = 0;i<8;i+=2){
            for(int y =1;y<8;y++)
                s[i][y++]="  ";
            }
        for(int j=0;j<s[0].length;j++){
            for(int i=0;i<s.length;i++){
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    
    }
}
