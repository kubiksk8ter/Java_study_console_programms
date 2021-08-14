/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priklad34.singleton;

/**
 *
 * @author kuba
 */
public class Databaze {
    private String jmeno;
    private static Databaze databaze;
    
    private Databaze(String jmeno){
        this.jmeno = jmeno;
    }    
    public static Databaze getInstance(){
        if(databaze == null)
            databaze = new Databaze("MySQL");
        return databaze;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    
    
}
