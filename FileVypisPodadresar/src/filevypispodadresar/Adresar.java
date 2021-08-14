/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filevypispodadresar;

import java.io.File;

/**
 *
 * @author kuba
 */
public class Adresar {
    private final String jmenoAdr;

    public Adresar(String jmenoAdr) {
        this.jmenoAdr = jmenoAdr;
    }
    
    public void vypisPodAdr(){
        File soubor = new File(jmenoAdr);
        String [] Adr = soubor.list();       
        for (String Adr1 : Adr) {
            File aktSoub = new File(jmenoAdr,Adr1);
            if(aktSoub.isDirectory()){
                System.out.println(Adr1);
            }
            String [] podAdr = aktSoub.list();           
            for(String Adr2 : podAdr) {
                File aktPodSoub = new File(aktSoub,Adr2);
                if(aktPodSoub.isDirectory()){
                    System.out.println("\t" + Adr2);
                }
            }
            
        }
        
    }
            
}
