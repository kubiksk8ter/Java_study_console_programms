/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

/**
 *
 * @author kuba
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread());
        long zac = System.currentTimeMillis();
        Vlakno vlakno = new Vlakno("e:\\Download\\test\\POLE.txt");
        vlakno.start();
        Vlakno2 vlakno2 = new Vlakno2();
        vlakno2.start();
        //vlakno2.join();
        long kon = System.currentTimeMillis();
        System.out.println("Konec: " + (kon - zac));
    }
    
}
