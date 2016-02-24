/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr9;

import java.util.Random;

/**
 *
 * @author hiichaki
 */
public class Student {
    private int course;
    private String name;
    static int q=0;
    
    Student(){
        q++;
        course =  new Random().nextInt(4);
        name=q+"name";
    }
    
    public Student(int c, String n){
    this.course=c;
        this.name=n;
    }
    public int getCourse() {
        return course;
    }
    public String getName() {
        return name;
    }
}
