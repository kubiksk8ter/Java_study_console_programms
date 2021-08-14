/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package příklad.pkg30.prochazeni;
import java.util.Scanner;
/**
 *
 * @author kuba
 */
public class Příklad30Prochazeni {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        
        //Vypíše lokaci v hlavním cyklu
        Lokace vypis = new Lokace();        
        vypis.vypis = vypis.dum;
        //scaner
        Hra text = new Hra();          
        //pozice
        int pozice = 1;
        
        
        //pomocné Stringy
        String z = "jdi na západ"; 
        String v = "jdi na východ";
        String s = "jdi na sever";
        String j = "jdi na jih";
        String nelze = "Tímto směrem nelze jít.";
        String neobsahuje = "Můj vstupní slovník neobsahuje tento příkaz.";
        
        //HLAVNÍ CYKLUS     
        text.text = "";
        while(!text.text.equals("konec")){
            
            //Cyklus pro pozici 1 (dům)    
            while(pozice==1){
            System.out.print(vypis); 
            System.out.println("\nMůžeš jít na západ");
            System.out.println("\nZadej příkaz:");        
            text.text = sc.nextLine();    
                if(text.text.equals(z)){
                    vypis.vypis = vypis.les;
                    pozice++;
                }                
                else if(text.text.equals(v)
                    ||text.text.equals(j)||
                    text.text.equals(s)){
                    
                    System.out.println(nelze);
                    vypis.vypis = "";
                }
                else if(text.text.equals("konec")){
                    System.exit(0);
                }
                else{
                    System.out.println(neobsahuje);
                    vypis.vypis = "";
                            
                }
            }
            //Cyklus pro pozici 2 (les)
            while(pozice==2){
            System.out.print(vypis);
            System.out.println("\nMůžeš jít na sever východ");
            System.out.println("\nZadej příkaz:");        
            text.text = sc.nextLine();    
                if(text.text.equals(v)){
                    vypis.vypis = vypis.dum;
                    pozice--;
                }
                else if(text.text.equals(s)){
                    vypis.vypis = vypis.lesniRozcesti;
                    pozice++;
                }
                else if(text.text.equals(z)
                    ||text.text.equals(j)){
                    
                    System.out.println(nelze);
                    vypis.vypis = "";
                }
                else if(text.text.equals("konec")){
                    System.exit(0);
                }
                else{
                    System.out.println(neobsahuje);
                    vypis.vypis = "";
                            
                }                                
            }
            //Cyklus pro pozici 3 (lesní rozcestí)
            while(pozice==3){
            System.out.print(vypis);
            System.out.println("\nMůžeš jít na jih západ východ");
            System.out.println("\nZadej příkaz:");        
            text.text = sc.nextLine();    
                if(text.text.equals(j)){
                    vypis.vypis = vypis.les;
                    pozice--;
                }
                else if(text.text.equals(v)){
                    vypis.vypis = vypis.les;
                    pozice++;
                }
                else if(text.text.equals(z)){
                    vypis.vypis = vypis.les;
                    pozice=6;
                }
                else if(text.text.equals(s)){
                    
                    System.out.println(nelze);
                    vypis.vypis = "";
                }
                else if(text.text.equals("konec")){
                    System.exit(0);
                }
                else{
                    System.out.println(neobsahuje);
                    vypis.vypis = "";
                            
                }
            }
            //Cyklus pro pozici 4 (les)    
            while(pozice==4){
            System.out.print(vypis); 
            System.out.println("\nMůžeš jít na západ východ");
            System.out.println("\nZadej příkaz:");        
            text.text = sc.nextLine();    
                if(text.text.equals(v)){
                    vypis.vypis = vypis.rybnik;
                    pozice++;
                }
                else if(text.text.equals(z)){
                    vypis.vypis = vypis.lesniRozcesti;
                    pozice--;
                }
                else if(text.text.equals(j)||
                    text.text.equals(s)){
                    
                    System.out.println(nelze);
                    vypis.vypis = "";
                }
                else if(text.text.equals("konec")){
                    System.exit(0);
                }
                else{
                    System.out.println(neobsahuje);
                    vypis.vypis = "";
                            
                }
            }
            //Cyklus pro pozici 5 (rybník)    
            while(pozice==5){
            System.out.print(vypis); 
            System.out.println("\nMůžeš jít na západ");
            System.out.println("\nZadej příkaz:");        
            text.text = sc.nextLine();    
                if(text.text.equals(z)){
                    vypis.vypis = vypis.les;
                    pozice--;
                }                
                else if(text.text.equals(j)||
                      text.text.equals(v)||
                    text.text.equals(s)){
                    
                    System.out.println(nelze);
                    vypis.vypis = "";
                }
                else if(text.text.equals("konec")){
                    System.exit(0);
                }
                else{
                    System.out.println(neobsahuje);
                    vypis.vypis = "";
                            
                }
            }
            //Cyklus pro pozici 6 (les)    
            while(pozice==6){
            System.out.print(vypis); 
            System.out.println("\nMůžeš jít na západ východ");
            System.out.println("\nZadej příkaz:");        
            text.text = sc.nextLine();    
                if(text.text.equals(v)){
                    vypis.vypis = vypis.lesniRozcesti;
                    pozice=3;
                }
                else if(text.text.equals(z)){
                    vypis.vypis = vypis.hrad;
                    pozice++;
                }
                else if(text.text.equals(j)||
                    text.text.equals(s)){
                    
                    System.out.println(nelze);
                    vypis.vypis = "";
                }
                else if(text.text.equals("konec")){
                    System.exit(0);
                }
                else{
                    System.out.println(neobsahuje);
                    vypis.vypis = "";
                            
                }
            }
            //Cyklus pro pozici 7 (hrad)    
            while(pozice==7){
            System.out.print(vypis); 
            System.out.println("\nMůžeš jít na východ");
            System.out.println("\nZadej příkaz:");        
            text.text = sc.nextLine();    
                if(text.text.equals(v)){
                    vypis.vypis = vypis.les;
                    pozice--;
                }
                else if(text.text.equals(j)||
                      text.text.equals(z)||
                    text.text.equals(s)){
                    
                    System.out.println(nelze);
                    vypis.vypis = "";
                }
                else if(text.text.equals("konec")){
                    System.exit(0);
                }
                else{
                    System.out.println(neobsahuje);
                    vypis.vypis = "";
                            
                }
            }            
        }
    }    
}
