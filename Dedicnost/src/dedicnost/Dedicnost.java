/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dedicnost;

/**
 *
 * @author kuba
 */
public class Dedicnost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Uzivatel u = new Uzivatel("jan",25);
        Administrator a = new Administrator("franta", 26);
        
        if(u instanceof Administrator){
            System.out.print("Ano, je to Administrátor!");
        }
        else{
            System.out.print("Je to uživatel");
        }
        
    }
    
}
