/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import static java.awt.PageAttributes.MediaType.A;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author hiichaki
 */
public class TArea extends JFrame{
      JTextArea txt;
  TArea() {
     super("Візуальне застосування");
     try  {
       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
     }
     catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
         
     }
     
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int w,h;
    w=(int) screen.getWidth();
    h=(int) screen.getHeight();
    this.setBounds(w/3, h/3, 415, 355);
    
    Container a = getContentPane();
    
    JPanel m = new JPanel();
    
    a.add(m);
    
    JPanel pane = new JPanel();
    m.add(pane, BorderLayout.CENTER);
    pane.add(new JLabel("Function: Y=A*sqrt(X)*Sin(A*X)"));
   
    JPanel b = new JPanel(new GridLayout(2,1));
    
    b.setPreferredSize(new Dimension(385,100));
//    b.setMinimumSize(new Dimension(400,100));
//    b.setMaximumSize(new Dimension(400,100));
    
    b.setBorder(BorderFactory.createTitledBorder("Initial data"));
     
    pane = new JPanel();
    b.add(pane,BorderLayout.NORTH);
    
    pane.add(new JLabel("Param A:"));
    JTextField param = new JTextField(15);
    pane.add(param);
    
    pane = new JPanel();
    b.add(pane,BorderLayout.SOUTH);

    pane.add(new JLabel("Step (h):"));
    JTextField step = new JTextField(8);
    pane.add(step);
    pane.add(new JLabel("Points:"));
    JTextField points = new JTextField(8);
    pane.add(points);
    
    m.add(b);
    
    pane = new JPanel();
    m.add(pane,BorderLayout.NORTH);
    txt = new JTextArea(9, 28);
//    txt.setPreferredSize(new Dimension(385,100));
    txt.setFont(new Font("Verdana", Font.PLAIN, 14));
    
    pane.add(txt);
    JScrollPane scroll = new JScrollPane(txt,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
   
    pane.add (scroll);
    
    WindowListener wndCloser = new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    };
    addWindowListener(wndCloser);
    setVisible(true);
    
    points.addActionListener((ActionEvent e)->{
        double _A,_step,_points;
        _A=Double.parseDouble(param.getText());
        _step=Double.parseDouble(step.getText());
        _points=Double.parseDouble(points.getText());
        for(double i=_step;i<_step*_points;i+=_step){
            txt.append(i+"\t"+_A*Math.sqrt(i)*Math.sin(_A*i)+"\n");
        }
    });
  }

}
