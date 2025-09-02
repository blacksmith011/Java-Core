public class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the string is palindrome
    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        // Compare characters from start and end
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }

    // Method to display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create objects
        PalindromeChecker p1 = new PalindromeChecker("madam");
        PalindromeChecker p2 = new PalindromeChecker("hello");

        // Display results
        p1.displayResult();
        p2.displayResult();
    }
}
