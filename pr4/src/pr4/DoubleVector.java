/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4;

import pr4.PlusMinus;

/**
 *
 * @author hiichaki
 */
public class DoubleVector {

    private double[] vector = null;

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public DoubleVector(double[] vector) {
        this.vector = vector;
    }

    // Скалярний добуток векторів

    public double mult(DoubleVector anotherVector) {
        double s = 0;
        for (int i = 0; i < vector.length; i++) {
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }

    public static double mult(DoubleVector a, DoubleVector b) {
        return a.mult(b);
    }

//        public DoubleVector minus(DoubleVector a){
//            double[] c= new double[vector.length];
//            for(int i=0;i<vector.length;++i){
//                c[i]=vector[i]-a.vector[i];
//            }
//            return new DoubleVector(c);
//        }
    public DoubleVector minus(DoubleVector a, PlusMinus obj) {
        double[] c = new double[vector.length];
        for (int i = 0; i < vector.length; ++i) {
            c[i] = obj.Do(vector[i], a.vector[i]);
        }
        return new DoubleVector(c);
    }

    @Override
    public String toString() {
        String s = ""; 
        for (int i = 0; i < vector.length; ++i) {
            s += vector[i] + " ";
        }
        return s;
    }
}
