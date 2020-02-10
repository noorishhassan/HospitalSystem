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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FaisalHospital faisalHospital = new FaisalHospital();
        
        Patient patient1 = new Patient("Amina", 1, "10/04/1999", "Female");
        faisalHospital.patientVisit(patient1);
        faisalHospital.patientVisit(patient1);
        
        Patient patient2 = new Patient("Ramsha", 2, "10/06/1999", "Female");
        Patient patient3 = new Patient("Ali", 3, "03/11/1997", "Male");
        Patient patient4 = new Patient("Mustafa", 1, "02/08/1992", "Male");
        Patient patient5 = new Patient("Safa", 1, "25/07/1987", "Female");
        
        faisalHospital.patientVisit(patient2);
        faisalHospital.patientVisit(patient3);
        faisalHospital.patientVisit(patient4);
        faisalHospital.patientVisit(patient5);
        faisalHospital.patientVisit(patient1);
        faisalHospital.patientVisit(patient3);
        
        Doctor doctor1 = new Doctor("Aleena", "10/05/1991", "Female", "03/04/2014", "MBBS", 1, "Heart Surgeon");
        Doctor doctor2 = new Doctor("Anam", "16/09/1986", "Female", "31/12/2009", "MBBS", 2, "Orthopediatric");
        Doctor doctor3 = new Doctor("Asif", "22/11/1974", "Male", "29/07/2001", "MBBS", 3, "Medicine");
        
        Nurse nurse1 = new Nurse("Fatima", "04/08/1976", "Female", "31/03/1999", "BA");

        Technician technician = new Technician("Mehmood", "18/11/1968", "Male", "31/03/1999", "BA");

        faisalHospital.staffVisit(doctor1);
        faisalHospital.staffVisit(doctor2);
        faisalHospital.staffVisit(doctor3);
        faisalHospital.staffVisit(nurse1);
        faisalHospital.staffVisit(technician);
        
        faisalHospital.showAllVisits();
        
    }
    
}
