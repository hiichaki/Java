/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr10;

/**
 *
 * @author hiichaki
 */
public class Person implements Comparable {

private String name;
private String phone;

    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    Person() {
        this(null, null);
    }
    
    String getName() {
        return name;
    }
    
    String getPhone() {
        return phone;
    }
    
@Override
    public int compareTo(Object another) {
        return name.compareTo(((Person) another).name);
    }
    
@Override
    public String toString() {
        return ("\nПрізвище: " + name + "\nТелефон:" + phone + "\n");
    }

}
