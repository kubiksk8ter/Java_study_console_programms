/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoc4;

/**
 *
 * @author kuba
 */
public class AoC4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        int a0;
        int a1;
        int a2;
        int a3;
        int a4;
        int a5;
        
        int pocitadlo = 0;
        for(int a = 197487; a < 673251; a++) {
            s = String.valueOf(a);
            a0 = Integer.valueOf(s.charAt(0)-48);
            a1 = Integer.valueOf(s.charAt(1)-48);
            a2 = Integer.valueOf(s.charAt(2)-48);
            a3 = Integer.valueOf(s.charAt(3)-48);
            a4 = Integer.valueOf(s.charAt(4)-48);
            a5 = Integer.valueOf(s.charAt(5)-48);
            if(((a0==a1)||(a1==a2)||(a2==a3)||(a3==a4)||(a4==a5))&&
               ((a0<=a1)&&(a1<=a2)&&(a2<=a3)&&(a3<=a4)&&(a4<=a5))){
                    pocitadlo++;
                    System.out.println(a);
                    if((a0==a1)&&(a0==a2)&&(a3==a4)&&(a3==a5)){
                        pocitadlo--;
                        System.out.println("!" + a);
                    }
                    else if((a0==a1)&&(a0==a2)&&(a3==a4)&&(a3==a5)) {
                        pocitadlo--;
                        System.out.println("!" + a);
                    }
                    else if(((a1==a2)&&(a1==a3))&&(a4!=a5)){
                        pocitadlo--;
                        System.out.println("!" + a);
                    }
                    else if(((a4==a3)&&(a4==a2))&&(a0!=a1)) {
                        pocitadlo--;
                        System.out.println("!" + a);
                    }
                    else if(((a0==a1)&&(a0==a2)&&(a0==a3)&&(a0==a4))||
                            ((a1==a2)&&(a1==a3)&&(a1==a4)&&(a1==a5))){
                        pocitadlo--;
                        System.out.println("!" + a);
                    }
                    else if(((a0==a1)&&(a0==a2))&&((a3!=a4)&&(a4!=a5))){
                        pocitadlo--;
                        System.out.println("!" + a);
                    }
                    else if(((a3==a4)&&(a3==a5))&&((a0!=a1)&&(a1!=a2))){
                        pocitadlo--;
                        System.out.println("!" + a);
                    }
                }
            }
            System.out.println(pocitadlo);
        }        
}
