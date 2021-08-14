/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg15.vigenerova.šifra;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad15VigenerovaŠifra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte text k zašifrování:");
        String text = sc.nextLine();
        System.out.println("Zadejte heslo:");
        String heslo = sc.nextLine();
        String sifra = "";
        String heslo2= "";
        //cyklus pro opak. hesla
        for(int y=0;y<text.length();y++){
            heslo2 += heslo.charAt(y);
            if(heslo.length()<text.length());{
            heslo = heslo + heslo;
        }
            }
        //hlavní cyklus
        for(int i=0;i<text.length();i++){
            //převod text na ASCII
            char a = text.charAt(i);
            int textASCII = (int)a;
            //převod heslo na ASCII
            char b = heslo.charAt(i);
            int hesloASCII = (int)b;
            
            int s = (hesloASCII-96)+textASCII;
            if(s>(int)'z'){
                s-=26;
            }
            sifra += (char)s;
            }
        System.out.println(sifra);
        }
        


        
        
        
    
    
}
