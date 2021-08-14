/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevodmalavelka;

/**
 *
 * @author kuba
 */
public class Prevodnik {
    /**
     * Převede malá písmena na velká, nebo naopak, v závislosti na posledním znaku.
     * <p>
     * <i>l(L)převede malá písmena na velká</i>
     * <p>
     * <i>u(U)převede velká písmena na malá</i>
     * <p>
     * <i>x(X)přehodí malá a velká písmena</i>
     * @param retezec
     * @return String
     */    
    public String preved(String retezec){
        if((retezec.charAt(retezec.length()-1) == 'u')||(retezec.charAt(retezec.length()-1) == 'U')){
            return velkaNaMala(retezec); 
        }
        else if((retezec.charAt(retezec.length()-1) == 'l')||(retezec.charAt(retezec.length()-1) == 'L')){
            return malaNaVelka(retezec); 
        }
        else if((retezec.charAt(retezec.length()-1) == 'x')||(retezec.charAt(retezec.length()-1) == 'X')){
            return prehodMalaVelka(retezec);
        }
        else{
            return retezec;
        }
    }
    /**
     * Přehodí malá písmena na velká
     * @param retezec
     * @return 
     */
    static String malaNaVelka(String retezec){
        String novy = "";
        char b;
        for(int i = 0; i<retezec.length()-1;i++){
            b = Character.toUpperCase(retezec.charAt(i));
            novy += b;
        }
        return novy;
    }
    /**
     * Přehodí velká písmena na malá
     * @param retezec
     * @return 
     */
    static String velkaNaMala(String retezec){
        String novy = "";
        char b;
        for(int i = 0; i<retezec.length()-1;i++){
            b = Character.toLowerCase(retezec.charAt(i));
            novy += b;
        }
        return novy;
    }
    /**
     * Přehodí velká písmena na malá a naopak
     * @param retezec
     * @return 
     */
    static String prehodMalaVelka(String retezec){
        String novy = "";
        char b;
        for(int i = 0; i<retezec.length()-1;i++){
            if(Character.isLowerCase(retezec.charAt(i))){
                b = Character.toUpperCase(retezec.charAt(i));
            }
            else{
                b = Character.toLowerCase(retezec.charAt(i));
            }
            novy += b;
        }
        return novy;
    }
}
