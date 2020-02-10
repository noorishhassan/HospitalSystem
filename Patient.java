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
public class Patient extends Person{
    private int patientId;
    private boolean firstVisit;
    private boolean visitedToday;

    Patient (){
        this.firstVisit = false;
        this.visitedToday = false;
    }

    Patient(String name, int id, String birthdate, String gender) {
        this.personName = name;
        this.patientId = id;
        this.personBirthDate = birthdate;
        this.personGender = gender;
        this.firstVisit = true;
        this.visitedToday = false;
    }
    
    boolean getFirstVisit() {
        return this.firstVisit;
    }

    void setFirstVisit() {
        this.firstVisit = false;
    }

    void setVisitedToday() {
        this.visitedToday = true; 
    }

    boolean getVisitedToday() {
        return this.visitedToday;
    }

    int getPatientId() {
        return this.patientId;
    }

    void getPersonDetails(){
        System.out.println("Name: " + this.getPersonName() + " Birthdate: " + this.getPersonBirthDate() + " Gender: " + this.getPersonGender() + " Patient Id: " + this.patientId);
    }
}
