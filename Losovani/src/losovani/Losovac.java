/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package losovani;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author kuba
 */
public class Losovac {
    private ArrayList<Integer> cisla;
    private Random random;
    
    public Losovac(){
        random = new Random();
        cisla = new ArrayList<Integer>();
    }
    
    public int losuj(){
        Integer cislo = random.nextInt(100);
        cisla.add(cislo);
        return cislo;
    }
    
    public String Vypis(){
        String s = "";
        Collections.sort(cisla);
        for(int i : cisla){
            s += i + " ";
        }
        return s;
    }
}
