/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domclone;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author kuba
 */
public class DOMClone {
    private static final String VYSTUPNI_SOUBOR = "jidlo-nove.xml"; 
    private static final String VALIDACNI_SOUBOR = "jidlo.xsd";
    public static void main(String[] args) throws TransformerConfigurationException,
            TransformerException, ParserConfigurationException, IOException {
        Document zdroj = vytvorDocument();
        try{ //Validace souboru
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema sch = sf.newSchema(new File(VALIDACNI_SOUBOR));
            Validator val = sch.newValidator();
            val.setErrorHandler(new ChybyZjisteneParserem());
            val.validate(new DOMSource(zdroj));
            System.out.println("Validace probehla uspesne.");
        }
        catch (SAXException e){}
        try{  //Vytvoření souboru
            TransformerFactory tf = TransformerFactory.newInstance();   
            Transformer zapisovac = tf.newTransformer();           
            // Hloubka odsazení
            zapisovac.setOutputProperty(OutputKeys.INDENT, "yes");
            zapisovac.setOutputProperty(
                    "{http://xml.apache.org/xslt}indent-amount","2");
            zapisovac.setOutputProperty(OutputKeys.ENCODING, "windows-1250");
            
            zapisovac.transform(new DOMSource(zdroj),
                    new StreamResult(new File(VYSTUPNI_SOUBOR)));
        }
        catch(Exception e) {    }
    }
    private static Document vytvorDocument() throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        /* Vytvoří obal pro universální parser, který dále umožňuje
        nastavení validace podle XSD a zpracování jmenných prostorů*/
        dbf.setNamespaceAware(true);
        dbf.setValidating(false);
        // Validace se nebude provádět
        DocumentBuilder builder = dbf.newDocumentBuilder();
        // Vytvoření vlastního parseru
        builder.setErrorHandler(new ChybyZjisteneParserem());
        DOMImplementation impl = builder.getDOMImplementation();
        // Rozhraní potřebné k vytvoření dokumentu
        Document doc = impl.createDocument(null, "jidlo", null);
        // Vytvoření dokumentu
        
        Node jidlo = doc.getDocumentElement();
        Element ovoce = doc.createElement("ovoce");
        ovoce.setAttribute("cislo", "-10");
        Element nazev = doc.createElement("nazev");
        nazev.setAttribute("jednotkovaCena", "30");
        Text textNazev = doc.createTextNode("švestky");
        nazev.appendChild(textNazev);
        Element vaha = doc.createElement("vaha");
        Text textVaha = doc.createTextNode("1.5");
        vaha.appendChild(textVaha);
        
        ovoce.appendChild(nazev);
        ovoce.appendChild(vaha);
        
        Element ovoceKlon = (Element) ovoce.cloneNode(true);
        jidlo.appendChild(ovoce);
        jidlo.appendChild(ovoceKlon);
        return doc;    }    }
