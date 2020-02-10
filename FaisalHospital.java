/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noorishhassan
 */
public class FaisalHospital {
    
    List<Ward> faisalHospitalWards = new ArrayList<Ward>();
    List<Patient> faisalHospitalPatients = new ArrayList<Patient>();
    List<Person> faisalHospitalVisits = new ArrayList<Person>();
    
    FaisalHospital(){
        this.faisalHospitalWards.add(new ChildrensWard());
        this.faisalHospitalWards.add(new OrthopedicWard());
        this.faisalHospitalWards.add(new SurgicalWard());
    }
    
    void patientVisit(Patient patient){
        if (patient.getFirstVisit() == true)
        {
            this.faisalHospitalVisits.add(patient);
            patient.setFirstVisit();
            patient.setVisitedToday();
            System.out.println(patient.getPersonName() + " with Patient Id: " + patient.getPatientId() + " allowed.");

        }
        else if (patient.getVisitedToday() == true)
        {
            System.out.println(patient.getPersonName() + " with Patient Id: " + patient.getPatientId() + " has already visited today.");
        }
        else
        {
            this.faisalHospitalVisits.add(patient);
            patient.setVisitedToday();
            System.out.println(patient.getPersonName() + " with Patient Id: " + patient.getPatientId() + " allowed.");
        }
        
    }
    
    void staffVisit(Staff staff){
        this.faisalHospitalVisits.add(staff);
    }

    void personVisit(Person person){
        this.faisalHospitalVisits.add(person);
    }
    
    void showAllVisits() {
        for (Person p:this.faisalHospitalVisits)
        {
            p.getPersonDetails();
        }
    }
    
}
