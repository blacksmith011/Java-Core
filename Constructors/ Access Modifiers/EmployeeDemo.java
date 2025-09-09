class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated to: $" + salary);
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Team: " + teamName + ", Salary: $" + getSalary());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "Finance", 40000);
        e1.displayEmployeeDetails();
        e1.updateSalary(45000);

        Manager m1 = new Manager(2001, "IT", 80000, "Development Team");
        m1.displayManagerDetails();
    }
}
