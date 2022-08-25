/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author This PC
 */
public class UserDao {
    List<User> ls = new ArrayList<>();
            
     public UserDao(){
         ls.add(new User ("admin","123456",true));
         ls.add(new User ("teo","231987",true));
         ls.add(new User ("hieu","hieu123",true));
         ls.add(new User ("phong","456789",true));
         ls.add(new User ("quyen","123456",true));
         ls.add(new User ("Khanh","kingofbug",true));
                
     }
     public boolean checkLogin(String username,String pass){
         for(User u : ls){
             if (u.getUsername().equals(username) 
                     && u.getPassword().equals(pass)) {
                 return true;
                 
             }
         }
     
     return false;
    
     }
}