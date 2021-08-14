/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domnodeiterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.w3c.dom.traversal.*;

/**
 *
 * @author kuba
 */
public class DOMNodeIterator {

    private static final String SOUBOR = "jidlo.xml";
    
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
            
            //FILTROVANY VYPIS VSECH ELEMENTU A TEXTU
            TreeWalker ni = ((DocumentTraversal) doc).createTreeWalker(doc.getDocumentElement(),
                    NodeFilter.SHOW_ELEMENT + NodeFilter.SHOW_TEXT, new Filtr(), false);            
            vypisSeznam(ni);
        } catch (Exception e) {e.printStackTrace(); }
    }     
    private static void vypisSeznam(TreeWalker ni) {
        Node n;
        while((n = ni.nextNode()) != null) {
            if(n.getNodeType() == Node.ELEMENT_NODE) {
                System.out.print(n.getNodeName() + ": ");
            }
            else {System.out.println(n.getNodeValue());}
}}}
class Filtr implements NodeFilter {
    @Override
    public short acceptNode(Node n) {
        if(n.getNodeName().equals("ovoce") == true) {
            return NodeFilter.FILTER_SKIP;
        }
        else if (n.getNodeType() == Node.TEXT_NODE && n.getNodeValue().trim().length() == 0) {
            return NodeFilter.FILTER_SKIP;
        }
        return NodeFilter.FILTER_ACCEPT;
}}

