/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulačka;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Kalkulačka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Vítejte v kalkulačce");
        
        String odpoved = "";        
        //Hlavní cyklus
        while (odpoved.equals("ano")||odpoved.equals("")){
        System.out.println("Zadejte první číslo");
        kalk cisla = new kalk();
        cisla.a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadej druhé číslo");
        kalk b = new kalk();
        cisla.b = Float.parseFloat(sc.nextLine());
        System.out.println("Zvolte si operaci:");
        System.out.println("1 - sčítání");
        System.out.println("2 - odčítání");
        System.out.println("3 - násobení");
        System.out.println("4 - dělení");
        int volba = Integer.parseInt(sc.nextLine());
        switch (volba)
        {
            case 1:
            cisla.soucet(volba);
            break;
            case 2:
            cisla.rozdil(volba);
            break;
            case 3:
            cisla.soucin(volba);
            break;
            case 4:
            cisla.podil(volba);
            break;
        }
        if ((volba > 0) && (volba < 5))
        {
        }
        else
        {
        System.out.println("Neplatná volba");
        }        
        System.out.print("Chcete znovu použít kalkulačku? (Ano/Ne)");
        odpoved = sc.nextLine();
        }
        System.out.println("Děkuji za použití kalkulačky.");
	}
}
        
        
        
        
        
    
    

