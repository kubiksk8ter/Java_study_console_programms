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
public class Arena {
    //**Instance bojovníků*/
    private Bojovnik bojovnik1;
    private Bojovnik bojovnik2;
    //**Instance hrací kostky*/
    private Kostka kostka;
    
    public Arena(Bojovnik bojovnik1, Bojovnik bojovnik2, Kostka kostka){
        this.bojovnik1 = bojovnik1;
        this.bojovnik2 = bojovnik2;
        this.kostka = kostka;
    }
    //**Vykreslení zdraví, manu bojovníků*/
    private void vykresli(){
        System.out.println("-------------- Aréna -------------- \n");
        System.out.println("Bojovníci: \n");
        vypisBojovnika(bojovnik1);
        System.out.println();
        vypisBojovnika(bojovnik2);
        System.out.println();
    }
    //**Výpis zdraví s dramatickou pauzou :D */
    private void vypisZpravu(String zprava){
        System.out.println(zprava);
        try{
            Thread.sleep(500);
        } catch(InterruptedException ex){
            System.err.println("Chyba, nepovedlo se uspat vlákno");
        }
    }
    //**Metoda vyvolávající útoky bojovniků*/
    public void zapas(){
        Bojovnik b1= bojovnik1;
        Bojovnik b2= bojovnik2;
        System.out.println("Vítej v aréně!");
        System.out.printf("Dnes se utkají %s s %s! \n\n", bojovnik1, bojovnik2);
        //prohození bojovníku
        boolean zacinaBojovnik2 = (kostka.hod()<=kostka.vratPocetSten()/2);
        if(zacinaBojovnik2){
            b1 = bojovnik2;
            b2 = bojovnik1;
        }
        System.out.printf("Začínat bude bojovník %s! \n\nZápas může začít...", b1);
        
        //Cyklus s bojem
        while(b1.nazivu()&& b2.nazivu()) {
            b1.utok(b2);
            vykresli();
            vypisZpravu(b1.vratPosledniZpravu());// zpráva o útoku
            vypisZpravu(b2.vratPosledniZpravu());// zpráva o obraně
            b2.utok(b1);
            vykresli();
            vypisZpravu(b2.vratPosledniZpravu());// zpráva o útoku
            vypisZpravu(b1.vratPosledniZpravu());// zpráva o obraně
            System.out.println();
        }
    }
    
    private void vypisBojovnika(Bojovnik b){
        System.out.println(b);
        System.out.print("Život: ");
        System.out.println(b.grafickyZivot());
        if(b instanceof Mag){
            System.out.print("Mana: ");
            System.out.println(((Mag)b).grafickaMana());
        }
    }
    
}
