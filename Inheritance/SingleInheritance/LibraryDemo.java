// Superclass Book
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author (extends Book)
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call Book constructor
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // show book details
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Driver Class
public class LibraryDemo {
    public static void main(String[] args) {
        // Create multiple book-author objects
        Author a1 = new Author(
            "The Great Adventure",
            2021,
            "John Smith",
            "John Smith is a novelist specializing in adventure and fantasy."
        );

        Author a2 = new Author(
            "Science Wonders",
            2019,
            "Alice Johnson",
            "Alice Johnson is a science writer known for making complex topics simple."
        );

        Author a3 = new Author(
            "Mystery of the Night",
            2023,
            "Robert Brown",
            "Robert Brown writes suspense thrillers and mystery novels."
        );

        // Store them in an array (polymorphism in action)
        Book[] library = {a1, a2, a3};

        // Display info for all books in the library
        for (Book b : library) {
            b.displayInfo();
            System.out.println("-------------------");
        }
    }
}
