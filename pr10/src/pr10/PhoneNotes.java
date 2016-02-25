/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author hiichaki
 */
@SuppressWarnings({
 "unchecked"
})
public class PhoneNotes extends JFrame {
    JTextField fldFio = new JTextField(25);
    JTextField fldPhone = new JTextField(25);
    JTextField fldCnt = new JTextField(4);
    TreeSet set = new TreeSet();

    public PhoneNotes() {
     super("Записна книжка");

     try  {
       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
     }
     catch(Exception e) {
     }

    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int w,h;
    w=(int) screen.getWidth();
    h=(int) screen.getHeight();
    this.setBounds(w/3, h/3, 400, 250);
    
    Container c = getContentPane();
// Центральна панель
    JPanel centerPanel = new JPanel(new GridLayout(3, 1, 5, 5));
    centerPanel.setBorder(BorderFactory.createEtchedBorder());
    JPanel aPanel = new JPanel();
    JLabel aLabel = new JLabel("Прізвище ");
    aPanel.add(aLabel);
    aPanel.add(fldFio);
    
    centerPanel.add(aPanel);
    
    aPanel = new JPanel();
    aLabel = new JLabel("Телефон ");
    aPanel.add(aLabel);
    aPanel.add(fldPhone);
    
    centerPanel.add(aPanel);
    aPanel = new JPanel();
    JButton btn = new JButton("Надрукувати ");
    aPanel.add(btn);
    centerPanel.add(aPanel);
    c.add(centerPanel, BorderLayout.CENTER);
// Нижня панель
    JPanel statusPanel = new JPanel();
    statusPanel.setBorder(BorderFactory.createEtchedBorder());
    aLabel = new JLabel("Кількість записів");
    statusPanel.add(aLabel);
    fldCnt.setEnabled(false);
    statusPanel.add(fldCnt);
    c.add(statusPanel, BorderLayout.SOUTH);
// Слухачі полів та кнопок
    fldPhone.addActionListener((ActionEvent e) -> {
        Person prs = new Person(fldFio.getText(), fldPhone.getText());
        fldFio.setText("");
        fldPhone.setText("");
        set.add(prs);
        fldCnt.setText(""+set.size());
        fldFio.requestFocus();
     });
    btn.addActionListener((ActionEvent e) -> {
        Iterator iter = set.iterator();
        for ( int i = 0; iter.hasNext(); i++ ) {
            Person cur = (Person)iter.next();
            String str = cur.toString();
            try {
                byte[] b = str.getBytes("Cp866");
                System.out.write(b);
            } catch ( Exception ex ) {
                ex.printStackTrace();
            }
        }
     });
   setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
  }  }  
