/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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
    setSize(410, 200);
    Container c = getContentPane();
    JPanel pane = new JPanel();
   	c.add(pane, BorderLayout.CENTER);
    pane.add(new JLabel("Hello, привіт"));
    pane.add(txt = new JTextArea(15, 75));
    JScrollPane scroll = new JScrollPane(txt);
    pane.add (scroll);
    WindowListener wndCloser = new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    };
    addWindowListener(wndCloser);
    setVisible(true);
  }
  public void test() {
    txt.append("Перший рядок\n");
    txt.append("Другий рядок\n");
  }

}
