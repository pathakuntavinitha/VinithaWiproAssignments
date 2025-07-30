package assignment;
import java.util.Optional;
@SuppressWarnings("serial")
class MissingFieldException extends RuntimeException {
    public MissingFieldException(String message) {
        super(message);
    }
}
class Employee {
    private String name;
    private int id;
    private Optional<String> email;
    private Optional<String> department;

    public Employee(String name, int id, Optional<String> email, Optional<String> department) {
        if (name == null || name.isEmpty()) {
            throw new MissingFieldException("Name is required");
        }
        this.name = name;
        this.id = id;
        this.email = email != null ? email : Optional.empty();
        this.department = department != null ? department : Optional.empty();
    }

    public String getEmailOrDefault() {
        return email.orElse("Email not provided");
    }

    public String getDepartmentOrDefault() {
        return department.orElse("General");
    }

    public String getEmailOrThrow() {
        return email.orElseThrow(() -> new MissingFieldException("Email is required for this operation"));
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + getEmailOrDefault());
        System.out.println("Department: " + getDepartmentOrDefault());
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 101, Optional.of("alice@example.com"), Optional.of("HR"));
        Employee e2 = new Employee("Bob", 102, Optional.empty(), Optional.empty());
        Employee e3 = new Employee("Charlie", 103, null, Optional.of("Finance")); // null handled

        System.out.println("Employee 1");
        e1.displayDetails();

        System.out.println("Employee 2");
        e2.displayDetails();

        System.out.println("Employee 3");
        e3.displayDetails();

        System.out.println("Testing Required Email for e2");
        try {
            String email = e2.getEmailOrThrow();
            System.out.println("Email: " + email);
        } catch (MissingFieldException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
