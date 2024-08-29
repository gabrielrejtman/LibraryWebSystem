import java.util.ArrayList;
import java.util.List;

public class Role {
    private int id;
    private String name;
    private String description;
    private float workload;
    private static List<Role> roleList = new ArrayList<>();

    public Role(int id, String name, String description, float workload) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.workload = workload;
    }

    public String getName() {return name;}

    public static void registerRole(int id, String name, String description, float workload ){
            Role role = new Role(id, name, description, workload);
            roleList.add(role);
            System.out.println(role.getName() + " has been registered.");
        }

    public static void listRoles() {
            if (roleList.isEmpty()) {
                System.out.println("There are no roles registered in the system.");
            }
            else {
                for (Role role : roleList) {
                    System.out.println(role.getName() + "\n");
                }
            }
        }
    }
