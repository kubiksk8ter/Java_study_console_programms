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
public class Vlakno2 extends Thread{
    @Override
    public void run() {
        while (Vlakno.hotovo == false){
            System.out.println(Vlakno.suma + "\r");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                
            }
        }
        System.out.println(Vlakno.suma);
    }
    
}
