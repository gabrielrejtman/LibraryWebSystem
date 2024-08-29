import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Employee extends User {
    private Role role;
    private float wage;
    private String password;
    private static List<Employee> employeeList = new ArrayList<>();


    public Employee(int id, String email, String name, Role role, float wage, String password) {
        super(id, email, name);
        this.role = role;
        this.wage = wage;
        this.password = password;
    }

    public String getPassword() {return password;}

    private String scan(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    private void registerBooks() {
        String title = scan("Enter the book title:");
        String author = scan("Enter the author's name:");
        String publisher = scan("Enter the publisher's name:");
        int releaseYear = Integer.parseInt(scan("Enter the release year:"));
        int numberPages = Integer.parseInt(scan("Enter the number of pages:"));
        String isbn = scan("Enter the ISBN:");
        String genre = scan("Enter the genre:");
        String synopsis = scan("Enter the synopsis:");
        String language = scan("Enter the language:");

        Book.registerBook(title, author, publisher, releaseYear, numberPages, isbn, genre, synopsis, language);
    }

    private void listBooks() {Book.listBooks();}

    private void registerRole() {
        int id = Integer.parseInt(scan("Role's ID:"));
        String name = scan("Role's name");
        String description = scan("Role's description:");
        float workload = Float.parseFloat(("Role's workload (in hours):"));
        Role.registerRole(id, name, description, workload);
    }

    private void listRoles() {Role.listRoles();}

    private void registerTeacher() {
        int id = Integer.parseInt(scan("Teacher's ID:"));
        String name = scan("Teacher's name");
        String email = scan("Teacher's email:");
        String password = ("Teacher's password:");
        String degree = ("Teacher's degree level(Ms, PhD, etc.):");
        Teacher.registerTeacher(id, email, name, degree, password);
    }

    private void listTeachers(){Teacher.listTeachers();}

    private void registerStudents() {
        int id = Integer.parseInt(scan("Student's ID:"));
        String name = scan("Student's name");
        String email = scan("Student's email:");
        String school = ("Student's school level(Ms, PhD, etc.):");
        String course = ("Student's course level(Ms, PhD, etc.):");
        float satScore = Float.parseFloat(scan("Student's satScore:"));
        Student.registerStudent(id, email, name, school, course, satScore);
    }

    public static void listEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("There are no employees registered in the system.");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee.getName() + "\n");
            }
        }
    }

    public boolean login(int id, String password) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id && employee.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
