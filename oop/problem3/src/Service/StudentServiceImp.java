package Service;

import model.Student;
import validate.ValidationService;

public class StudentServiceImp implements StudentService {

    @Override
    public void print(Student student) {
        ValidationService validationService = new ValidationService();
        if(validationService.validateStudent(student)){
            System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
        }
        else {
            System.out.println("invalid data");
        }
    }
}
