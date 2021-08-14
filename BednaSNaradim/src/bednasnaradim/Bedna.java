/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bednasnaradim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kuba
 */
public class Bedna {
    private int nosnost;
    private int vahaNaradi = 0;
        
    private static final ArrayList<Nastroj> bedna = new ArrayList<>();
    
    public Bedna(int nosnost){
        this.nosnost = nosnost;
    }
    public void Vloz(Nastroj nastroj){
        bedna.add(nastroj);
        vahaNaradi += nastroj.getVaha();
        
        if(vahaNaradi > nosnost){
            bedna.remove(nastroj);
            vahaNaradi -= nastroj.getVaha();
        }
    }
    
    public void Odeber (Nastroj nastroj){
        bedna.remove(nastroj);
        vahaNaradi -= nastroj.getVaha();
    }
    
    public List<Nastroj> getNastroje(){
        return Collections.unmodifiableList(bedna);
    }
    
    public String getVahaKladiv(){
        
        int vaha = 0;
        for(Nastroj n : bedna){
            if((n.getClass().equals(Kladivo.class))&&(((Kladivo)n).isObourucni())){
                vaha += n.getVaha();
        }
        }
        return String.format("Váha obouručních kladiv je %s gramů", vaha);
    }
    
    public void PracujVse(){
        for(Nastroj n : bedna){
            System.out.println(n.pracuj());
        }
    }
    
    @Override
    public String toString(){
        if(!bedna.isEmpty()){
            return String.format("V bedně je: %s", this.getNastroje().toString().replace("[","").replace("]", ""));
        }
        else{
            return String.format("Bedna je prázdná.");
        }
           
    }
    
    
    
    
}
