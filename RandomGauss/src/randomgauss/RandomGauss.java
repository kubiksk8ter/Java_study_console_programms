/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomgauss;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author kuba
 */
public class RandomGauss {
    static int pocet = 21;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length == 1) {
            pocet = Integer.parseInt(args[0]);
        }
        Random r = new Random(123);
        double[] d = new double[100000];
        for (int i = 0; i < d.length; i++) {
            d[i] = r.nextGaussian();
            //d[i] = r.nextDouble();
        }
        Arrays.sort(d);
        double max = Math.max(Math.abs(d[0]), d[d.length - 1]);
        for (int i = 0; i < d.length; i++) {
            d[i] /= max;
        }
        double[] h = new double[pocet + 1];
        for (int i = 0; i < d.length; i++) {
            int j = (int)((d[i] * (pocet / 2 + 1)) + (pocet / 2 + 1));
            if(j >= pocet) {
                j = pocet;
            }
            h[j]++;            
        }
        max = 0.0;
        for (int i = 0; i < h.length; i++) {
            if(max < h[i]){
                max = h[i];
            }
        }
        for (int i = 0; i < h.length; i++) {
            h[i] /= max;
            h[i] *= 60;
        }
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }        
    }    
}
