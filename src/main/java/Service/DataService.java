package Service;

import Model.Student;
import Model.Teacher;
import Model.Type;
import Model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Locale.filter;

public class DataService {
    private List<User> userList = new ArrayList<>();
    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getFreeId(type);
        if(type == Type.STUDENT){
            userList.add(new Student(firstName, secondName, lastName, id));
        } else if(type == Type.TEACHER){
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }

    }
    private int getFreeId(Type type){
        boolean isStudent = type == Type.STUDENT; // isStudent -> false -> Type.TEACHER
        int lastId = 1;
        for (User user : userList) {
            if(user instanceof Student && isStudent)
                lastId = ((Student) user).getStudentId() + 1;
            else if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastId;
    }

    public List<User> getUsers() {   // метод read
        return userList;
    }
    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                studentList.add((Student) user);
            }
        }
        return studentList;
    }


}
