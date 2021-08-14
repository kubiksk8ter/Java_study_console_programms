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
abstract class JednostopeVozidlo {
    private String druh;
    
    void vypisCoJsiZac(){
        System.out.print("Druh jednostopého vozidla: ");
    }

    /**
     * @return the druh
     */
    public String getDruh() {
        return druh;
    }

    /**
     * @param druh the druh to set
     */
    public void setDruh(String druh) {
        this.druh = druh;
    }
    
}
