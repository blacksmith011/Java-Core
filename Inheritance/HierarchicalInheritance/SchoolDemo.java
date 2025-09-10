// Superclass: Person
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        displayInfo();
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        displayInfo();
        System.out.println("Department: " + department);
    }
}

// Driver Class
public class SchoolDemo {
    public static void main(String[] args) {
        // Create objects for each role
        Teacher t1 = new Teacher("Alice", 35, "Mathematics");
        Student s1 = new Student("Bob", 15, "10th Grade");
        Staff st1 = new Staff("Charlie", 40, "Administration");

        // Display details and roles
        System.out.println("=== Teacher ===");
        t1.displayRole();
        System.out.println("-------------------");

        System.out.println("=== Student ===");
        s1.displayRole();
        System.out.println("-------------------");

        System.out.println("=== Staff ===");
        st1.displayRole();
    }
}
