/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr12;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author hiichaki
 */
public class Test extends JFrame {
    Question[] qs = new Question[5];
    
    Test(){
        super("Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(0, 1));

        ButtonGroup group = new ButtonGroup();
        JRadioButton aRadioButton = new JRadioButton("A");
        JRadioButton bRadioButton = new JRadioButton("B");

        ActionListener ac = (ActionEvent actionEvent) -> {
            AbstractButton aButton = (AbstractButton) actionEvent.getSource();
            System.out.println("Selected: " + aButton.getText());
        };
            
        aRadioButton.addActionListener(ac);
        bRadioButton.addActionListener(ac);

        panel.add(aRadioButton);
        group.add(aRadioButton);
        panel.add(bRadioButton);
        group.add(bRadioButton);

        add(panel);
        setSize(300, 200);
        setVisible(true);
    }
}
