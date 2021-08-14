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
public class KoloDedicnost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kolo a = new Kolo("Rocksider", 52890 , false);
        a.vypisCoJsiZac();
        
        HorskeKolo b = new HorskeKolo("Author", 125899 , false , 21 , 5);
        b.vypisCoJsiZac();
        
        Motocykl c = new Motocykl("Suzuki", 255899, 5);
        c.vypisCoJsiZac();
        
    }
    
}
