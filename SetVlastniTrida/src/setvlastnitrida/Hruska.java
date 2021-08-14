/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setvlastnitrida;

/**
 *
 * @author kuba
 */
public class Hruska implements Comparable<Hruska> {
    int cena;

    public Hruska(int cena) {this.cena = cena;}

    @Override
    public String toString() {return "" + cena;}

    
    @Override
    public int hashCode() {return cena;}
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        boolean stejnaCena = (cena == ((Hruska) obj).cena);
        return stejnaCena;
    }

    @Override
    public int compareTo(Hruska o) {
        if(cena > o.cena) {return(+1);}
        else if(cena == o.cena) {return(0);}
        else return (-1);
    }    
}
