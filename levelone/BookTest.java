class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------");
    }
}

// Main class
public class BookTest {
    public static void main(String[] args) {
        // Creating Book objects
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 399.0);
        Book b2 = new Book("Java Programming", "Herbert Schildt", 799.0);

        // Display details
        b1.displayDetails();
        b2.displayDetails();
    }
}
