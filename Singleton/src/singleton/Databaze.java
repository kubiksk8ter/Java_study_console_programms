/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author kuba
 */
public class Databaze {
    private String jmeno;
    static Databaze databaze = new Databaze("MySQL");
    
    private Databaze(String jmeno){
        this.jmeno = jmeno;
    }
    
    static Databaze getInstance(){
        return databaze;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }
}
