/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {

    public Program() {
        this.setLayout(new BorderLayout(0, 0));
        //this.setBackground(Color.LIGHT_GRAY);        
        JPanel flow1PN = new JPanel();
        //flow1PN.setBackground(Color.CYAN);
        flow1PN.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));
        JTextField textField = new JTextField("TextField");
        flow1PN.add(textField);
        JButton button = new JButton("Button");
        flow1PN.add(button);
        
        JPanel flow2PN = new JPanel();
        //flow2PN.setBackground(Color.MAGENTA);
        flow2PN.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JLabel chkbLB = new JLabel("CheckBoxGroup", JLabel.CENTER);
        flow2PN.add(chkbLB);
        
        JPanel flow3PN = new JPanel();
        //flow3PN.setBackground(Color.ORANGE);
        flow3PN.setLayout(new FlowLayout(FlowLayout.CENTER, 10, -5));
        ButtonGroup cbg = new ButtonGroup();
        JRadioButton a = new JRadioButton("a");
        cbg.add(a);
        flow3PN.add(a);
        JRadioButton b = new JRadioButton("b");
        cbg.add(b);
        flow3PN.add(b);
        JRadioButton c = new JRadioButton("c");
        cbg.add(c);
        flow3PN.add(c);
        
        JPanel flow4PN = new JPanel();
        //flow4PN.setBackground(Color.yellow);
        flow4PN.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JCheckBox prvniChB = new JCheckBox("CheckBox 1", true);
        JCheckBox druhyChB = new JCheckBox("CheckBox 2", true);
        flow4PN.add(prvniChB);
        flow4PN.add(druhyChB);
        
        JPanel flow5PN = new JPanel();
        //flow5PN.setBackground(Color.pink);
        flow5PN.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JLabel label = new JLabel("Label", JLabel.CENTER);
        flow5PN.add(label);     
        JComboBox choice = new JComboBox();
        choice.addItem("ComboBox - položka 1");
        choice.addItem("ComboBox - položka 2");
        flow5PN.add(choice);
        
        JPanel gridPN = new JPanel();
        //gridPN.setBackground(Color.green);
        gridPN.setLayout(new GridLayout(5, 1));
        gridPN.add(flow1PN);
        gridPN.add(flow2PN);
        gridPN.add(flow3PN);
        gridPN.add(flow4PN);
        gridPN.add(flow5PN);
        
        JPanel bor1PN = new JPanel();
        //bor1PN.setBackground(Color.blue);
        bor1PN.setLayout(new BorderLayout(0, 15));
        bor1PN.add(gridPN, BorderLayout.CENTER);        
        JScrollBar vert = new JScrollBar(JScrollBar.VERTICAL);
        //vert.setBackground(Color.white);
        bor1PN.add(vert, BorderLayout.EAST);
        JScrollBar horiz = new JScrollBar(JScrollBar.HORIZONTAL);
        //horiz.setBackground(Color.white);
        bor1PN.add(horiz, BorderLayout.NORTH);
        
        JPanel bor2PN = new JPanel();
        //bor2PN.setBackground(Color.red);
        bor2PN.setLayout(new BorderLayout(10, 10));
        bor2PN.add(bor1PN, BorderLayout.CENTER);        
        List list = new List();
        for(int i = 0; i < 12; i++) 
            list.add("List - položka" + i);        
        bor2PN.add(list, BorderLayout.EAST);       
        this.add(bor2PN, BorderLayout.CENTER);
        this.add(new JLabel("    ScrollBar", JLabel.CENTER), BorderLayout.NORTH);   
        this.pack();        
    }
    
    @Override
    public Insets getInsets() {
        return new Insets(25, 20, 20, 20);
    }
    
}
