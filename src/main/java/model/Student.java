/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author This PC
 */
public class Student implements Serializable{
    
    private String ID;
    private String Name;
    private String BrithDate;
    private String Sex;
    private String Address;
    private String Image; 
    
    public Student() {
        
    }

    public Student(String ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }
    

    public Student(String ID, String Name, String BrithDate, String Sex, String Address, String Image) {
        this.ID = ID;
        this.Name = Name;
        this.BrithDate = BrithDate;
        this.Sex = Sex;
        this.Address = Address;
        this.Image = Image;
    }

    Student(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

   

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBrithDate() {
        return BrithDate;
    }

    public void setBrithDate(String BrithDate) {
        this.BrithDate = BrithDate;
    }

    public String isSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }
    
    
}
