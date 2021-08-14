/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg20.sinusovka;

/**
 *
 * @author kuba
 */
public class Příklad20Sinusovka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [][] sinusoida = new char [80][25];
        for(int i=0;i<sinusoida[0].length;i++){
            for(int j=0;j<sinusoida.length;j++){
                sinusoida[j][i] = ' ';
            }
        }
        
        //souřadnice sinusovky
        for(int x = 0; x<=360; x++){
            double y = ((Math.sin(x*(Math.PI/180)))*10);
            y = Math.round(y);
            int y2 = (int)y;
            double x2 = (x/4.6);
            x2 = Math.round(x2);
            int x3 = (int)x2;
            sinusoida[x3][y2+10] = '█';            
        }
        //výpis pole
        for(int i=0;i<sinusoida[0].length;i++){
            for(int j=0;j<sinusoida.length;j++){
                System.out.print(sinusoida[j][i]);
            }
            System.out.println();
        }
    }
    
}
