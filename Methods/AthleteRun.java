import java.util.Scanner;

public class AthleteRun {
    // Method to calculate rounds
    public static int calculateRounds(int side1, int side2, int side3) {
        int perimeter = side1 + side2 + side3; // in meters
        int totalDistance = 5000; // 5 km = 5000 meters
        return totalDistance / perimeter; // integer rounds
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides of triangle
        System.out.print("Enter side1 (m): ");
        int side1 = sc.nextInt();
        System.out.print("Enter side2 (m): ");
        int side2 = sc.nextInt();
        System.out.print("Enter side3 (m): ");
        int side3 = sc.nextInt();

        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
    }
}
