/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidelbaprace;

/**
 *
 * @author kuba
 */
public class Faktorial {
    public long factorial(int n) {
        long f = 1;
        for(int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
