/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr12;

/**
 *
 * @author hiichaki
 */
public class Question {
    private String q;
    private String a;
    private String b;
    private String c;
    boolean A, B, C;
    
    public void setQuestion (String _q, boolean aa, String _a, boolean bb, String _b, boolean cc, String _c){
        q=_q;
        a=_a; A=aa;
        b=_b; B=bb;
        c=_c; C=cc;
    }

    
    public String get(int n){
        String tmp = new String();
        switch(n){
            case 0: tmp= a; break;
            case 1: tmp = b; break;
            case 2: tmp = c; break;
        }
        return tmp;
    }
    
    public int rigth(int n){
        return 0;
        
    
    }
    
    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @return the b
     */
    public String getB() {
        return b;
    }

    /**
     * @return the c
     */
    public String getC() {
        return c;
    }

    /**
     * @return the q
     */
    public String getQ() {
        return q;
    }

    
}
