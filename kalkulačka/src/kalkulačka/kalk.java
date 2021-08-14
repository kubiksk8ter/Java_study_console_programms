/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulačka;

/**Třída reprezentuje kalkulátor, na které
 *se dá vyvolat součet,rozdíl, součin, podíl
 * @author kuba
 */
public class kalk {
    //**Jakékoliv číslo*/
    public float a;
    public float b;
    //**Třída vyvolá kteroukoliv zvolenou akci*/
    /**Sečte čísla a a b
     * @param c
     * @return
     */
    public float soucet (float c){
        c = a+b;
        System.out.println("Výsledek je " + c);
        return c;        
    }
    /**Odečte čísla a od b
     * @param c
     * @return
     */
    public float rozdil (float c){
        c = a-b;
        System.out.println("Výsledek je " + c);
        return c;
    }
    /**vynásobí čísla a a b
     * @param c
     * @return
     */
    public float soucin (float c){
        c = a*b;
        System.out.println("Výsledek je " + c);
        return c;
    }
    /**dělí čísla a a b
     * @param c
     * @return
     */
    public float podil (float c){
        c = a/b;
        System.out.println("Výsledek je " + c);
        return c;
    }
}