/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bednasnaradim;

/**
 *
 * @author kuba
 */
public class Kladivo extends Nastroj{
    private boolean obourucni;

    public Kladivo(String nazev, int vaha, boolean obourucni) {
        super(nazev, vaha);
        this.obourucni = obourucni;
    }

    @Override
    String pracuj() {
        return String.format("Zatloukám");
    }

    /**
     * @return the obourucni
     */
    public boolean isObourucni() {
        return obourucni;
    }

    /**
     * @param obourucni the obourucni to set
     */
    public void setObourucni(boolean obourucni) {
        this.obourucni = obourucni;
    }
    
    
}
