// Circle.java
class Circle {
    // Attribute
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius; // πr²
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius; // 2πr
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
        System.out.println("------------------------------");
    }
}

// Main class
public class CircleTest {
    public static void main(String[] args) {
        // Creating objects
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(7.5);

        // Display details
        c1.displayDetails();
        c2.displayDetails();
    }
}
