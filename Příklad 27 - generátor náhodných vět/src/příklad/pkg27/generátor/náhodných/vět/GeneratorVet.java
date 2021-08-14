/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg27.generátor.náhodných.vět;
import java.util.Random;
/**
 *
 * @author kuba
 */
public class GeneratorVet {
    public String[] podnety = {"jednorožec", "programátor", "manažer", "hroch", "T-rex"};
    public String[] prisudky = {"spal", "ležel", "vařil", "uklízel", "derivoval"};
    public String[] privlastky = {"modrý", "velký", "hubený", "nejlepší", "automatizovaný"};
    public String[] prislovce = {"rychle", "s oblibou", "hodně", "málo", "se zpožděním"};
    public String[] mista = {"pod stolem", "v lese", "u babičky", "v práci", "na stole"};
    private Random random;
    
    public String veta(){
        random = new Random();
        
        return String.format(privlastky[random.nextInt(5)]+ " " +podnety[random.nextInt(5)]+" "
                +prislovce[random.nextInt(5)]+" "+prisudky[random.nextInt(5)]+" "+mista[random.nextInt(5)]+"\n");
        
        
    
   
    
    
    }
}
