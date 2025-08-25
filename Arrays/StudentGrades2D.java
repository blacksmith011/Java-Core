import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // 0 = physics, 1 = chemistry, 2 = maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter Physics, Chemistry, Maths marks for student " + (i + 1) + ": ");
                int p = sc.nextInt();
                int c = sc.nextInt();
                int m = sc.nextInt();
                if (p >= 0 && c >= 0 && m >= 0) {
                    marks[i][0] = p;
                    marks[i][1] = c;
                    marks[i][2] = m;
                    break;
                }
                System.out.println("Invalid input! Marks must be positive.");
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grade[i] = getGrade(percentage[i]);
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                               " | Physics: " + marks[i][0] +
                               " | Chemistry: " + marks[i][1] +
                               " | Maths: " + marks[i][2] +
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
