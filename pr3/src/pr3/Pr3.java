/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3;

import java.util.Scanner;

/**
 *
 * @author hiichaki
 */
public class Pr3 {

    /**
     * @param args the command line arguments
     */
    public static void p1(int q){
        for ( int i = 0; i < q; i++ ) {
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");
            switch ( c ) {
            case 'a': case 'e': case 'i':
            case 'o': case 'u':
            System.out.println("гласная");
            break;
            case 'y': case 'w':
            System.out.println("иногда гласная");
            break;
            default:
            System.out.println("согласная");
            }
        }
    }
    
    public static double write(){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        return Double.parseDouble(x);
    }
     
    static void p2(double a, double b) {
            double c = Math.hypot(a, b);
            double angles[] = new double[3];
            angles[0] = Math.toDegrees(Math.asin(a/c));
            angles[1] = 90;
            angles[2] = 180 - angles[0] - angles[1];
            for(int i=0; i<3; i++) {
                System.out.println("Angle "+(i+1)+": "+angles[i]);
            }
    }
    
    public static void main(String[] args) {
            // TODO code application logic here
        int q=(int) write();
        p1(q); 
        p2(3,4);
    }
    
}
