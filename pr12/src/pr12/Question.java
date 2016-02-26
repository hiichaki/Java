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
    private int right;
    private int selected;
    
    public void setQuestion (String _q, String _a, String _b, String _c,int r){
        q=_q;
        a=_a; 
        b=_b; 
        c=_c; 
        right=r;
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
    
    public boolean isRigth(){
        return selected==getRight();
    }
 
    /**
     * @return the q
     */
    public String getQ() {
        return q;
    }

    /**
     * @return the selected
     */
    public int getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(int selected) {
        this.selected = selected;
    }

    /**
     * @return the right
     */
    public int getRight() {
        return right;
    }

    
}
