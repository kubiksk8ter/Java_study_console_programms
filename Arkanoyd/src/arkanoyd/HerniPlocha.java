/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkanoyd;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kuba
 */
public class HerniPlocha {
    //** Herní plocha * //
    public String[][] plocha = new String [17][8];
    
    //**Pole pro uložení cihliček*/
    private ArrayList<String> cihlicky = new ArrayList<>();
    //**Cihličky*/
    private String cihlicka = "/";
    
    private int smerX = 1;
    private int smerY = 6;
    private String smer = "";
   
    //** Vyplnění a ohraničení herní plochy*/
    public void vytvorPlochu(){
        //Vyplnené plochy mezerou
        for(int i=0;i<plocha.length;i++){
            for(int y=0;y<plocha[0].length;y++){
                plocha[i][y]=" ";
            }
        }
        //Ohraničení plochy
        for(int i=0; i<plocha[0].length; i++){
            plocha[0][i]="|";
            plocha[16][i]="|";
        }
        for(int i=0; i<plocha.length; i++){
            plocha[i][0]="-";
            plocha[i][7]="-";                    
        }
        plocha[0][0]="+";plocha[0][7]="+";plocha[16][0]="+";plocha[16][7]="+";                
    }
    //** Vykreslení plochy*/
    public void Vykresli(){
        for(int j=0;j<plocha[0].length;j++){
                for(int i=0;i<plocha.length;i++){
                  System.out.print(plocha[i][j]);
              }  
              System.out.println();             
        }
    }
    //** Vložení cihličky*/
    public String vlozCihlicku(int x, int y){
        cihlicky.add(cihlicka);
        return plocha[x][y]=cihlicka;        
    }
    
    //**Výpis herní plochy*/
    public String VypisPoleSCihlickami(){
        return cihlicky.toString();
    }
    
    //**Hlavní herní cyklus*/
    public void Hraj() throws InterruptedException {


        
        //GAME LOOP - hlavní herní cyklus
        while(!cihlicky.contains(null)){
        //míček
        String ball = "O";                
        int x = smerX;
        int y = smerY;


        if((x==1)&&(y==6)){
            smer = "upRight";
        }
        
        
            //Vykreslení herní plochy
            plocha[x][y]= ball;
            for(int j=0;j<plocha[0].length;j++){
                for(int i=0;i<plocha.length;i++){
                  System.out.print(plocha[i][j]);
                }  
                System.out.println();             
            }
            //Vymaže předchozí ball
            plocha[x][y]= " ";
            
            //určení pohybu
            if(smer=="upRight"){
                
                
                if(y==1){
                    smer = "downRight";
                    smerX --;
                    smerY ++;
                }
                if(x==15){
                    smer = "upLeft";
                    smerX --;
                    smerY ++;
                }
                smerX ++;
                smerY --;
                
            }
            if(smer=="downRight"){
                if(y==5){
                    smer = "upRight";
                    
                    
                }
                if(x==15){
                    smer = "downLeft";
                    smerX --;
                    smerY --;
                }
                smerX ++;
                smerY ++;                
            }
            if(smer=="upLeft"){
                if(x==1){
                    smer = "upRight";
                    smerX ++;
                    smerY ++;
                }
                if(y==1){
                    smer = "downLeft";
                    smerX ++;
                    smerY ++;
                }
                    
                smerX --;
                smerY --;
            }
            if(smer=="downLeft"){
                if(x==2){
                    smer="downRight";

                }
                if(y==5){
                    smer="upLeft";
                }
                smerX --;
                smerY ++;
            }
            System.out.println(smer);
            System.out.println(smerX);
            System.out.println(smerY);

            
        
        
        
                    
        //čekání
        Thread.sleep(500);
        }
        }
        
        
        
    
       
   
    
    
}
