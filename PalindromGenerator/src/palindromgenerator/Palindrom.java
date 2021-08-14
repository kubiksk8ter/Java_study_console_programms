/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromgenerator;

/**
 *
 * @author kuba
 */
public class Palindrom {
    private String slovo = "";
    
    public Palindrom(String slovo){
        this.slovo = slovo;
    }
    
    public String PalindromGenerator(){
        String b = slovo.trim();
        for(int i = slovo.length()-2; i>=0; i--){
            b += slovo.charAt(i);
        }
        return b;
    }
}
