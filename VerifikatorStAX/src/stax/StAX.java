/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stax;
import java.io.*;
import javax.xml.stream.*;

public class StAX {
  public static final String SOUBOR = "jidlo.xml";
  public static void main(String[] args) {
    try {
      XMLInputFactory f = XMLInputFactory.newInstance();
      XMLStreamReader r = f.createXMLStreamReader(new FileReader(SOUBOR));
      System.out.println(getNazevACena(r));
    }   
    catch (XMLStreamException e) {
      System.out.println("Chyba pri cteni XML souboru");
      e.printStackTrace();
    }
    catch (Exception e) {   e.printStackTrace();    }
  }
  private static String getNazevACena(XMLStreamReader r) {
      String s = "";
      try {      
        while (r.hasNext() == true) {
          r.next();
          if(r.isStartElement() == false) {   continue;   }
          if(r.getLocalName().equals("nazev") == true) {
              int cena = Integer.parseInt(r.getAttributeValue(null, "jednotkovaCena"));
              String nazev = r.getElementText() + ": "; 
              s += nazev + ": " + cena + ",-" + "\n";
          }}}   
      catch (XMLStreamException e) {
        System.out.println("Chyba pri cteni XML souboru");
        e.printStackTrace();
    }
      return s;
  }
}

