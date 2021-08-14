/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package výpočet.norem;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Norma {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    //**Instance motoru*/
    Motor motor;
    
    String cisloM;
        
    //**Počet motorů*/
    private int casSerie;
    //**Počet pracovníků*/
    private int pocetMotoru;
    
    Norma norma;
    
    //**Počítání normy*/
    public Norma(int pocetMotoru, Motor motor){
        this.pocetMotoru = pocetMotoru;        
        this.motor = motor;
    }
    //**Výpis*/
    public int casSerie(){
    casSerie += pocetMotoru * motor.cas;
    return casSerie;        
    }
    
    @Override
    public String toString(){
        return String.format("%s min\n",casSerie);
    }
}
