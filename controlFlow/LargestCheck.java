import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long number1 = sc.nextLong();
        System.out.print("Enter second number: ");
        long number2 = sc.nextLong();
        System.out.print("Enter third number: ");
        long number3 = sc.nextLong();

        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));

    }
}
