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
public class Uzivatel {
   public int vek;
   public String jmeno;
   
   public Uzivatel(String jmeno, int vek){
       this.jmeno = jmeno;
       this.vek = vek;
   }
   @Override
   public String toString(){
       return jmeno;
   }
}
