/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guimenushortcut;

import com.sun.glass.events.KeyEvent;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements ActionListener {

    public Window() {
        MenuBar lista = new MenuBar();
        this.setMenuBar(lista);
        
        Menu file = new Menu("file", true);
        lista.add(file);
        
        MenuItem exit = new MenuItem("Exit", new MenuShortcut(KeyEvent.VK_E));
        file.add(exit);
        
        MenuItem quit = new MenuItem("Quit", new MenuShortcut(KeyEvent.VK_Q, true));
        file.add(quit);
        
        this.setSize(220, 100);
        
        exit.addActionListener(this);
        quit.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(1);
    }
    
}
