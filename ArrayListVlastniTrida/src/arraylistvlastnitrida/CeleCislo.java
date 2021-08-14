/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistvlastnitrida;

/**
 *
 * @author kuba
 */
public class CeleCislo {
    private int cislo;

    public CeleCislo(int cislo) {
        this.cislo = cislo;
    }

    public int getCislo() {
        return cislo;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    @Override
    public String toString() {
        return "" + cislo;
    }
    
}
