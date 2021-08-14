/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloobjects;

/**
 *
 * @author kuba
 */
public class HelloObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zdravic zdravic;
        zdravic = new Zdravic();
        zdravic.text = "Ahoj uživateli";
        System.out.println(zdravic.pozdrav("Karel"));
        System.out.println(zdravic.pozdrav("Petr"));
        zdravic.text = "Vítám tě tu programátore";
        System.out.println(zdravic.pozdrav("Richard"));
        
    }
    
}
