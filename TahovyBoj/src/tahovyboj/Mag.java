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
public class Mag extends Bojovnik {
    //**Mana*/
    private int mana;
    //**Maximální mana*/
    private int maxMana;
    //**Speciální útok mága*/
    private int magickyUtok;
    
    public Mag(String jmeno, int zivot,int utok, int obrana, Kostka kostka, int mana, int magickyUtok){
        super(jmeno,zivot,utok,obrana,kostka);
        this.mana = mana;
        this.maxMana = mana;
        this.magickyUtok = magickyUtok;
    }
    
    //**Útok pro mága*/
    @Override
    public void utok(Bojovnik souper){
        int uder = 0;
        //Mana není naplněna
        if (mana<maxMana){
            mana+=10;
            if(mana>maxMana){
                mana=maxMana;                
            }
            super.utok(souper);
        }
        else{//Magicky útok
            uder = magickyUtok + kostka.hod();
            nastavZpravu(String.format("%s použil magii za %s hp", jmeno, uder));
            mana = 0;
        }
        souper.branSe(uder);
    }
    //**Ukazatel many*/
    public String grafickaMana(){
        return grafickyUkazatel(mana,maxMana);
    }
}
