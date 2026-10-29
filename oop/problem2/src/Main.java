import Service.ProcessServiceImp;
import model.Data;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data d = new Data();
        d.setNum1(sc.nextInt());
        d.setNum2(sc.nextInt());
        d.setNum3(sc.nextInt());
        ProcessServiceImp ps = new ProcessServiceImp();
        System.out.println(ps.sum(d));

    }
}