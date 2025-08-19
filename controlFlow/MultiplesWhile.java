import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 1;

            System.out.println("Multiples of " + number + " below 100 are:");
            while (counter * number < 100) {
                System.out.print((counter * number) + " ");
                counter++;
            }
        } else {
            System.out.println("Invalid input! Number must be between 1 and 99.");
        }

        sc.close();
    }
}
