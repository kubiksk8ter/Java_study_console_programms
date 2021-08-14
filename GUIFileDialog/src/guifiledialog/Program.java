/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guifiledialog;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;

/**
 *
 * @author kuba
 */
public class Program extends Frame {
    TextArea vystupTA;
    String oddRadek;

    public Program() {
        this.setLayout(new FlowLayout());
        vystupTA = new TextArea("Zde budou události", 4, 25,
                TextArea.SCROLLBARS_BOTH);
        this.add(vystupTA);
        oddRadek = System.getProperty("line.separator");
        MenuBar lista = new MenuBar();
        this.setMenuBar(lista);
        Menu soubMN = new Menu("Soubor", true);
        lista.add(soubMN);
        MenuItem otevriMI = new MenuItem("Otevri");
        MenuItem ulozMI = new MenuItem("Ulož");
        soubMN.add(otevriMI);
        soubMN.add(ulozMI);
        this.pack();
        
        otevriMI.addActionListener((ActionEvent e) -> {
            vystupTA.append(oddRadek + e.getActionCommand());
            jmenoSouboru(FileDialog.LOAD);
        });
        
        ulozMI.addActionListener((ActionEvent e) -> {
            vystupTA.append(oddRadek + e.getActionCommand());
            jmenoSouboru(FileDialog.SAVE);
        });
    }
    
    void jmenoSouboru(int mode){
        FileDialog fd = new FileDialog(this, "Soubor", mode);
        fd.setFile("kocka.jpg");
        fd.setDirectory("\\");
        fd.show();
        vystupTA.append(": " + fd.getFile());
        vystupTA.append(oddRadek + fd.getDirectory() + oddRadek);
    }   
}
