import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String input) {
        int num = Integer.parseInt(input); // may throw NumberFormatException
        System.out.println("Number: " + num);
    }

    public static void handleException(String input) {
        try {
            int num = Integer.parseInt(input);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (string input): ");
        String input = sc.nextLine();

        // Uncomment below to see abrupt termination
        // generateException(input);

        handleException(input);
    }
}
