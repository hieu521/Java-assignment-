/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author This PC
 */
public class Grade {
    private int id;
    private Student s;
    private double Math,Physics,Chemistry;

    public Grade() {
    }
    

    public Grade(int id, Student s, double Math, double Physics, double Chemistry) {
        this.id = id;
        this.s = s;
        this.Math = Math;
        this.Physics = Physics;
        this.Chemistry = Chemistry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double Math) {
        this.Math = Math;
    }

    public double getPhysics() {
        return Physics;
    }

    public void setPhysics(double Physics) {
        this.Physics = Physics;
    }

    public double getChemistry() {
        return Chemistry;
    }

    public void setChemistry(double Chemistry) {
        this.Chemistry = Chemistry;
    }
    public double getGPA(){
        return ((getMath()+getPhysics()+getChemistry())/3);
    }
    public String getRankedacademic(){
         String xl="";
         double gpa = getGPA();
         if(gpa>8){
             xl = "Distinction";   
         }else if (gpa >=7){
             xl="Merit ";
         }else if (gpa >=5){
             xl= "Pass ";
         }else  {
             xl="Fail";
         }
         return xl;
    }
    
}
