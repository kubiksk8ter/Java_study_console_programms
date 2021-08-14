/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trojuhelnikclass;

/**
 *
 * @author kuba
 */
public class PravouhlyTrojuhelnik {
    private final int odvesna1;
    private final int odvesna2;
    private double prepona = 0;
    
    public PravouhlyTrojuhelnik(int a, int b){
        this.odvesna1 = a;
        this.odvesna2 = b;
    }
    public PravouhlyTrojuhelnik(){
        odvesna1 = 1;
        odvesna2 = 1;
    }
    public double obsah(){
        double s;
        s = (odvesna1*odvesna2)/2d;
        return s;
    }
    
    public double delkaPrepony(){
        prepona = Math.sqrt(Math.pow(getOdvesna1(), 2)+Math.pow(getOdvesna2(), 2));
        return prepona;
    }

    /**
     * @return the odvesna1
     */
    public int getOdvesna1() {
        return odvesna1;
    }

    /**
     * @return the odvesna2
     */
    public int getOdvesna2() {
        return odvesna2;
    }
}
