/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prr7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author hiichaki
 */
public class Prr7 extends JFrame {
    JTextField fld = new JTextField(20);
    JTextField fld1 = new JTextField(20);
    JButton btn = new JButton("Copy");
    JLabel lbl = new JLabel("Input   ");
    JLabel lbl1 = new JLabel("Output");
    
    Prr7(){
        super("listeners");
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }  
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
        }
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int w,h;
        w=(int) screen.getWidth();
        h=(int) screen.getHeight();
        setBounds(w/3, h/3, 320, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane1 = new JPanel();
        JPanel pane2 = new JPanel();

        pane1.add(lbl);
        pane1.add(fld);
        pane2.add(btn);
        pane1.add(lbl1);
        pane1.add(fld1);
        Container c = getContentPane();
        c.add(pane1, BorderLayout.CENTER);
        c.add(pane2, BorderLayout.SOUTH);
 
        
        fld.addActionListener((ActionEvent e) -> {
            lbl.setText("text:"+ fld.getText());
        });
        
        btn.addActionListener((ActionEvent e) -> {
            fld1.setText(fld.getText());
        });
        
        fld.addKeyListener(new KeyAdapter(){
            
        });
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
      new Prr7();
    }
}
