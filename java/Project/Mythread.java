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
public class Mythread extends Thread {
    
    private int threadnumber;
    int ID;
    String name;
 String Formula;
 int price;
 String medType;
 int m_date;
 int m_month;
 int m_year;
 int e_date;
 int e_month;
 int e_year;
    
     public Mythread(){
        
    }
    
    public Mythread(int threadnumber,int ID,String name, String Formula, int price, String medType, int m_date, int m_month, int m_year, int e_date, 
            int e_month, int e_year){
        this.threadnumber=threadnumber;
        this.ID = ID;
        this.name = name;
        this.Formula = Formula;
        this.price = price;
        this.medType = medType;
        this.m_date = m_date;
        this.m_month = m_month;
        this.m_year = m_year;
        this.e_date = e_date;
        this.e_month = e_month;
        this.e_year = e_year;
    }
        @Override
    public void run(){
       
            System.out.print(ID+name+Formula+price+medType+m_date+m_month+m_year+e_date+e_month+e_year+" from thread "+threadnumber+"\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mythread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
         
    }
}

