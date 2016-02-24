/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr9;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author hiichaki
 */
public class Pr9 {

    public static void printStudents(List list, int c){
        System.out.println("Current("+c+") course following next students:");
        for ( Iterator iter = list.iterator(); iter.hasNext();){
            Student loadedStudent = (Student) iter.next();
            if(loadedStudent.getCourse()==c)
                System.out.println( loadedStudent.getName() );
        }
    }

    public static void main(String[] args) {
        int course=1;
        List<Student> list = new ArrayList<>();
        for(int i=0;i<10;++i)
            list.add(new Student());
      
        printStudents(list, course);

    }
    
}
