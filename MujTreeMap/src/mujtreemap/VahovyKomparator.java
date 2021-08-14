/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mujtreemap;

import java.util.Comparator;

/**
 *
 * @author kuba
 */
public class VahovyKomparator implements Comparator<VahaKlic> {
    @Override
    public int compare(VahaKlic o1, VahaKlic o2) {
        return (int)(o1.vaha - o2.vaha);   }   }
