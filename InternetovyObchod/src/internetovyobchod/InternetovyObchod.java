/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetovyobchod;

/**
 *
 * @author kuba
 */
public class InternetovyObchod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zakaznik zakaznik = new Zakaznik(1, "Tomáš", "Marný");
        Adresa adresa = new Adresa("Ve Svahu", 10, 2, "Praha", "10000", "Česká Republika");
        Produkt produkt = new Produkt("Body pro ITnetwork.cz", "Body pro zpřístupnění prémiového obsahu a dosažení vašeho vysněného zaměstnání v IT.", 239);
        Objednavka objednavka = new Objednavka(1, produkt, zakaznik, adresa);
        
        Gateway brana = new Gateway();
        brana.processOrder(objednavka);
    }
    
}
