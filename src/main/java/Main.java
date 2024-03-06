import Controller.Controller;
import Model.Student;
import Model.StudentGroup;
import Model.Teacher;
import Service.StudentGroupService;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        studentList1.add(student1);
        studentList1.add(student2);
        studentList2.add(student3);
        studentList2.add(student4);

        StudentGroup studentGroup1 = new StudentGroup(teacher1, studentList1);
        StudentGroup studentGroup2 = new StudentGroup(teacher2, studentList2);

        controller.createGroup(studentGroup1);
        controller.printGroup(studentGroup1);
        controller.createGroup(studentGroup2);
        controller.printGroup(studentGroup2);


    }
}
