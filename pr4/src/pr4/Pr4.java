/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4;



/**
 *
 * @author hiichaki
 */
public class Pr4 {
    /**
     * @param args the command line arguments
     */
    public static void copyPast(){
        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};
        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);
        DoubleVector v3 = new DoubleVector(c);
        System.out.println("v 1*v2=" + v1.mult(v2));
        System.out.println("v 1*v2=" + DoubleVector.mult(v1, v2));
        System.out.println("v 1*v3=" + v1.mult(v3));
    }
    public static void pr(){
       double[] a = {1, 2, 3, 4};
       double[] b = {1, 1, 1, 1}; 
       DoubleVector v1 = new DoubleVector(a);
       DoubleVector v2 = new DoubleVector(b);
       System.out.println("mult:"+DoubleVector.mult(v1,v2));
       System.out.println("plus:"+v1.minus(v2, DoubleVector::plus));
       System.out.println("minus:"+v1.minus(v2, DoubleVector::minus));
    }
    
    public static void main(String[] args) {
//        copyPast();
        pr();
    }
    
}
