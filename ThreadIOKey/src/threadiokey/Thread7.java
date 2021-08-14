/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadiokey;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kuba
 */
public class Thread7 extends Thread{
    @Override
    public void run(){
        long i = 0;
        while(InputKey.hotovo == false){
            System.out.println(i++ + "\r");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
