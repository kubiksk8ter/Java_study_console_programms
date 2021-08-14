/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozhranictverecusecka;

/**
 *
 * @author kuba
 */
public class RozhraniCtverecUsecka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usecka usecka = new Usecka(5);
        Ctverec ctverec = new Ctverec(5);
        Ctverec ctverec2 = new DutyCtverec(10);
        
        usecka.zobraz();
        ctverec.zobraz();
        ctverec2.zobraz();
    }
    
}
