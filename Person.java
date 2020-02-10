/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

/**
 *
 * @author noorishhassan
 */
public class Person {
    protected String personName;
    protected String personBirthDate;
    protected String personGender;
    
    
    String getPersonName(){
        return this.personName;
    }
    
    String getPersonBirthDate(){
        return this.personBirthDate;
    }
    
    String getPersonGender(){
        return this.personGender;
    }

    void getPersonDetails() {
        System.out.println("Name: " + this.getPersonName() + " Birthdate: " + this.getPersonBirthDate() + " Gender: " + this.getPersonGender());
    }
}
