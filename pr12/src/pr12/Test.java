/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr12;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author hiichaki
 */
public class Test extends JFrame {
    Question[] qs = new Question[4];
    static int n=0;
    boolean f=true;
    JPanel tmp = new JPanel();
    Test(){
        super("Test");
        
        for(int i=0;i<qs.length;++i)
            qs[i] = new Question();
        
        qs[0].setQuestion("WTF?", false, "azaza", false, "trololo", true, "qwe");
        qs[1].setQuestion("azaza?", false, "lol", true, "qwerty", false, "asdfg");
        qs[2].setQuestion("bugaga?", true, "wow", false, "zxcvb", false, "asdfg");
        qs[3].setQuestion("???", false, "dfg", false, "cvb", true, "qazwsx");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int w,h;
        w=(int) screen.getWidth();
        h=(int) screen.getHeight();
        this.setBounds(w/3, h/3, 350, 250);

        Container c = getContentPane();
        tmp = next();
        c.add(tmp,BorderLayout.NORTH);
        
        JButton n = new JButton("next");
        JPanel nn = new JPanel();
        nn.add(n, BorderLayout.SOUTH);
        nn.setBorder(BorderFactory.createEtchedBorder());
        c.add(nn);
        
        n.addActionListener((ActionEvent e) -> {
            c.remove(tmp);
            tmp=next();
            c.add(tmp,BorderLayout.NORTH);
            revalidate();
            repaint();
        });
        
        
        setVisible(true);
    }
    
    JPanel next(){
        if(n>3)
            return new JPanel();
        
        JPanel questionPanel = new JPanel(new GridLayout(4,1));
        questionPanel.setBorder(BorderFactory.createEtchedBorder());
        JPanel pane = new JPanel(new FlowLayout());

        ActionListener ac = (ActionEvent actionEvent) -> {
            AbstractButton aButton = (AbstractButton) actionEvent.getSource();
            System.out.println("Selected: " + aButton.getText());
        };

        ButtonGroup group = new ButtonGroup();
        JRadioButton[] RB = new JRadioButton[3];     

        for(int j=0;j<3;++j){
            RB[j] =new JRadioButton(qs[n].get(j));
            group.add(RB[j]);
        }

        pane.add(new JLabel(qs[n].getQ()));
        questionPanel.add(pane);

        for(int j=0;j<3;++j){
            pane = new JPanel();
            pane.add(RB[j]);
            questionPanel.add(pane);
            RB[j].addActionListener(ac);
        }
        n++;
        return questionPanel;
    }
}
