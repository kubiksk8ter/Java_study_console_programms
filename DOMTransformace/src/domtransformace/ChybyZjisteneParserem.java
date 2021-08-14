/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domtransformace;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ChybyZjisteneParserem implements ErrorHandler {
    //sformátování textu hlášení
    private String textHlaseni(SAXParseException e) {
        return e.getSystemId() + "\n" 
                + "radka: " + e.getLineNumber()
                + " sloupec" + e.getColumnNumber()
                + "\n" + e.getMessage();
    }
    @Override //obsluha varovných hlášení
    public void warning(SAXParseException e) {
        System.out.println("Varování: " + textHlaseni(e));
    }
    @Override //obsluha chyb
    public void error(SAXParseException e) {
        System.out.println("Chyba: " + textHlaseni(e));
    }
    @Override //obsluha fatáních chyb
    public void fatalError(SAXParseException e) throws SAXException {
        throw new SAXException("Chyba " + textHlaseni(e));
    }   
}
