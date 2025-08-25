import java.util.Scanner;

public class UpperCaseDemo {
    public static String toUpperCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // ASCII shift
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manualUpper = toUpperCaseManual(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);

        System.out.println("Are they same? " + compareStrings(manualUpper, builtInUpper));
    }
}
