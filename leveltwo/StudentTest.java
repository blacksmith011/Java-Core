class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-------------------------");
    }
}

public class StudentTest {
    public static void main(String[] args) {
        // Create student objects
        Student s1 = new Student("Aryan", 101, 92.5);
        Student s2 = new Student("Neha", 102, 76.0);
        Student s3 = new Student("Rahul", 103, 48.0);

        // Display details of each student
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
