/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class oberver2 {
     public String D_name;
    private String App_time;
    private String App_fee;
    private int payment;
    
    
    public int room;
    
    private List <Patient> pat = new ArrayList();
    
    public void addpatients(Patient p){
        pat.add(p);
    }
    public void notifyPatient(){
    for (Patient p : pat){
        p.update();
    }
    }
}
