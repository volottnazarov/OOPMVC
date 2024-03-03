package Model;

public class Teacher extends User {
    private Integer teacherId;

    public Teacher(String firstName, String secondName, String lastName, Integer teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "teacherId = " + teacherId +
                super.toString() ;
    }
}
