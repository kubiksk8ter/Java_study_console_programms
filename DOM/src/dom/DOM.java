/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dom;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;

/**
 *
 * @author kuba
 */
public class DOM {

    private static  final String SOUBOR = "jidlo-komentar.xml";
    
    public static void main(String[] args) throws ParserConfigurationException,
    IOException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            /* Vytvoří obal pro universální parser, který dále umožňuje
            nastavení validace podle XSD a zpracování jmenných prostorů*/
            dbf.setValidating(false);           
            // Validace se nebude provádět
            dbf.setIgnoringComments(true);
            // Odstraní komentáře
            DocumentBuilder builder = dbf.newDocumentBuilder();
            // Vytvoření vlastního parseru
            builder.setErrorHandler(new ChybyZjisteneParserem());
            /* Protože DOM používá vnitřně pro parsování SAX, je nastavení
            reakce na chyby shodné se SAX */
            Document doc = builder.parse(SOUBOR);  //nacteni dokumentu do paměti
            System.out.println(tiskni(doc));
        } catch (Exception e) {e.printStackTrace(); }                
    }   
    private static double[] getVahy(Document doc) {
        NodeList nl = doc.getElementsByTagName("vaha");       
        //Uloží do seznamu všechny elementy vaha;
        double[] vaha = new double[nl.getLength()];
        for (int i = 0; i < nl.getLength(); i++) {
            Node e = nl.item(i);    //Element
            Node t = e.getFirstChild(); //Text
            String s = t.getNodeValue().trim();
            vaha [i] = Double.parseDouble(s);
        }
        return vaha;
    }    
    private static double[] getCeny(Document doc) {
        NodeList nl = doc.getElementsByTagName("nazev");
        double[] ceny = new double[nl.getLength()];
        for (int i = 0; i < nl.getLength(); i++) {
            Node e = nl.item(i);
            Attr a = ((Element)e).getAttributeNode("jednotkovaCena");
            String s = a.getValue().trim();
            ceny[i] = Double.parseDouble(s);
        }
        return ceny;
    }    
    private static String[] getNazvy(Document doc) {
        NodeList nl = doc.getElementsByTagName("nazev");
        String [] nazvy = new String[nl.getLength()];        
        for (int i = 0; i < nl.getLength(); i++) {
            Node e = nl.item(i);
            Node t = e.getFirstChild();
            nazvy[i] = t.getNodeValue();
        }
        return nazvy;
    }    
    private static String tiskni(Document doc) {
        String s = "";
        for (int i = 0; i < getNazvy(doc).length; i++) {
            s += getNazvy(doc)[i] + ": " + getVahy(doc)[i]
                    + "kg, " + getCeny(doc)[i] + "kc\n";
        }
        return s;
    }
    /*
    private static double[] getCelkovaCena(Document doc) {
        NodeList nl = doc.getElementsByTagName("ovoce");
        double[] celkovaCena = new double[nl.getLength()];
        for (int i = 0; i < nl.getLength(); i++) {
            Node e = nl.item(i);
            if(e.getNodeType() == Node.ELEMENT_NODE) {
                celkovaCena[i] = getCenaOvoce(e);
            }
        }
        return celkovaCena;
    }
    
    private static int getJednotkovaCena(Node ovoce) {
        Node nazev = getNodePodleJmena(ovoce, "nazev");
        NamedNodeMap nnm = nazev.getAttributes();
        String hodnota = nnm.getNamedItem("jednotkovaCena").getNodeValue();
        return Integer.parseInt(hodnota);
    }
    
    private static double getCenaOvoce (Node ovoce) {
        double jednotkovaCena = getJednotkovaCena(ovoce);
        Node vaha = getNodePodleJmena(ovoce, "vaha");
        Node text = getNodePodleJmena(vaha, "#text");
        String hodnota = text.getNodeValue().trim();
        return Double.parseDouble(hodnota) * jednotkovaCena;
    }
    
    private static Node getNodePodleJmena(Node rodic, String jmeno) {
        NodeList nl = rodic.getChildNodes();
        for (int i = 0; i < nl.getLength(); i++) {
            Node e = nl.item(i);
            if(e.getNodeName().equals(jmeno) == true) {
                return e;
            }
        }
        return null;
    }*/

    @Override
    public String toString() {
        return "DOM{" + '}';
    }
}
