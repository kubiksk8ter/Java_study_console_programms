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
public class Motocykl extends JednostopeVozidlo{
    private String vyrobce;
    private int cena;
    private int obsahNadrze;

    public Motocykl(String vyrobce, int cena, int obsahNadrze) {
        this.vyrobce = vyrobce;
        this.cena = cena;
        this.obsahNadrze = obsahNadrze;
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
     * @return the obsahNadrze
     */
    public int getObsahNadrze() {
        return obsahNadrze;
    }

    /**
     * @param obsahNadrze the obsahNadrze to set
     */
    public void setObsahNadrze(int obsahNadrze) {
        this.obsahNadrze = obsahNadrze;
    }
    
    @Override
    public String getDruh() {
        return "Motocykl\n";
    }
    
    @Override
    void vypisCoJsiZac(){
        super.vypisCoJsiZac();
        System.out.print(this.getDruh());
        String s = "";
        s += "\tVýrobce: " + vyrobce;
        s += "\n\tCena: " + cena + ",-";
        s += "\n\tObsah nádže: " + obsahNadrze + "l";
        System.out.println(s);        
    }
}
