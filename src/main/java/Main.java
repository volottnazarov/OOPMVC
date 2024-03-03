import Controller.Controller;
import Model.Student;
import Model.StudentGroup;
import Model.Teacher;
import Service.StudentGroupService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Teacher teacher1 = new Teacher("Энштейн", "A", "D", 1);
        Teacher teacher2 = new Teacher("Ньютон", "K", "P", 2);

        Student student1 = new Student("BBB", "tRR", "qdd", 1);
        Student student2 = new Student("BBB", "tRR", "qdd", 2);
        Student student3 = new Student("AAs", "Yuu", "Poo", 3);
        Student student4 = new Student("BBB", "tRR", "qdd", 4);

        StudentGroup group1 = controller.createGroup(teacher1, student1, student2);
        StudentGroup group2 = controller.createGroup(teacher2, student3, student4);
        System.out.println("Математики: " + group1);
        System.out.println("Физики: = " + group2);

    }
}
