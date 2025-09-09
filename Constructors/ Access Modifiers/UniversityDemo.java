class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("PG Student: " + name + " (Roll No: " + rollNumber + "), Specialization: " + specialization + ", CGPA: " + getCgpa());
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aryan Yadav", 8.5);
        s1.display();
        s1.setCgpa(9.0);
        System.out.println("Updated CGPA: " + s1.getCgpa());

        PostgraduateStudent pg = new PostgraduateStudent(201, "Rahul Verma", 9.2, "Data Science");
        pg.displayPostgraduateDetails();
    }
}
