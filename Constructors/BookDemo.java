class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayDetails();

        System.out.println();

        Book book2 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        book2.displayDetails();
    }
}
