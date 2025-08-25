import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            int p, c, m;
            while (true) {
                System.out.print("Enter Physics marks of student " + (i + 1) + ": ");
                p = sc.nextInt();
                System.out.print("Enter Chemistry marks of student " + (i + 1) + ": ");
                c = sc.nextInt();
                System.out.print("Enter Maths marks of student " + (i + 1) + ": ");
                m = sc.nextInt();
                if (p >= 0 && c >= 0 && m >= 0) break;
                System.out.println("Invalid input! Marks must be positive.");
            }
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            percentage[i] = (p + c + m) / 3.0;
            grade[i] = getGrade(percentage[i]);
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                               " | Physics: " + physics[i] +
                               " | Chemistry: " + chemistry[i] +
                               " | Maths: " + maths[i] +
                               " | Percentage: " + String.format("%.2f", percentage[i]) +
                               " | Grade: " + grade[i]);
        }
    }

    static char getGrade(double percentage) {
        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R';
    }
}
