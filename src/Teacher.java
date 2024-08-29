import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private String degree;
    private String password;
    private static List<Teacher> teacherList = new ArrayList<>();

    public Teacher(int id, String email, String name, String degree, String password) {
        super(id, email, name);
        this.degree = degree;
        this.password = password;
    }

    public String getPassword() {return password;}

    public static void registerTeacher(int id, String email, String name, String degree, String password) {
        Teacher teacher = new Teacher(id, email, name, degree, password);
        teacherList.add(teacher);
        System.out.println(teacher.getName() + " has been added to the system.");
    }

    public static void listTeachers() {
        if (teacherList.isEmpty()) {
            System.out.println("There are no teachers registered in the system.");
        } else {
            for (Teacher teacher : teacherList) {
                System.out.println(teacher.getName() + "\n");
            }
        }
    }

    private void listBooks() {
        Book.listBooks();
    }

    @Override
    public boolean login(int id, String password) {
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == id && teacher.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
