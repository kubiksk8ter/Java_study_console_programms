/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolodedicnost;

/**
 *
 * @author kuba
 */
public class HorskeKolo extends Kolo {
    private int prevodyVzadu;
    private int prevodyVpredu;

    public HorskeKolo(String vyrobce, int cena, boolean maPrehazovacku, int prevodyVzadu, int prevodyVpredu) {
        super(vyrobce, cena, true);
        this.prevodyVzadu = prevodyVzadu;
        this.prevodyVpredu = prevodyVpredu;
    }

    /**
     * @return the prevodyVzadu
     */
    public int getPrevodyVzadu() {
        return prevodyVzadu;
    }

    /**
     * @param prevodyVzadu the prevodyVzadu to set
     */
    public void setPrevodyVzadu(int prevodyVzadu) {
        this.prevodyVzadu = prevodyVzadu;
    }

    /**
     * @return the prevodyVpredu
     */
    public int getPrevodyVpredu() {
        return prevodyVpredu;
    }

    /**
     * @param prevodyVpredu the prevodyVpredu to set
     */
    public void setPrevodyVpredu(int prevodyVpredu) {
        this.prevodyVpredu = prevodyVpredu;
    }
    
    @Override
    public void setMaPrehazovacku(boolean maPrehazovacku) {
            maPrehazovacku = true;
            System.out.println("Horské kolo má vždy přehazovačku!");
                
    }
    
    @Override
    public String getDruh() {
        return "Horské kolo\n"; 
    }
    @Override
    void vypisCoJsiZac(){
        super.vypisCoJsiZac();
        String s = "";
        s += "\tPočet převodů v zadu: " + prevodyVzadu;
        s += "\n\tPočet převodů ve předu: " + prevodyVpredu;
        s += "\n\tPočet rychlostí: " +(prevodyVzadu * prevodyVpredu) + "\n";
        System.out.println(s);
    }
    
    
}
