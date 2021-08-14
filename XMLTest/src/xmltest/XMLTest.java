/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmltest;

import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;

/**
 *
 * @author kuba
 */
public class XMLTest {
    private static  final String SOUBOR = "test.xml";   
    public static void main(String[] args) throws ParserConfigurationException, IOException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            /* Vytvoří obal pro universální parser, který dále umožňuje
            nastavení validace podle XSD a zpracování jmenných prostorů*/
            dbf.setValidating(false);
            // Validace se nebude provádět
            DocumentBuilder builder = dbf.newDocumentBuilder();
            // Vytvoření vlastního parseru
            Document doc = builder.parse(SOUBOR);  //nacteni dokumentu do paměti
            System.out.println(SOUBOR + " precten bez chyb");
            
            Scanner sc = new Scanner(System.in, "Windows-1250");
            System.out.println("Element: ");
            String s = sc.nextLine();
            NodeList nl = doc.getElementsByTagName(s);
            NodeIterator ni;
            for (int i = 0; i < nl.getLength(); i++) {
                Node n = nl.item(i);                      
                ni = ((DocumentTraversal) doc).createNodeIterator(n,NodeFilter.SHOW_ELEMENT + NodeFilter.SHOW_TEXT, new Filtr(), true);
                System.out.print(hledejAVypis(ni));
            }
        } catch (Exception e) { }  }   
    private static String hledejAVypis(NodeIterator ni) {       
        Node o;
        String vypis = "";
        while((o = ni.nextNode()) != null) {
            if(o.getNodeType() == Node.ELEMENT_NODE) {
                vypis += o.getNodeName() + ": ";
            }
            else {
                vypis += o.getNodeValue() + ", " + "\n";    }       }
        return vypis;    }}
class Filtr implements NodeFilter {
    @Override
    public short acceptNode(Node n) {
        if(n.getNodeName().equals("ovoce") == true) {
            return NodeFilter.FILTER_SKIP;
        }
        else if(n.getNodeType() == Node.TEXT_NODE && n.getNodeValue().trim().length() == 0) {
            return NodeFilter.FILTER_SKIP;
        }
        return NodeFilter.FILTER_ACCEPT;    }    }

    

