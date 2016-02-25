/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr5;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import algebra.TestVector;
/**
 *
 * @author hiichaki
 */
public class Pr5 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
       TestVector.show();
       double[] a = {1, 2, 3, 4};
       double[] b = {1, 1, 1, 1}; 
       double[] cc = {2, 2, 2, 2};
       DoubleVector v1 = new DoubleVector(a);
       DoubleVector v2 = new DoubleVector(b);
       DoubleVector v3 = new DoubleVector(cc);
        // фрагмент as is (1)
        try  {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
        }
        JFrame frm = new JFrame("Перше візуальне застосування");
        frm.setSize(300, 200);
        Container c = frm.getContentPane();
        c.setLayout(null);
        JLabel[] lab = new JLabel[3]; 
        
        for(int i=0;i<3;++i)
            lab[i]= new JLabel();
    
        lab[0].setText("v 1*v2=" + v1.mult(v2));
        c.add(lab[0]);
        lab[1].setText(("v 1*v2=" + DoubleVector.mult(v1, v2)));
        c.add(lab[1]);
        lab[2].setText("v 1*v3=" + v1.mult(v3));
        c.add(lab[2]);
        
        for(int i=0;i<3;++i){
            lab[i].setBounds(50, (i+1)*30, 100, 10);
        }
        
        
//        c.add(new JLabel("v 1*v2=" + v1.mult(v2)));
//        c.add(new JLabel("v 1*v2=" + DoubleVector.mult(v1, v2)));
//        c.add(new JLabel("v 1*v3=" + v1.mult(v3)));
// фрагмент as is (2)
        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        frm.addWindowListener(wndCloser);
        frm.setVisible(true);
    }
}
