import java.util.Scanner;

public class NaturalNumberSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        long n = sc.nextLong();

        if (n >= 1) {
            long formulaSum = n * (n + 1) / 2;

            long loopSum = 0;
            for (long i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("Mismatch in results!");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

    }
}
