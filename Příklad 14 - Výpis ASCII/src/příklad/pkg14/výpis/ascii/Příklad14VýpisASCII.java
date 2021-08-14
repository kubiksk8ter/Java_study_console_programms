/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg14.výpis.ascii;

/**
 *
 * @author kuba
 */
public class Příklad14VýpisASCII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("ASCII tabulka");
    System.out.println("=============");
    for(int i=33;i<256;i++){    
        char c = (char)i;
        System.out.println(i +"="+ c);
    }
    }
}
