/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg30.prochazeni;

/**
 *
 * @author kuba
 */
public class Lokace {
    public String vypis = null;
    
    public String hrad = "Hrad\nStojíš před okovanou branou gotického hradu, která je zřejmě jediným vchodem do pevnosti.\n" +
"Klíčová dírka je pokryta pavučinami, což vzbuzuje dojem, že je budova opuštěná.\n";
    public String les = "Les\nJsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n" +
"slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.\n";
    public String lesniRozcesti = "Lesní rozcestí\nNacházíš se na lesním rozcestí.\n";
    public String rybnik = "Rybník\nDošel jsi ke břehu malého rybníka. Hladina je v bezvětří jako zrcadlo. Kousek\n" +
"od tebe je dřevěná plošina se stavidlem.\n";
    public String dum = "Dům\nStojíš před svým rodným domem, cítíš vůni čerstvě nasekaného dřeva, která se line\n" +
"z hromady vedle vstupních dveří.\n";
    
    public String hrad(){
        return String.format(hrad);
    }
    public String les1(){
        return String.format(les);       
    }
    public String les2(){
        return String.format(les);
    }
    public String les3(){
        return String.format(les);
    }
    public String lesniRozcesti(){
        return String.format(lesniRozcesti);
    }
    public String rybnik(){
        return String.format(rybnik);
    }
    public String dum(){                
        return String.format(dum);
    }
    @Override
    public String toString(){
        return String.format(vypis);
    }
}
