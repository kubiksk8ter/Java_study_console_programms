/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg9.pkg2;

import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class Příklad92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    System.out.println("Zadejte postupně koeficienty a,b,c kvadratické rovnice ax^2+bx+c=0 :");
    double a = Double.parseDouble(sc.nextLine());
    double b = Double.parseDouble(sc.nextLine());
    double c = Double.parseDouble(sc.nextLine());
    double d = (b*b - 4 * a * c);
    double x1 = (-b+Math.sqrt(d))/2*a;
    double x2 = (-b-Math.sqrt(d))/2*a;
    if ((x1<0)&&(x2>0))
       { System.out.println("Rovnice má jeden kořen x = " + x2);
       }
    else if ((x1>0)&&(x2<0))
       { System.out.println("Rovnice má jeden kořen x = " + x1);
       }
    else if ((x1<0)&&(x2<0))
       { System.out.println("Neexistuje řešení v oblasti reálných čísel");
       }
    else if ((x1>0)&&(x2>0))
       { System.out.println("Rovnice má 2 reálné kořeny x1 = " + x1 + " x2 = " +x2);
       }
    else if (a==0||b==0||c==0)
       { System.out.println("není kvaatická rovnice");
       }
    }
    
}
