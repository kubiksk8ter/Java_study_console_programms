/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filevypismaska;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author kuba
 */
public class MaskFilter implements FilenameFilter {
    String mask;

    public MaskFilter(String mask) {
        this.mask = mask;
    }

    @Override
    public boolean accept(File dir, String name) {
        File f = new File(dir, name);
        if(name.lastIndexOf(mask) > 0) {
            return true;
        }
        else{
            return false;
        }
    }
    
}
