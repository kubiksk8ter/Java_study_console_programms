/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg30.procházení.pkg2;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Hra {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    public String text = "";
    Hra pozice;
    Lokace lokace = new Lokace();
    

    
    public void pozice1(){        
                        
        System.out.print(lokace.dum);
        while(!text.equals("jdi na západ")){
        System.out.println("\nZadej příkaz:");
        text = sc.nextLine();
        if(text.equals("jdi na západ")){
            pozice.pozice2();
        }
        else{
            System.out.print("Tímto směrem nelze jít.");
        }
        }
       
        
}
    public void pozice2(){

       System.out.print(lokace.les);
        if(text.equals("Jdi na východ")){
            pozice.pozice1();
        }
        else{
            System.out.print("Tímto směrem nelze jít.");
        }
        
}
}
