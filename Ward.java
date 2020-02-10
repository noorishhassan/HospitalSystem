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
public class Ward {
    List<Staff> wardStaff = new ArrayList<Staff>();
    
    Ward(){
        
    }
    
    Ward(List<Staff> wardStaff){
        for (Staff s:wardStaff){
            this.wardStaff.add(s);
        }
    }
    
    void addStaff(Staff staff){
        this.wardStaff.add(staff);
    }
    
    void getWardStaff(){
        for (Staff s:this.wardStaff){
            s.getPersonDetails();
        }
    }
    
}
