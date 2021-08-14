/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocetsudychcislic;

/**
 *
 * @author kuba
 */
public class PocetSudychCislic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program vrátí počet sudých prvků v poli.");
        int[]x = {1,2,3,4,5,6,7,8,9};
        int[]y = new int [x.length];
        System.out.println("Počet sudých číslic v poli je " + sude(x,y));  
    }
    static int sude(int[]x,int[]y){
        for(int i = 0; i<x.length;i++ ){
            if((x[i]%2)==0){
                y[i]=x[i];
            }
        }
        int pocet = 0;
        for(int i = 0;i<y.length;i++){
            if(y[i]>0){
                pocet++;
            }
        }
        return pocet;
    }
}
