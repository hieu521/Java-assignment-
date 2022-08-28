/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

//import helper.FileHelper;
import helper.FileHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author This PC
 */
public class StudentDao {

    public static ArrayList<Student> ls = new ArrayList<>();
    String path = "E:\\Database.txt";
//     public void readDataFromFile() throws IOException {
//        List<String> list = Files.readAllLines(new File(path).toPath(),Charset.defaultCharset());
//        for (String line : list) {
//            String[] res = line.split(",");
//            Student user = new Student(res[0], res[1], res[2], res[3], res[4], res[5]);
//           ls.add(user);
//        }
//    }

    public int add(Student s) {
        ls.add(s);
        return 1;
    }

    public List<Student> getAllStudents() {
        return ls;
    }

    public boolean delStudentByID(String ma) {
        for (Student s :ls) {
                if (s.getID().equals(ma)) {
                    ls.remove(s);
                    return true;
                }
            }
        return false;
        
        
    }

    public Student getStudentByID(String id) {
        for (Student s : ls) {
            if (s.getID().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    public int updateStudentByID(Student sNew) {
        for (Student s : ls) {
            if (s.getID().equalsIgnoreCase(sNew.getID())) {
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


        public boolean CheckNameValid(String name){
        String regexPattern = "[^0-9]+";
        boolean validName = Pattern.compile(regexPattern)
                .matcher(name)
                .matches();
        if(validName){
            return true;
        }
        return false;
    }
//    public void updateDataTable(DefaultTableModel tblM) {
//        for (Student s : ls) {
//            Object rowData[] = new Object[6];
//
//            rowData[0] = s.getID();
//            rowData[1] = s.getName();
//            rowData[2] = s.isSex() ;
//            rowData[3] = s.getBrithDate();
//            rowData[4] = s.getAddress();
//            rowData[5] = s.getImage();
//            tblM.addRow(rowData);
//        }
//        tblM.fireTableDataChanged();
//    }

      public boolean CheckBirthday(String birthday){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        LocalDate date = null;
        try {
            date = LocalDate.parse(birthday, dtf);
            return true;
        }catch (DateTimeParseException e){

        }
        return false;
    }
      
      public void renderToTable(DefaultTableModel tbStudent){
          tbStudent.setRowCount(0);
          
          for(Student s :ls){
              Object[] row = new Object[]{
                  s.getID(), 
                  s.getName(), 
                  s.isSex(),
                  s.getBrithDate(),
                  s.getAddress(),
                  s.getImage()
              };
              tbStudent.addRow(row);
          }
          tbStudent.fireTableDataChanged();
      }
//       private void readFile() {
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        try {
//            fis = new FileInputStream("E:\\dataexample.txt");
//            ois = new ObjectInputStream(fis);
//            ls = (ArrayList<Student>) ois.readObject();
////            fillDataTable();
//        } catch (FileNotFoundException e) {
//           e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (ois != null && fis != null) {
//                    ois.close();
//                    fis.close();
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//
//    private void writeFile() {
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//            fos = new FileOutputStream("E:\\dataexample.txt");
//            oos = new ObjectOutputStream(fos);
//            oos.writeObject(ls);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                oos.close();
//                fos.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
    
    public void saveFile() throws Exception {
        FileHelper.writeFile(path, ls);
    }
    
    public void LoadFormFile() throws Exception,
            ClassNotFoundException {
        File file = new File(path);

        if (!file.exists()) {
            initData();
        } else {
            ls = (ArrayList<Student>) FileHelper.readFile(path);
        }
    }
    
    public void initData() {
        ls.add(new Student("10", "Name", "Male", "29/09/2001", "NY", "No avatar"));
        ls.add(new Student("11", "VM", "Male", "29/09/2001", "AS", "No avatar"));
        ls.add(new Student("12", "AN", "Male", "29/09/2001", "Sw", "No avatar"));
        ls.add(new Student("13", "GG", "Male", "29/09/2001", "NY", "No avatar"));
        ls.add(new Student("14", "AA", "Male", "29/09/2001", "NY", "No avatar"));
        ls.add(new Student("15", "RR", "Male", "29/09/2001", "NY", "No avatar"));
        
    }
    
}

