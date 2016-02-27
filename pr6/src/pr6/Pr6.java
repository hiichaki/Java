/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr6;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hiichaki
 */

public class Pr6 {
    
    public static JFrame getFrame(){
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 300);
        jf.setVisible(true);
        
        return jf;
    }
    
    public static void addComponentsToPane(Container pane){
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        addAButton("Button 1",pane);
        addAButton("Button 2",pane);
        addAButton("Button 3",pane);
        addAButton("Long - Named Button 4",pane);
        addAButton("5",pane);
    }
    
    private static void addAButton(String text,Container container){
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
    
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("BoxLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void p1(){
        JFrame jf = getFrame();
        
        JPanel p = new JPanel();
        jf.add(p);
        
        p.setLayout(new BorderLayout());
        p.add(new JButton("Okay"),BorderLayout.NORTH);
    }
    
    public static void p2(){
        JFrame jf = getFrame();
        
        JPanel p = new JPanel();
        jf.add(p);
        
        p.setLayout(new FlowLayout());

        for(int i=2;i<7;++i)
            p.add(new JButton("start "+i));
        p.add(new JButton("Okay"));
    }

    public static void p3(){
        JFrame jf = getFrame();
        
        JPanel p = new JPanel();
        jf.add(p);
        
        p.setLayout(new GridLayout(3,3));
        
        for(int i=2;i<7;++i)
            p.add(new JButton("start "+i));
        p.add(new JButton("Okay"));
    }
    
    public static void p4(){
        javax.swing.SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
    
     
    private static JFrame getJFrame(){
        JFrame frame = new JFrame("Enter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int w,h;
        w=(int) screen.getWidth();
        h=(int) screen.getHeight();
        frame.setBounds(w/3, h/3, 400, 185);
        return frame;
    }
    
    public static void pr(){
        JFrame frame = getJFrame();
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        
        JLabel l = new JLabel();
        JLabel p = new JLabel();
        
        JTextField login = new JTextField();
        JPasswordField pass = new JPasswordField();
        
        JButton ok = new JButton("Ok");
        JButton cancel = new JButton("Cancel");
        
        l.setText("Login:");
        p.setText("Password:");
        
        frame.add(l);
        frame.add(p);
        frame.add(login);
        frame.add(pass);
        frame.add(ok);
        frame.add(cancel);
        
        int x=20,y=25,h=20,w=70;

        l.setBounds(x, y, w, h);
        p.setBounds(x, y*2+10, w, h);
        login.setBounds(x*5, y, 250, h);
        pass.setBounds(x*5, y*2+10, 250, h);
        ok.setBounds(x*9, y*3+20, w-10, h+10);
        cancel.setBounds(x*13, y*3+20, 90, h+10);
        
        ok.addActionListener((ActionEvent e) -> {
            if(Arrays.equals("qwe".toCharArray(), pass.getPassword())&&"qwe".equals(login.getText())){
                showMessageDialog(null,"ok");
            } else {
                showMessageDialog(null,"fail");
            }
        });
        
       login.addKeyListener(new KeyAdapter(){
           @Override
           public void keyReleased(KeyEvent e){
               if(e.getKeyCode()==10)
                   pass.grabFocus();
           }
       });
        
        pass.addKeyListener(new KeyAdapter(){
             @Override
             public void keyReleased(KeyEvent e) {
                 if(e.getKeyCode()==10){
                    ok.grabFocus();
                    ok.doClick();
                    login.setText(null);
                    pass.setText(null);
                 }
             }
        });
        
        cancel.addActionListener((ActionEvent e)->{
            System.exit(0);
        });
    }
    
    public static void main(String[] args) {
//        p1();
//        p2();
//        p3();
//        p4();
        pr();
    }

 
    
}
