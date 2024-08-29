import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private String school;
    private String course;
    private float satScore;
    private static List<Student> studentList = new ArrayList<>();

    public Student(int id, String email, String name, String school, String course, float satScore) {
        super(id, email, name);
        this.school = school;
        this.course = course;
        this.satScore = satScore;
    }

    public static void registerStudent(int id, String email, String name, String school, String course, float satScore){
        Student student = new Student(id, email, name, school, course, satScore);
        studentList.add(student);
        System.out.println(student.getName() + " has been added to the system.");
    }

    public static void listStudents() {
        if (studentList.isEmpty()) {
            System.out.println("There are no students registered in the system.");
        }
        else {
            for (Student student : studentList) {
                System.out.println(student.getName() + "\n");
            }
        }
    }

    @Override
    public boolean login(int id, String password) {
        return false;
    }
}
