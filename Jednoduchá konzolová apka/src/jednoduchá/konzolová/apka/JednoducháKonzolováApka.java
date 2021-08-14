/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jednoduchá.konzolová.apka;

/**
 *
 * @author kuba
 */
public class JednoducháKonzolováApka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 56;
        int b = 28;
        Uzivatel u = new Uzivatel("Jan Novák", 28);
        Uzivatel v = new Uzivatel("Josef Nový",32);      
        System.out.printf("a: %s\nb: %s\nu: %s\nv: %s\n",a,b,u,v);
        a=b;
        u=v;
        System.out.printf("a: %s\nb: %s\nu: %s\nv: %s\n",a,b,u,v);
        
        v.jmeno = "John Doe";
        v = null;
        System.out.printf("u: %s\nv: %s\n", u, v);
        
        
    }
    
}
