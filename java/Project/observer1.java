/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class observer1 {
     private String name;
   private String f_name;
   private String CNIC;
   private String illness;
   private String Doctor;
   
   
   private oberver2 o = new oberver2();
   
   public observer1(String name) {
        this.name = name;
    }
   public void oberver2(String n){
       o.D_name= n;
       
   }
   public void room (int r){
       o.room=r;
   }
   
public void update(){
    //JOptionPane.showMessageDialog(null, "hey " +o.D_name +" will be appointed '" +o.room + "' Please take the token and wait for your turn");
    //System.out.println("Hey " +name +"! Doctor '" +d.D_name +"' is available in room '" +d.room +"' Please take the token and wait for your turn" );
   }
}

