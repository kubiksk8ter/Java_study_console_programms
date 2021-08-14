/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloobjects;

/**Třída reprezentuje zdravič, který slouží ke zdravení uživatelů
 *
 * @author kuba
 */
public class Zdravic {
    /** Text pozdravu */
    public String text;
    /**
     * Pozdraví uživatele textem pozdravu a jeho jménem
     * @param  jmeno  Jméno uživatele
     * @return      Text s pozdravem
     */
    public String pozdrav(String jmeno) {
        return String.format("%s %s", text, jmeno);
    }
    
    
}
