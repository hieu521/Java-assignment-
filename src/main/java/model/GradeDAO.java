/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author This PC
 */
public class GradeDAO {
   List<Grade> ls = new ArrayList<>();

   
    public int add (Grade d){
        ls. add(d);
        return 1;
    }
    public List<Grade> getAllGrades(){
        return ls;
                
    }
    public  Grade getOneGradeByIDStudent(String IDStudent){
     for(Grade d: ls){
         if (d.getS().getID().equalsIgnoreCase(IDStudent)) {
            return d;
         }
     }
     return null;
        
    }
    
    public int updateByIDStudent(Grade dNew){
        for (Grade d :ls){
            if (d.getS().getID().equalsIgnoreCase(dNew.getS().getID())) {
                d.setMath(dNew.getMath());
                d.setPhysics(dNew.getPhysics());
                d.setChemistry(dNew.getChemistry());
                return 1;
            }
            
        }
        return -1;
    }
    public int delGrade (String IDstudent){
        Grade d= getOneGradeByIDStudent(IDstudent);
        if(d!=null){
           ls.remove(d);
           return 1;
            
        }
        return -1;
    }
    public Grade getAtPosition(int pos){
        return ls.get(pos);
    }
}


