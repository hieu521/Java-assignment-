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
public class StudentDao {
    public static List<Student> ls =new ArrayList<>();
    
    public  int add (Student s){
        ls.add(s);
        return 1;
    }
    public List<Student> getAllStudents(){
        return ls;
    }
    public int delStudentByID(String ma){
        for(Student s: ls ){
            if(s.getID().equalsIgnoreCase(ma))
                ls.remove(s);
            return 1;
        }
        return -1; 
    }
    public Student getStudentByID (String id ){
        for(Student s : ls){
            if(s.getID().equalsIgnoreCase(id)){
                return s;
        }
    }
        return null;
}
    public int updateStudentByID(Student sNew){
        for (Student s : ls){
            if (s.getID().equalsIgnoreCase(sNew.getID())){
                s.setAddress(sNew.getAddress());
                s.setSex(sNew.isSex());
                s.setImage(s.getImage());
                s.setBrithDate(s.getBrithDate());
                s.setName(sNew.getName());
                return 1;
            }
        }
        return -1;
    }
    

        
}


