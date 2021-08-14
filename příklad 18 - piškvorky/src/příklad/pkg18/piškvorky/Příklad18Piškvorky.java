/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg18.piškvorky;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad18Piškvorky {

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
        for(int i=0;i<10;i++){
            pole[0][i]=s[i]+" ";
        }
        //výpis pole
              for(int j=0;j<pole[0].length;j++){
                for(int i=0;i<pole.length;i++){
                  System.out.print(pole[i][j]);
              }  
              System.out.println();             
        }
        
        //remíza
        int k = 0;      
        //Hlavní hrací cyklus                
        int cyklus = 0;       
        while(cyklus<=0){                  
            
        //Hráč s kolečky
        System.out.println("");
        System.out.println("Na řadě je hráč s kolečky");
        int podminka = 0;
        while(podminka<=0){
           System.out.println("Zadej pozici X kam chceš tahnout:");
           int xO = Integer.parseInt(sc.nextLine());
           System.out.println("Zadej pozici Y kam chceš tahnout:");
           int yO = Integer.parseInt(sc.nextLine());
                      
           if((xO>9||yO>9)||(xO<1||yO<1)){
               System.out.println("Neplatná pozice, zadej jí prosím znovu.");
           }
           else if(pole[xO][yO].contains(" ")){
              pole[xO][yO]=pole[xO][yO].replace(" ", "O");
              podminka += 1;
              k++;
              //výpis pole
              for(int j=0;j<pole[0].length;j++){
                for(int i=0;i<pole.length;i++){
                  System.out.print(pole[i][j]);
              }  
              System.out.println();             
        }
        }
           //neplatná pozice           
           else{
              System.out.println("Neplatná pozice, zadej jí prosím znovu.");
        }
        
        //VYHODNOCENÍ VÝHRY
        if(k==81){
            System.out.print("Remíza.");
            System.exit(0);            
        }
        
        //vyhodnocení výhry (vodorovně)
        String poleV = "";
        for(int j=1;j<pole.length;j++){
                for(int i=0;i<pole[0].length;i++){
                  poleV += pole[i][j];                  
            }
        }
        if(poleV.contains("OOOOO")){
                    System.out.print("Vyhrál hráč s kolečky");
                    System.exit(cyklus);
        }
        if(poleV.contains("XXXXX")){
                    System.out.print("Vyhrál hráč s křížky");
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
                    System.out.print("Vyhrál hráč s kolečky");
                    System.exit(cyklus);
        }
        if(poleS.contains("XXXXX")){
                    System.out.print("Vyhrál hráč s křížky");
                    System.exit(cyklus);
        }
        //vyhodnocení výhry (diagonálně)
        String poleD = "";
        for(int j=0;j<pole.length;j++){
            poleD += pole[j][j];
        }
        for(int j=0;j<6;j++){
                for(int i=0;i<5;i++){
                  poleD += pole[j+i][i];                  
        }
        }
        for(int j=0;j<5;j++){
                for(int i=0;i<6;i++){
                  poleD += pole[i][j+i];                  
        }
        }
        if(poleD.contains("OOOOO")){
                    System.out.print("Vyhrál hráč s kolečky");
                    System.exit(cyklus);
        }
        if(poleD.contains("XXXXX")){
                    System.out.print("Vyhrál hráč s křížky");
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
        if(poleD2.contains("OOOOO")){
                    System.out.print("Vyhrává hráč s kolečky");
                    System.exit(cyklus);
        }
        if(poleD2.contains("XXXXX")){
                    System.out.print("Vyhrál hráč s křížky");
                    System.exit(cyklus);
        }
        }
        //hráč s křížky   
        System.out.println("");
        System.out.println("Na řadě je hráč s křížky");
        int podminka2 = 0;
        while(podminka2<=0){
           System.out.println("Zadej pozici X kam chceš tahnout:");
           int xX = Integer.parseInt(sc.nextLine());
           System.out.println("Zadej pozici Y kam chceš tahnout:");
           int yX = Integer.parseInt(sc.nextLine());

           if((xX>9||yX>9)||(xX<1||yX<1)){
               System.out.println("Neplatná pozice, zadej jí prosím znovu.");
           }
           else if(pole[xX][yX].contains(" ")){
              pole[xX][yX]=pole[xX][yX].replace(" ", "X");
              podminka2 += 1;
              k++;
              //výpis pole
              for(int j=0;j<pole[0].length;j++){
                for(int i=0;i<pole.length;i++){
                  System.out.print(pole[i][j]);
              }
              System.out.println();
        }        
        }
           //neplatná pozice
           else{
              System.out.println("Neplatná pozice, zadej jí prosím znovu.");
            }

        //VYHODNOCENÍ VÝHRY
        
        //vyhodnocení výhry (vodorovně)
        String poleV = "";
        for(int j=1;j<pole.length;j++){
                for(int i=0;i<pole[0].length;i++){
                  poleV += pole[i][j];                  
            }
        }
        if(poleV.contains("OOOOO")){
                    System.out.print("Vyhrál hráč s kolečky");
                    System.exit(cyklus);
        }
        if(poleV.contains("XXXXX")){
                    System.out.print("Vyhrál hráč s křížky");
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
                    System.out.print("Vyhrál hráč s kolečky");
                    System.exit(cyklus);
        }
        if(poleS.contains("XXXXX")){
                    System.out.print("Vyhrál hráč s křížky");
                    System.exit(cyklus);
        }
        //vyhodnocení výhry (diagonálně)
        String poleD = "";
        for(int j=0;j<pole.length;j++){
            poleD += pole[j][j];
        }
        for(int j=0;j<6;j++){
                for(int i=0;i<5;i++){
                  poleD += pole[j+i][i];                  
        }
        }
        for(int j=0;j<5;j++){
                for(int i=0;i<6;i++){
                  poleD += pole[i][j+i];                  
        }
        }
        if(poleD.contains("OOOOO")){
                    System.out.print("Vyhrál hráč s kolečky");
                    System.exit(cyklus);
        }
        if(poleD.contains("XXXXX")){
                    System.out.print("Vyhrál hráč s křížky");
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
        if(poleD2.contains("OOOOO")){
                    System.out.print("Vyhrává hráč s kolečky");
                    System.exit(cyklus);
        }
        if(poleD2.contains("XXXXX")){
                    System.out.print("Vyhrál hráč s křížky");
                    System.exit(cyklus);
        }
        }
    }      
    }
}
