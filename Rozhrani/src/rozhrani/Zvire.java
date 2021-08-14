/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozhrani;

/**
 *
 * @author kuba
 */
public abstract class Zvire implements Comparable {
    private int vaha;
    
    public Zvire(int vaha){
        this.vaha = vaha;
    }

    /**
     * @return the vaha
     */
    public int getVaha() {
        return vaha;
    }

    /**
     * @param vaha the vaha to set
     */
    public void setVaha(int vaha) {
        this.vaha = vaha;
    }
    
    public void dychej(){
        System.out.println("Dýchám...");
    }
    
    public abstract void presunSe();
    
    @Override
    public int compareTo(Object o){
        Zvire jine = (Zvire)o;
        if(this.vaha < jine.vaha){
            return -1;
        }
        if(this.vaha > jine.vaha){
            return 1;
        }
        return 0;
    }
}
