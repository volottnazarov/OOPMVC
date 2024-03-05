package Model;

public class Student extends User {
    private Integer studentId;

    public Student(String firstName, String secondName, String lastName, Integer studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public Integer getStudentId() {

        return studentId;
    }

    @Override
    public String toString() {
        return " studentId = " + studentId +
                super.toString();
    }

}
