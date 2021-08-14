/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.cookbook;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.Normalizer;
import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class DatabazeReceptu {
    private static final ArrayList<Recept> recepty = new ArrayList<>(); 
    private FileOutputStream fileOut;
    private static FileInputStream fileIn;
    private ObjectOutputStream objectOut; 
    private static ObjectInputStream objectIn;

    /**
     *
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    public DatabazeReceptu() throws IOException, FileNotFoundException, ClassNotFoundException {
        nactiRecepty();
        System.out.println(this.testUlozeni());
    }
    
    /**
     * Vymaže recept ze složky Recepty
     * @param recept
     */
    public void vymazReceptZeSlozky(Recept recept) {
        String nazevReceptu = recept.getNazev();
        File file = new File("Recepty//SerializedFiles//"+nazevReceptu+".ser");
        file.delete();
    }
        
    /**
     * Uloží recept do složky Recepty
     * @param r
     */
    public void ulozRecept(Recept r) {
        recepty.add(r);
        //Serializace objektu recept
        try {
            fileOut = new FileOutputStream("Recepty//SerializedFiles//" + r.getNazev() + ".ser");
            objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(r);
            objectOut.close();
            fileOut.close();
            System.out.println("Serializace proběhla úspěšně.");
        } 
        catch (IOException e) {
        }       
    }
    
    /* Nefunkční blok
    public void ulozReceptyAll () {
        try {
            fileOut = new FileOutputStream("Recepty.ser");
            objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(recepty);
            objectOut.close();
            fileOut.close();
            System.out.println("Serializace proběhla úspěšně.");
        } 
        catch (IOException e) {
        }
        */       
    
    /**
     * Načte recepty ze složky Recepty a uloží je do kolekce Recepty
     * @param r
     */
    private static void nactiRecepty () throws FileNotFoundException, IOException, ClassNotFoundException {
        /*
        File file = new File("Recepty.ser");
        if(!file.exists()) {
            file.createNewFile();
        }
        try {
            fileIn = new FileInputStream("Recepty.ser");
            objectIn = new ObjectInputStream(fileIn);
            recepty = (ArrayList<Recept>) objectIn.readObject();
            fileIn.close();
            objectIn.close();           
        } catch (ClassNotFoundException e) {
            System.out.println("Recept se nepodařilo načíst.");
    }
        */
        
        Recept r = null;
        File f = new File("Recepty//SerializedFiles//");
        String [] soubory = f.list();
        for(String nazev : soubory) {
            try {
                fileIn = new FileInputStream("Recepty//SerializedFiles//" + nazev);
                objectIn = new ObjectInputStream(fileIn);
                r = (Recept) objectIn.readObject();
                recepty.add(r);
                fileIn.close();
                objectIn.close();           
            } catch (ClassNotFoundException e) {
                System.out.println("Recept se nepodařilo načíst.");
            }
        }    
    }
      
    /**
     * Načte názvy všech receptů a vypíše je do seznamu
     * @param list
     */
    public void nactiNazvy(List list) {
        list.removeAll();
        for(Recept r : recepty) {
            list.add(r.getNazev());
        }
    }
    
    private static String prevedText(String vstup) {
        return vstup = Normalizer.normalize(vstup, Normalizer.Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replaceAll(" ", "").toLowerCase();        
    }
    /**
     * Pro vyhledávání receptů.
     * Podle zadaných parametrů vyhledá názvy receptů a vypíše je do seznamu.
     * @param list
     * @param nazevReceptu
     * @param nazvyIng
     */
    public void hledejNazvyReceptu(List list, String nazevReceptu, ArrayList <String> nazvyIng) { 
        nazevReceptu = prevedText(nazevReceptu);
        list.removeAll();       
        for(Recept r : recepty) {
            ArrayList nazvyIngDB = new ArrayList();
            //Převod ingrediencí na malá písmena bez diakritiky
            for(String ing : r.getNazvyIng()) {
                nazvyIngDB.add(prevedText(ing));
            }
            if(!(nazevReceptu.equals(""))) {
                if(prevedText(r.getNazev()).contains(nazevReceptu)) {
                    list.add(r.getNazev());
                }
            }
            else if(nazvyIngDB.containsAll(nazvyIng)) {               
                list.add(r.getNazev());
            }
        }       
    }
      
    /**
     *
     * @param nazev
     * @return instanci receptu
     */
    public Recept nactiRecept(String nazev) {
        Recept recept = null;
        for(Recept r : recepty) {
            if(r.getNazev().equals(nazev)) {
                recept = r;
            }
        }
        return recept;
    }

    /**
     * Vymaže recept z kolekce
     * @param recept
     */
    public void vymazRecept(Recept recept) {
                recepty.remove(recept);
                System.out.println("recept vymazán");
    }
    
    public boolean receptExists(String nazevReceptu) {
        boolean exists = false;
        for(Recept r : recepty) {
            if(r.getNazev().equals(nazevReceptu)) {
                exists = true;
            }
        }
        return exists;
    }
    
    /**
     *
     * @return String -> Název receptu, Popis receptu, [[Název ingredience, Množství ingredience][...]]
     */
    public String testUlozeni() {
        String s = "";
        for(Recept r : recepty) {
            s += r.getNazev() + ", ";
            s += r.getPopis() + ",";
            s += r.IngredienceToString() + "\n";
        }
        return s;
    }
}
