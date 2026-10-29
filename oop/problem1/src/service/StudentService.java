package service;

import jdk.swing.interop.SwingInterOpUtils;
import model.Student;

public class StudentService {
    public void print(Student student){
        System.out.println(student.getId() + " - " +student.getName() + " - " + student.getAge());
    }
}
