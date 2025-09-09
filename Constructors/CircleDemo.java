class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();

        Circle c2 = new Circle(5.5);
        c2.display();
    }
}
