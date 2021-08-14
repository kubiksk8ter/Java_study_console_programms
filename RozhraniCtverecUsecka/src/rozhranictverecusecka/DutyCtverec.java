/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozhranictverecusecka;

/**
 *
 * @author kuba
 */
public class DutyCtverec extends Ctverec {
    
    public DutyCtverec(int strana) {
        super(strana);
    }

    @Override
    public int getStrana() {
        return super.getStrana();
    }

    @Override
    public void zobraz() {
        System.out.println("");
        for(int y = 0; y<getStrana();y++){
            for(int x = 0; x<getStrana(); x++){
                if((x>0)&&(x<getStrana()-1)&&(y>0)&&(y<getStrana()-1)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
