import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // "PREVIOUS DATABASE EXAMPLE"
        List<Employee> employeeList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();

        Role admin = new Role(1, "admin", "Administrates the system", 9);
        Employee employee1 = new Employee(1, "john@gmail.com", "John Wayne", admin, 2500, "admin123");
        Teacher robert = new Teacher(1, "robert@gmail.com", "Robert DeNiro", "PhD", "password123");
        teacherList.add(robert);
        employeeList.add(employee1);
        // "PREVIOUS DATABASE EXAMPLE"

        String message = "Choose an option";
        String[] options = {"I'm a teacher", "I'm an employee", "I'm a student", };

        int choice = JOptionPane.showOptionDialog(null, message, "Choose an option", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                                  null, options, options[0]);


        switch (choice) {
            case 0:
                int id = Integer.parseInt(JOptionPane.showInputDialog("id"));
                String password  = JOptionPane.showInputDialog("senha");

                for (Teacher teacher : teacherList) {
                    if (teacher.getId() == id && teacher.getPassword().equals(password)) {
                    }
                   break;
                }


                break;

            case 1:
                break;

            case 2:
                break;
        }


    }
}
