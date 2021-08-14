/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guimenu;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author kuba
 */
public class Window extends Frame implements ActionListener, ItemListener {
    TextArea vystupTA;
    String oddRadek;

    public Window() {
        vystupTA = new TextArea("Zde budou události", 4, 25, TextArea.SCROLLBARS_BOTH);
        this.add(vystupTA);
        oddRadek = System.getProperty("line.separator");
        //vytvoření menu
        MenuBar lista = new MenuBar();
        this.setMenuBar(lista);
        
        Menu m1 = new Menu("Menu1", true);
        lista.add(m1);
        MenuItem m11 = new MenuItem("MenuItem11");  
        MenuItem m12 = new MenuItem("MenuItem12");
        m1.add(m11);
        m1.addSeparator();
        m1.add(m12);
        m12.setEnabled(false);
        
        Menu m2 = new Menu("Menu2", true);
        lista.add(m2);
        CheckboxMenuItem m21 = new CheckboxMenuItem("CheckBoxMenuItem");
        m2.add(m21);
        Menu m22 = new Menu("Menu21", true);
        m2.add(m22);
        MenuItem m221 = new MenuItem("Menu221");
        MenuItem m222 = new MenuItem("Menu222");
        m22.add(m221);
        m22.add(m222);
        
        this.setSize(220, 150);
        m11.addActionListener(this);
        m221.addActionListener(this);
        m222.addActionListener(this);
        m21.addItemListener((ItemEvent e) -> {
            if(e.getStateChange() == 1) {
                m12.setEnabled(true);
            }
            else{
                m12.setEnabled(false);
            }
        });        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        vystupTA.append(oddRadek + e.getActionCommand());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        vystupTA.append(oddRadek + e.getItem().toString());
    }
    
}
