/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;

/**
 *
 * @author kuba
 */
public class Bojovnik {
    //**Jméno bojovníka*/
    protected String jmeno;
    //**Život v HP*/
    protected int zivot;
    //**Maximální zdraví*/
    protected int maxZivot;
    //**Útok v HP*/
    protected int utok;
    //**Obrana v HP*/
    protected int obrana;
    //**Instance hrací kostky*/
    protected Kostka kostka;
    //**Vyvolaní zprávy*/
    private String zprava;
    
    //**Vytvoření bojovníka*/
    public Bojovnik(String jmeno, int zivot,int utok, int obrana, Kostka kostka){
        this.jmeno = jmeno;
        this.zivot = zivot;
        this.maxZivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kostka = kostka;
    }
    
    //**Výpis bojovníka*/
    @Override
    public String toString(){
        return jmeno;
    }
    
    //**Kontorla života*/
    public boolean nazivu(){
        return(zivot>0);        
    }
    
    //**Vykreslení ukazatele*/
    protected String grafickyUkazatel(int aktualni, int maximalni){
        String s = "[";
        int celkem = 20;
        double pocet = Math.round(((double)aktualni/maximalni)*celkem);
        if((pocet == 0)&&(nazivu())){
            pocet = 1;
        }
        for(int i = 0; i < pocet; i++){
            s+="█";
        }
        for(int i = 0; i < celkem - pocet; i++){
            s+=" ";
        }
        s+="]";
        return s;
    }
    
    //**Ukazatel života*/
    public String grafickyZivot(){
        return grafickyUkazatel(zivot,maxZivot);
    }
    
    //** Obrana*/
    public void branSe(int uder){
        int zraneni = uder - (obrana + kostka.hod());
        if(zraneni > 0){
            zivot -= zraneni;
            zprava = String.format("%s utrpěl zranení %s HP", jmeno, zraneni);
            if(zivot <= 0){
                zivot = 0;
            }
        }
    }
    
    //**Útok*/
    public void utok(Bojovnik souper){
        int uder = utok + kostka.hod();
        nastavZpravu(String.format("%s útočí s úderem za %s hp", jmeno, uder));
        souper.branSe(uder);
    }
    
    //**Nastavení zprávy*/
    protected void nastavZpravu(String zprava){
        this.zprava = zprava;
    }
    
    //**Navrácení zprávy*/
    public String vratPosledniZpravu(){
        return zprava;
    }
}
