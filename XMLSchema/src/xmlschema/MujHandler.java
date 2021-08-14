/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlschema;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author kuba
 */
public class MujHandler extends DefaultHandler {
    private static final int VELIKOST_BUFFERU = 10000;
    private static final String JMENO_ELEMENTU = "nazev";
    
    public ArrayList<Ovoce> ar = new ArrayList<>();
    private String nazev;
    private StringBuffer hodnota = new StringBuffer(VELIKOST_BUFFERU);
    private boolean uvnitrElementu;
    private int cislo, jednotkovaCena;
    private double vaha;
    
    public ArrayList<Ovoce> getSeznam() {
        return ar;      
    }

    public String getNazvy() {
        return nazev;    }
    @Override
    public void startDocument() throws SAXException {
        ar.clear(); }
    @Override
    public void startElement(String uri, String localName, String qName,
    Attributes attributes) throws SAXException {
        if(qName.equals("ovoce") == true) {
            cislo = Integer.parseInt(attributes.getValue("cislo"));
        } 
        else if(qName.equals("nazev") == true) {
            jednotkovaCena = Integer.parseInt(attributes.getValue("jednotkovaCena"));
            hodnota.setLength(0);
            uvnitrElementu = true;
        }
        else if(qName.equals("vaha") == true) {           
            hodnota.setLength(0);
            uvnitrElementu = true;
                }    }
    @Override
    public void characters(char[] ch, int start, int length)
    throws SAXException {
        if(uvnitrElementu == true) {
            hodnota.append(ch, start, length);
        }
    }
    @Override
    public void endElement(String uri, String localName, String qName)
    throws SAXException {
        if(qName.equals("vaha") == true) {           
            vaha = Double.parseDouble(hodnota.toString());
            uvnitrElementu = false;
                }
        else if(qName.equals("ovoce") == true) {
            ar.add(new Ovoce(cislo, jednotkovaCena, nazev, vaha));
        } 
        else if(qName.equals("nazev") == true) {
            nazev = hodnota.toString();
            uvnitrElementu = false;
        }}}
