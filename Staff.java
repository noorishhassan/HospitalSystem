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
public class Staff extends Person{
    protected String staffJoiningDate;
    protected String staffEducation;
    
    Staff(){
        
    }
    
    Staff(String name, String birthDate, String gender, String staffJoiningDate, String staffEducation){
        this.personName = name;
        this.personBirthDate = birthDate;
        this.personGender = gender;
        this.staffJoiningDate = staffJoiningDate;
        this.staffEducation = staffEducation;
    }
    
    String getStaffJoiningDate(){
        return this.staffJoiningDate;
    }
    
    String getStaffEducation(){
        return this.staffEducation;
    }
    
    void setStaffJoiningDate(String staffJoiningDate){
        this.staffJoiningDate = staffJoiningDate;
    }
    
    void setStaffEducation(String staffEducation){
        this.staffEducation = staffEducation;
    }

    void getPersonDetails() {
        System.out.println("Name: " + this.getPersonName() + " Birthdate: " + this.getPersonBirthDate() + " Gender: " + this.getPersonGender() + " Joining Date: " + this.getStaffJoiningDate() + " Education: " + this.getStaffEducation());
    }
}
