package Service;

import Model.Student;
import Model.StudentGroup;
import Model.Teacher;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {

    public StudentGroup createGroup(Teacher teacher, Student... students){
        List<Student> studentList = new ArrayList<>();
        for (Student student : students) {
            if (student instanceof Student)
                studentList.add(student);
        }
        return new StudentGroup(teacher, studentList);
    }


}
