import model.Student;
import service.StudentService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setId(scanner.nextInt());
        student.setName(scanner.next());
        student.setAge(scanner.nextInt());
        StudentService studentService = new StudentService();
        studentService.print(student);

    }
}