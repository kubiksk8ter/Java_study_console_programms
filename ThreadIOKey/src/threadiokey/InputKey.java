/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadiokey;

import java.io.IOException;

/**
 *
 * @author kuba
 */
public class InputKey extends Thread{
    static public boolean hotovo = false;
    @Override
    public void run(){
        byte[] pole = new byte[1];
        Thread.currentThread().setPriority(MAX_PRIORITY);
        while(hotovo==false){
            try{
                System.in.read(pole);
                if(pole[0] == 'k'){
                    hotovo = true;
                }
            }
            catch(IOException e){
                System.out.println("Chyba vstupu");
                hotovo = true;
            }
        }
    }
}
