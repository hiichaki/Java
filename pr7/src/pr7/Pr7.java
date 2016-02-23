/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author hiichaki qwe
 */
public class Pr7 extends JFrame {
    JTextField fld = new JTextField();
    JButton btn = new JButton("Press");
    JLabel lbl = new JLabel(" ");
    
    Pr7(){
        super("listeners");
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }  
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
        }
        setSize(400,150);
        Container c = getContentPane();
        c.add(lbl,BorderLayout.NORTH);
        c.add(fld,BorderLayout.CENTER);
        c.add(btn,BorderLayout.SOUTH);
        
        fld.addActionListener((ActionEvent e) -> {
            lbl.setText("entered text:" + fld.getText());
        });
        
        btn.addActionListener((ActionEvent e) -> {
            lbl.setText("button pressed");
        });
        
        WindowListener wndCloser;
        wndCloser = new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }    
        };
        
        addWindowListener(wndCloser);
        setVisible(true);
       
    }
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Pr7();
        System.out.println("TestGIT");
    }
    
}
