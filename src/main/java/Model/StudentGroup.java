package Model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup{
    private Teacher teacher;
    private List<Student> studentList;

    public StudentGroup(Teacher teacher, List<Student> studentsList) {
        this.teacher = teacher;
        this.studentList = studentsList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public void setStudents(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return " teacher = " + teacher +
                ", students = " + studentList +
                '}';
    }
}
