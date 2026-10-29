import Service.PlayerService;
import Service.PlayerServiceImp;
import Service.StudentService;
import Service.StudentServiceImp;
import model.Player;
import model.Student;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        player.setId(scanner.nextInt());
        player.setName(scanner.next());
        player.setNumber(scanner.nextInt());
        Student student = new Student();
        student.setId(scanner.nextInt());
        student.setName(scanner.next());
        student.setAge(scanner.nextInt());

        PlayerService playerServiceImpl = new PlayerServiceImp();
        playerServiceImpl.print(player);

        StudentService studentServiceImpl = new StudentServiceImp();
        studentServiceImpl.print(student);
    }
}