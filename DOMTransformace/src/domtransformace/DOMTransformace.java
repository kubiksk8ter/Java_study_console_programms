/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domtransformace;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author kuba
 */
public class DOMTransformace {

    private static final String SOUBOR = "jidlo.xml";
    private static final String VYSTUPNI_SOUBOR = "jidlo-UTF8-test.xml";
    
    public static void main(String[] args) {
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
            
            zmenDokument(doc);
            
            TransformerFactory tf = TransformerFactory.newInstance();   
            Transformer zapisovac = tf.newTransformer();
            
            zapisovac.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            zapisovac.setOutputProperty(OutputKeys.ENCODING, "windows-1250");
            
            DOMResult d = new DOMResult();
            zapisovac.transform(new DOMSource(doc), d);
            
            Document doc2 = (Document)d.getNode();
            doc2.setXmlStandalone(true);
            
            zapisovac.transform(new DOMSource(doc2), new StreamResult(VYSTUPNI_SOUBOR));
            
        }
        catch(Exception e) {e.printStackTrace();}
    }
    
    public static void zmenDokument(Document doc) {
        Node jidlo = doc.getDocumentElement();
        //Odstranění ovoce č. 1
        NodeList nl = doc.getElementsByTagName("ovoce");
        Node ovoce1 = nl.item(0);
        jidlo.removeChild(ovoce1);
        //Odstranění atributu č. 2
        Element ovoce2 = (Element) nl.item(0);
        ovoce2.removeAttribute("cislo");
        //Zmena jednotkova cena z 25 na 15
        NodeList nlNazev = doc.getElementsByTagName("nazev");
        Element nazev = (Element) nlNazev.item(0);
        nazev.setAttribute("jednotkovaCena", "15");
        //Pridani atributu vaha 2 kg
        NodeList nlVaha = doc.getElementsByTagName("vaha");
        Element vaha = (Element) nlVaha.item(0);
        vaha.setAttribute("jednotka", "kg");
        //Pridani elemetu vzhled: cerstvi & vonavy
        Element vzhled = doc.createElement("vzhled");
        Text text = doc.createTextNode("Čerství & voňavý");
        ovoce2.appendChild(vzhled);
        vzhled.appendChild(text);
        //odradkovani za elementem vzhled
        Text textCRLF = doc.createTextNode("\n    ");
        ovoce2.appendChild(textCRLF);
    }
}
