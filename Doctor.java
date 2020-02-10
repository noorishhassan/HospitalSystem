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
public class Doctor extends MedicalStaff{
    private int doctorId;
    private String doctorSpecialty;
    
    Doctor(){
        
    }
    
    Doctor(String name, String birthDate, String gender, String staffJoiningDate, String staffEducation, int doctorId, String doctorSpecialty){
        this.personName = name;
        this.personBirthDate = birthDate;
        this.personGender = gender;
        this.staffJoiningDate = staffJoiningDate;
        this.staffEducation = staffEducation;
        this.doctorId = doctorId;
        this.doctorSpecialty = doctorSpecialty;
    }
    
    int getDoctorId(){
        return this.doctorId;
    }
    
    String getDoctorSpecialty(){
        return this.doctorSpecialty;
    }
    
    void setDoctorId(int doctorId){
        this.doctorId = doctorId;
    }
    
    void setDoctorSpecialty(String doctorSpecialty){
        this.doctorSpecialty = doctorSpecialty;
    }
    
    void getPersonDetails() {
        System.out.println("Name: " + this.getPersonName() + " Birthdate: " + this.getPersonBirthDate() + " Gender: " + this.getPersonGender() + " Joining Date: " + this.getStaffJoiningDate() + " Education: " + this.getStaffEducation() + " Doctor ID: " + this.doctorId + " Specialty: " + this.doctorSpecialty);
    }
}
