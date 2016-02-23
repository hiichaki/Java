/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author hiichaki
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Fail");
        frame.setVisible(true);
        JButton button = new JButton("button");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        frame.add(button);
        button.setBounds(10, 10, 70, 30);
        button.setText("FAIL");
    }
    
}
