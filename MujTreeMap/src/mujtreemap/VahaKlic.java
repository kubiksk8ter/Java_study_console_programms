/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mujtreemap;

/**
 *
 * @author kuba
 */
public class VahaKlic implements Comparable<VahaKlic> {
    double vaha;

    public VahaKlic(double vaha) { this.vaha = vaha; }

    @Override
    public String toString() {
        return Double.toString(vaha);
    }

    @Override
    public int hashCode() {
        return (int) vaha;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VahaKlic == false) {
            return false;
        }
        boolean stejnaVaha = (vaha == ((VahaKlic) obj).vaha);
        return stejnaVaha;
    }
    
    @Override
    public int compareTo(VahaKlic vk) {
        return((int)(this.vaha = vk.vaha));
    }    
}
