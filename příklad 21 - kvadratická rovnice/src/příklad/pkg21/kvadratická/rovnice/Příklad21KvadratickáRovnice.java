/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg21.kvadratická.rovnice;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad21KvadratickáRovnice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte postupně koeficienty a,b,c kvadratické rovnice ax^2+bx+c=0 :");
        float a = Integer.parseInt(sc.nextLine());
        float b = Integer.parseInt(sc.nextLine());
        float c = Integer.parseInt(sc.nextLine());
        //Vzorec pro výpočet diskriminantu
        float dis = b*b - 4*a*c;
        
        if(a==0 || b==0 || c==0){
            System.out.println("Není kvadratická rovnice");                                            
        }
        else if(dis>0){
            float x1 = (float) ((-b + Math.sqrt(dis))/(2*a));
            float x2 = (float) ((-b - Math.sqrt(dis))/(2*a));
            System.out.printf("Rovnice má 2 reálné kořeny x1 = " + x1 + ", x2 = "+ x2);
        }
        else if(dis<0){
            System.out.print("Neexistuje řešení v oblasti reálných čísel");
        }
        else{
            float x = -b/(2*a);
            System.out.println("Rovnice má jeden kořen x = " + x);
        }
                
    }
    
}
