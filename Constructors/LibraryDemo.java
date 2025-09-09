class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + available);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 499.99, true);
        b1.display();
        b1.borrowBook();
        b1.display();
        b1.borrowBook();
    }
}
