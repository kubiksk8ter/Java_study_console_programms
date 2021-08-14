/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statika;

/**
 *
 * @author kuba
 */
public class Statika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Uzivatel u = new Uzivatel("Tomáš Marný","heslojeveslo");
        System.out.printf("ID prvního uživatele: %s\n",u.vratId());
        Uzivatel v = new Uzivatel("Olí Znusinudle", "csfd1fg");
        System.out.printf("ID druhého uživatele: %s\n",v.vratId());
        System.out.printf("Minimální délka hesla uživatele je: %s\n", Uzivatel.vratMinimalniDelkuHesla());
        System.out.printf("Validnost hesla \"heslo\"je: %s", Uzivatel.zvalidujHeslo("heslo"));
        
        Kalendar kalendar = new Kalendar();
        System.out.println("\n" + kalendar.vratNastaveni());
               

    }
    
}
