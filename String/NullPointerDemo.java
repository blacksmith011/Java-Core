public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
