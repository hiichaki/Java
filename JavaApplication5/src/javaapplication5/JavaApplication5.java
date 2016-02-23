/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author hiichaki
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world!");
//        Scanner scanner = new Scanner(System.in);
//        String x = scanner.nextLine();
//        System.out.println(x);
        JFrame frame = new JFrame();
//        int x = 1;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int w,h;
        w=(int) screen.getWidth();
        h=(int) screen.getHeight();
        frame.setBounds(w/4, h/4, 500, 500);
        frame.setVisible(true);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        JButton b = new JButton("fail");
        frame.add(b);
        b.setVisible(true);
        b.setBounds(30, 30, 100, 30);
        b.addActionListener((ActionEvent e) -> {
            JTextArea text = new JTextArea();
            frame.add(text);
            text.setVisible(true);
            text.setBounds(100,100,100,30);
//              System.out.println(x);
        });
            
        Canvas a= new Canvas(){
            @Override
            public void paint(Graphics g) {
//               g.drawLine(0, 0, 10, 10);
//               g.drawLine(10, 10, 30, 40);
//               g.drawLine(30, 40, 10, 40);
//               g.drawLine(1, 40, 0, 0);
               g.draw3DRect(10, 10,50, 50, true);
               
            }
        };
        
        frame.add(a);
        
        a.setBounds(100, 300, 100, 100);
//        b.setText(x);
    }
    
}
