/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2;

import java.util.Scanner;

/**
 *
 * @author hiichaki
 */
public class Pr2 {

    /**
     * @param args the command line arguments
     */
    
    public static double write(){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        return Double.parseDouble(x);
    }
    
    public static void main(String[] args) {
        double q = write();
//        double q=30;
        double w = Math.toRadians(q);
        System.out.println("sin:"+Math.sin(w));
        System.out.println("cos:"+Math.cos(w));
    }
    
}
