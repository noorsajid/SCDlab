/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author HP
 */
public class FactoryObject {
    public Hospital getObject(String BookType){
       if(BookType==null){
           return null;}
       if(BookType.equalsIgnoreCase("doc")){
           
           return new doc();}
        if(BookType.equalsIgnoreCase("Pat")){   
            return new Pat();
        }
         if(BookType.equalsIgnoreCase("lab")){   
            return new lab();
         }
         return null;
    }
}
