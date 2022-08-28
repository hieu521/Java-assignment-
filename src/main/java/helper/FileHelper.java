/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Student;


public class FileHelper {

    public static Object readFile(String path) throws Exception {
        try (
                 FileInputStream fis = new FileInputStream(path); 
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            Object obj = ois.readObject();
            return obj;
        }
    }

    public static void writeFile(String path, Object obj) throws Exception {
        try (
                 FileOutputStream fos = new FileOutputStream(path);  ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);) {
            objectOutputStream.writeObject(obj);
        }
    }

    
    

    

   
    
}


