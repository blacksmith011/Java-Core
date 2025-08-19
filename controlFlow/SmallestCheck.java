import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long number1 = sc.nextLong();
        System.out.print("Enter second number: ");
        long number2 = sc.nextLong();
        System.out.print("Enter third number: ");
        long number3 = sc.nextLong();

        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }

    }
}
