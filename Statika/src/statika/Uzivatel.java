/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statika;

/**
 *
 * @author kuba
 */
public class Uzivatel {
    private String jmeno;
    private String heslo;
    private boolean prihlaseny;
    private int id;    
    private static int minimalniDelkaHesla = 6;
    private static int dalsiId = 1;
    
    public Uzivatel(String jmeno, String heslo){
        this.jmeno = jmeno;
        this.heslo = heslo;
        prihlaseny = false;
        id = dalsiId;
        dalsiId++;
    }
    
    public boolean prihlasSe(String zadaneHeslo){
        if(zadaneHeslo.equals(heslo)){
            prihlaseny = true;
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean zvalidujHeslo(String heslo){
        if(heslo.length()>=minimalniDelkaHesla){
            return true;
        }
        return false;
    }
    
    public static int vratMinimalniDelkuHesla(){
        return minimalniDelkaHesla;
    }
    
    public int vratId(){
        return id;
    }
}
