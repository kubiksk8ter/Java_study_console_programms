/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetovyobchod;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class Objednavka implements OrderInterface{
    private int cisloObjednavky;
    Produkt produkt;
    Zakaznik zakaznik;
    Adresa adresa;    
    
    public Objednavka(int cisloObjednavky, Produkt produkt, Zakaznik zakaznik, Adresa adresa){
        this.cisloObjednavky = cisloObjednavky;
        this.produkt = produkt;
        this.zakaznik = zakaznik;
        this.adresa = adresa;
    }

    @Override
    public int getNumber() {
        return cisloObjednavky;
    }

    @Override
    public String getFirstName() {
        return zakaznik.getJmeno();
    }

    @Override
    public String getLastName() {
        return zakaznik.getPrijmeni();
    }

    @Override
    public String getStreet() {
        return adresa.getNazevUlice();
    }

    @Override
    public int getHouseNumber() {
        return adresa.getCisloPopisne();
    }

    @Override
    public int getRegistryNumber() {
        return adresa.getCisloOrientacni();
    }

    @Override
    public String getCity() {
        return adresa.getMesto();
    }

    @Override
    public String getZipCode() {
        return adresa.getPSC();
    }

    @Override
    public String getCountry() {
        return adresa.getStat();
    }

    @Override
    public String getProducts() {
        return produkt.getNazev();
    }
   

    @Override
    public int getProductPrices() {
        return produkt.getCena();
    }

    @Override
    public int getProductQuantities() {
        return zakaznik.getPocetObjednavek();
    }
    
    
}
