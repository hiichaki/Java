/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr8;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
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
public class Pr8 extends JFrame {
    JTextField fld = new JTextField(20);
    JTextField fld1 = new JTextField(20);
    JButton btn = new JButton("Copy");
    JButton btnP = new JButton("Print");
    JLabel lbl = new JLabel("Input   ");
    JLabel lbl1 = new JLabel("Output");
   static ArrayList list = new ArrayList();
   
    
    Pr8(){
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
        pane2.add(btnP);
        pane1.add(lbl1);
        pane1.add(fld1);
        Container c = getContentPane();
        c.add(pane1, BorderLayout.CENTER);
        c.add(pane2, BorderLayout.SOUTH);
 
        
        fld.addActionListener((ActionEvent e) -> {
   
        });
        
        btn.addActionListener((ActionEvent e) -> {
            String s=fld.getText();
            fld1.setText(fld.getText());
            list.add(s);
        });
        
        btnP.addActionListener((ActionEvent e) -> {
            for(int i=0;i<list.size();++i)
                System.out.println(list.get(i));
        });
          
        
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
      new Pr8();
    }
}
