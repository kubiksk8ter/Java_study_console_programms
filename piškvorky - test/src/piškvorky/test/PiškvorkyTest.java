/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piškvorky.test;

import java.util.Arrays;
import static java.util.Arrays.deepToString;
import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class PiškvorkyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        String [][] pole = new String [10][10];
        
        //vyčištění pole
        for(int i=0;i<10;i++){
            for(int y=0;y<10;y++){
                pole[i][y]=" ";
            }
        }

        String[]s={" ","1","2","3","4","5","6","7","8","9"};
        //souřadnice x
        for(int i=0;i<10;i++){
            pole[i][0]=s[i];
        }
        //souřadnice y
        System.arraycopy(s, 1, pole[0], 1, 9);
        
        //Hlavní hrací cyklus
        int cyklus = 0;       
        while(cyklus<=0){
                
        //vyhodnocení výhry (vodorovně)
        String poleV = "";
        for(int j=1;j<pole.length;j++){
                for(int i=0;i<pole[0].length;i++){
                  poleV += pole[i][j];                  
            }
        }
        if(poleV.contains("OOOOO")){
                    System.out.print("vyhraV");
                    System.exit(cyklus);
        }
        //vyhodnocení výhry (svisle)
        String poleS = "";
        for(int j=1;j<pole.length;j++){
                for(int i=0;i<pole[0].length;i++){
                  poleS += pole[j][i];                  
            }
        }
        if(poleS.contains("OOOOO")){
                    System.out.print("vyhraS");
                    System.exit(cyklus);
        }
        //vyhodnocení výhry (diagonálně)
        String poleD = "";
        for(int j=0;j<pole.length;j++){
            poleD += pole[j][j];
        }
        for(int j=0;j<5;j++){
                for(int i=0;i<6;i++){
                  poleD += pole[j+i][i];                  
        }
        }
        for(int j=0;j<5;j++){
                for(int i=0;i<6;i++){
                  poleD += pole[i][j+i];                  
        }
        }
        System.out.print(poleD);
        if(poleD.contains("OOOOO")){
                    System.out.print("vyhraD");
                    System.exit(cyklus);
        }
        //vyhodnocení výhry (diagonálně druhá strana)
        String poleD2 = "";
        int z = 1;
        for(int i=9;i>0;i--){
                  poleD2 += pole[i][z];
        z++;                  
        }
        for(int j=9;j>5;j--){
                for(int i=0;i<6;i++){
                  poleD2 += pole[j-i][i];                  
        }
        }
        int p = 0;
        for(int j=5;j<10;j++){
                poleD2 += pole[9-p][j];
                p++;
        }
        int q = 0;
        for(int j=5;j<10;j++){
                poleD2 += pole[8-q][j];
                q++;
        }
        int a = 0;
        for(int j=5;j<10;j++){
                poleD2 += pole[7-a][j];
                a++;
        }
        int v = 0;
        for(int j=5;j<10;j++){
                poleD2 += pole[6-v][j];
                v++;
        }
        int c = 0;
        for(int j=5;j<10;j++){
                poleD2 += pole[7-c][j];
                c++;
        }
        System.out.print(poleD2);
        if(poleD2.contains("OOOOO")){
                    System.out.print("vyhraD2");
                    System.exit(cyklus);
        }
        //Hráč s kolečky
        System.out.println("Na řadě je hráč s kolečky");
        int podminka = 0;
        while(podminka<=0){
           System.out.println("Zadej pozici X kam chceš táhnout:");
           int xO = Integer.parseInt(sc.nextLine());
           System.out.println("Zadej pozici Y kam chceš táhnout:");
           int yO = Integer.parseInt(sc.nextLine());
           if(pole[xO][yO].contains(" ")){
              pole[xO][yO]=pole[xO][yO].replace(" ", "O");
              podminka += 1;              
              //výpis pole
              for(int j=0;j<pole.length;j++){
                for(int i=0;i<pole[0].length;i++){
                  System.out.print(pole[i][j]);
              }  
              System.out.println();
        }
        }
           //neplatná pozice
           else{
              System.out.println("Neplatná pozice, zadej jí prosím znovu.");
        }
           //ukončení programu
           if(pole[0][0].contains("O")){
               System.exit(yO);
           }
        }
        }
    }
    
}
