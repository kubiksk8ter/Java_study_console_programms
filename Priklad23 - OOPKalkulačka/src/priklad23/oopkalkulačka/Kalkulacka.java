/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad23.oopkalkulačka;

/**
 *
 * @author kuba
 */
public class Kalkulacka {
    //**Jakékoliv číslo*/
    public double a;
    public double b;
    //**Třída vyvolá kteroukoliv zvolenou akci*/
    /**Sečte čísla a a b
     * @param c
     * @return
     */
    public double soucet (double c){
        c = a+b;
        System.out.println("Součet: " + c);
        return c;        
    }
    /**Odečte čísla a od b
     * @param c
     * @return
     */
    public double rozdil (double c){
        c = a-b;
        System.out.println("Rozdíl: " + c);
        return c;
    }
    /**vynásobí čísla a a b
     * @param c
     * @return
     */
    public double soucin (double c){
        c = a*b;
        System.out.println("Součin: " + c);
        return c;
    }
    /**dělí čísla a a b
     * @param c
     * @return
     */
    public double podil (double c){
        c = a/b;
        System.out.println("Podíl: " + c);
        return c;
    }
}
