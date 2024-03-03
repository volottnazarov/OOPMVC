package Controller;

import Model.Student;
import Model.StudentGroup;
import Model.Teacher;
import Model.Type;
import Service.DataService;
import Service.StudentGroupService;
import View.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    public Student createStudent(String firstName, String secondName, String lastName){
         service.create(firstName, secondName, lastName, Type.STUDENT);
         return (Student) service.getStudents();
    }

    public void printStudent(){
        List<Student> studentList = service.getStudents();
        for (Student student : studentList) {
            view.printOnConsole(student);
        }
    }

    public StudentGroup createGroup(Teacher teacher, Student... students) {
        return studentGroupService.createGroup(teacher, students);
    }

}
