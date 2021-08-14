/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staxwrite;

import java.io.FileOutputStream;
import java.util.Random;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author kuba
 */
public class StAXWrite {
    public static final String SOUBOR = "jidlo-generovano.xml";
    public static final int POCET = 3;   
    public static void main(String[] args) {
        try {
            Random r = new Random();
            String kodovani = "UTF-8";
            XMLOutputFactory f = XMLOutputFactory.newInstance();
            XMLStreamWriter w = f.createXMLStreamWriter(new FileOutputStream(SOUBOR), kodovani);
            w.writeStartDocument(kodovani, "1.0");
            w.writeCharacters("\r\n");
            w.writeComment(" přehled šmakovních dobrůtek");
            w.writeCharacters("\r\n");
            w.writeStartElement("jidlo");            
            for (int i = 1; i <= POCET; i++) {
                w.writeCharacters("\r\n ");
                w.writeStartElement("ovoce");
                w.writeAttribute("cislo", "" + i);
                w.writeCharacters("\r\n   ");
                w.writeStartElement("nazev");
                int cena = r.nextInt(40) + 10;
                w.writeAttribute("jednotkovaCena", "" + cena);
                String nazev = "ovoce " + i + " &<";
                w.writeCharacters(nazev);
                w.writeEndElement();
                w.writeCharacters("\r\n   ");
                w.writeStartElement("vaha");
                double vaha = r.nextDouble() * 10.0;
                String oriznute = String.valueOf(vaha).substring(0, 3);
                w.writeCharacters(oriznute);
                w.writeEndElement();
                w.writeCharacters("\r\n ");
                w.writeEndElement();                
            }
            w.writeCharacters("\r\n");
            w.writeEndElement();
            w.writeCharacters("\r\n");
            w.writeEndDocument();
            w.close();
        }
        catch (Exception e) {
            e.printStackTrace();
    }    }    }
