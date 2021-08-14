/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlschema;

import java.io.IOException;
import java.util.ArrayList;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import javax.xml.parsers.*;

public class XMLSchema {

    private static final String SOUBOR = "jidlo.xml";
    
    public static void main(String[] args) {
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();  
            spf.setValidating(false);   
            SAXParser saxLevel1 = spf.newSAXParser();   
            XMLReader parser = saxLevel1.getXMLReader();
            parser.setErrorHandler(new ChybyZjisteneParserem());  
            MujHandler vh = new MujHandler();
            parser.setContentHandler(vh); 
            parser.parse(SOUBOR);
            ArrayList <Ovoce> ar = vh.getSeznam();
            ZpracovaniDatVPameti.tiskniVse(ar);
            System.out.println(ZpracovaniDatVPameti.celkovaCena(ar));
            System.out.println("soubor " + SOUBOR + " precten bez chyb");
        } catch (IOException | ParserConfigurationException | SAXException e) {
}    }    }
