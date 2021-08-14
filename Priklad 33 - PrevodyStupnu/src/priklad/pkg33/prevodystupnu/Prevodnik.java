/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad.pkg33.prevodystupnu;

/**
 *
 * @author kuba
 */
public class Prevodnik {   
    public static String StupneNaRadiany(int stupne){
        double radiany = stupne*Math.PI/180;
        return String.format("%s stupňů na radiány: %s", stupne, radiany);
    }
    
    public static String RadianyNaStupne(double radiany){
        double stupne = radiany*180/Math.PI;
        return String.format("%s radiánů na stupně: %s", radiany, stupne);
    }
}
