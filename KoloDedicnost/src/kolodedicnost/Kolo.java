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
public class Kolo extends JednostopeVozidlo{
    private String vyrobce;
    private int cena;
    private boolean maPrehazovacku;

    public Kolo(String vyrobce, int cena, boolean maPrehazovacku) {
        this.vyrobce = vyrobce;
        this.cena = cena;
        this.maPrehazovacku = maPrehazovacku;
    }

    /**
     * @return the vyrobce
     */
    public String getVyrobce() {
        return vyrobce;
    }

    /**
     * @param vyrobce the vyrobce to set
     */
    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    /**
     * @return the cena
     */
    public int getCena() {
        return cena;
    }

    /**
     * @param cena the cena to set
     */
    public void setCena(int cena) {
        this.cena = cena;
    }

    /**
     * @return the maPrehazovacku
     */
    public boolean isMaPrehazovacku() {
        return maPrehazovacku;
    }

    /**
     * @param maPrehazovacku the maPrehazovacku to set
     */
    public void setMaPrehazovacku(boolean maPrehazovacku) {
        this.maPrehazovacku = maPrehazovacku;
    }
    
    @Override
    public String getDruh() {
        return "Kolo\n";
    }
    @Override
    void vypisCoJsiZac(){
        super.vypisCoJsiZac();
        System.out.print(this.getDruh());
        String s = "";
        s += "\tVýrobce: " + vyrobce;
        s += "\n\tCena: " + cena + ",-";
        if(maPrehazovacku){
            s += "\n\tKolo je s přehazovačkou.";
        }else{
            s += "\n\tKolo je bez přehazovačky." + "\n";
        }
        System.out.println(s);        
    }
    
    
    
}
