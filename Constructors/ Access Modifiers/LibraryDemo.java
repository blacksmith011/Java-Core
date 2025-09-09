class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends Book {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookDetails() {
        System.out.println("E-Book ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() + ", File Size: " + fileSizeMB + "MB");
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("978-0140449136", "The Odyssey", "Homer");
        b1.displayBookDetails();
        b1.setAuthor("Homer (Translated by Robert Fagles)");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook eb = new EBook("978-0261102385", "The Hobbit", "J.R.R. Tolkien", 5.2);
        eb.displayEBookDetails();
    }
}
