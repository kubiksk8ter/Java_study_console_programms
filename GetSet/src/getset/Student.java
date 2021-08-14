/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getset;

/**
 *
 * @author kuba
 */
public class Student {
    private String jmeno;
    private int vek;
    private boolean plnolety;
    private boolean muz;
    
    public Student(String jmeno, boolean muz, int vek){
        this.jmeno = jmeno;
        this.muz = muz;
        this.vek = vek;
        plnolety = true;
        if(vek<18){
            plnolety = false;
        }
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @return the vek
     */
    public int getVek() {
        return vek;
    }

    /**
     * @param vek the vek to set
     */
    public void setVek(int vek) {
        this.vek = vek;
        if(getVek() < 18){
            plnolety = false;
        }
        else{
            plnolety = true;
        }
    }

    /**
     * @return the plnolety
     */
    public boolean isPlnolety() {
        return plnolety;
    }

    /**
     * @return the muz
     */
    public boolean isMuz() {
        return muz;
    }
    
    @Override
    public String toString(){
        String a = "jsem";
        String b = "muž";
        if (!plnolety){
            a = "nejsem";
        }
        if(!muz){
            b = "žena";
        }
        return String.format("Jmenuji se %s, jsem %s a %s plnoletý.\n", jmeno,b,a);
    }
    
    
}
