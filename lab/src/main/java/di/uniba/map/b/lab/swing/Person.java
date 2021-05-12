/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.lab.swing;

/**
 *
 * @author pierpaolo
 */
public class Person {
    
    private String name;
    
    private String surname;
    
    private String birthplace;

    public Person(String name, String surname, String birthplace) {
        this.name = name;
        this.surname = surname;
        this.birthplace = birthplace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
    
    public String toString() {
        return name+"\t"+surname+"\t"+birthplace;
    }
    
}
