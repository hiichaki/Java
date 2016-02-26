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
import java.awt.Font;
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
import javax.swing.border.EtchedBorder;
import java.util.ArrayList;

//TODO ArrayList
/**
 *
 * @author hiichaki
 */
public class Test extends JFrame {
    Question[] qs = new Question[4];
    static int n=0;
    int mark;
    boolean f=true;
    JPanel tmp = new JPanel();
    Container c = getContentPane();
    ArrayList list = new ArrayList();
 
    Test(){
        super("Test");
           
        for(int i=0;i<qs.length;++i)
            qs[i] = new Question();
        
        qs[0].setQuestion("WTF?", "azaza", "+trololo", "qwe", 1);
        qs[1].setQuestion("azaza?", "lol", "+qwerty", "asdfg", 1);
        qs[2].setQuestion("bugaga?", "wow", "zxcvb",  "+asdfg", 2);
        qs[3].setQuestion("???", "+dfg", "cvb", "qazwsx", 0);
        
        mark=0;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new GridLayout(2,1));
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int w,h;
        w=(int) screen.getWidth();
        h=(int) screen.getHeight();
        this.setBounds(w/3, h/3, 350, 280);
              
        tmp = next();
        c.add(tmp,BorderLayout.NORTH);
        
        JButton nextButton = new JButton("next");
        JPanel nn = new JPanel();
        nn.add(nextButton, BorderLayout.SOUTH);
        nn.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
                BorderFactory.createEmptyBorder(25, 25, 25, 25)));
        nn.setPreferredSize(new Dimension(getWidth()-25,80));
        c.add(nn);
        
        nextButton.addActionListener((ActionEvent e) -> {
            c.remove(tmp);
            tmp=next();
            c.add(tmp,BorderLayout.NORTH);
            revalidate();
            repaint();
            calc();
            System.out.println(mark);
        });

        setVisible(true);
    }
    
    private void calc(){
        System.out.println("s:"+qs[n-2].getSelected());
        System.out.println("r:"+qs[n-2].getRight());
        if(qs[n-2].isRigth()){
            list.add(5);
        } else {
            list.add(2);
        }
    }
    
    private JPanel next(){
        if(n>3){
            calc();
            for(int i=0;i<list.size();++i)
                mark+=(int) list.get(i);
            mark/=list.size();
            JPanel result = new JPanel();
            JLabel l = new JLabel("Your result - "+ Integer.toString(mark));
            
            getContentPane().removeAll();   

            l.setVerticalAlignment(JLabel.CENTER);
            l.setHorizontalAlignment(JLabel.CENTER);
            l.setPreferredSize(new Dimension(300,200));
//            l.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            l.setFont(new Font("Verdana", Font.PLAIN, 18));
            
            result.add(l);  
            revalidate();
            repaint();
            c.add(result);
            return result;
        }
        
        JPanel questionPanel = new JPanel(new GridLayout(4,1));
        questionPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
                BorderFactory.createEmptyBorder(25, 25, 25, 25)));
        questionPanel.setPreferredSize(new Dimension(getWidth()-20,150));
        JPanel pane = new JPanel(new FlowLayout());

        ActionListener ac = (ActionEvent actionEvent) -> {
            AbstractButton aButton = (AbstractButton) actionEvent.getSource();
            for(int i=0;i<3;++i)
                if(aButton.getText().equals(qs[n-1].get(i))){
                    qs[n-1].setSelected(i);
                    System.out.println("s:"+qs[n-1].getSelected());
                }
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
        if(n<4)
            n++;
        return questionPanel;
    }
}

