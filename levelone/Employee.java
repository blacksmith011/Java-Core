class Employee {
    // Attributes (data members)
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("---------------------------");
    }
}

// Main class to test Employee
public class EmployeeTest {
    public static void main(String[] args) {
        // Creating objects
        Employee e1 = new Employee("Aryan", 101, 50000.0);
        Employee e2 = new Employee("Rahul", 102, 60000.0);

        // Display details
        e1.displayDetails();
        e2.displayDetails();
    }
}
