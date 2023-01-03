/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Mythread2 extends Thread{
       private int threadnumber;
         int ID;
        String Name;
        String F_Name;
        String CNIC;
        String illness;
        String doctor;
        int day;
        int mon ;
        int y;
        String Time;
     public Mythread2(){
        
    }

    public Mythread2(int threadnumber, int ID, String Name, String F_Name, String CNIC, String illness,String doctor, int day, 
            int mon, int y, String Time) {
        this.threadnumber = threadnumber;
        this.ID = ID;
        this.Name = Name;
        this.F_Name = F_Name;
        this.CNIC = CNIC;
        this.illness = illness;
        this.doctor=doctor;
        this.day = day;
        this.mon = mon;
        this.y = y;
        this.Time = Time;
    }

   
    
    
        @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.print(i+"from thread"+threadnumber+"\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mythread.class.getName()).log(Level.SEVERE, null, ex);
            }     
    }
}
}
