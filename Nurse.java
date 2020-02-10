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
public class Nurse extends MedicalStaff{
    
    Nurse(){
        
    }
    
    Nurse(String name, String birthDate, String gender, String staffJoiningDate, String staffEducation){
        this.personName = name;
        this.personBirthDate = birthDate;
        this.personGender = gender;
        this.staffJoiningDate = staffJoiningDate;
        this.staffEducation = staffEducation;
    }
}
