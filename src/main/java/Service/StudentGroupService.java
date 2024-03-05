package Service;

import Model.Student;
import Model.StudentGroup;
import Model.Teacher;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createGroup(Teacher teacher, List<Student> students){
        this.studentGroup = new StudentGroup(teacher, students);

    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    @Override
    public String toString() {
        return "StudentGroupService{" +
                "studentGroup = " + studentGroup +
                '}';
    }
}
