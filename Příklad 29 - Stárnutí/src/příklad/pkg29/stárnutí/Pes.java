/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg29.stárnutí;

/**
 *
 * @author kuba
 */
public class Pes {
    public String jmeno;
    public int vek;
    
    public Pes(String jmeno, int vek){
        this.jmeno = jmeno;
        this.vek = vek;
    }
    public void zestarni(){
        vek+=1;
    }
    @Override
    public String toString(){
        return String.format("%s (%s let)\n",jmeno,vek);
    }
}
