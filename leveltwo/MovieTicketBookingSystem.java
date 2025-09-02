class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked; // to check if ticket is already booked

    // Constructor
    public MovieTicket() {
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        if (isBooked) {
            System.out.println("House full!!! sorry..... Ticket already booked");
        } else {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    // Method to display ticket details
    public void displayTicket() {
        if (!isBooked) {
            System.out.println("Ticket have not booked yet....");
        } else {
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }
}

// Main class to test
public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        // Display before booking
        ticket.displayTicket();

        // First booking attempt
        ticket.bookTicket("Dragon", "A10", 120.0);

        // Trying to book again (house full)
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.bookTicket("Dragon", "A10", 120.0);

        // Display after booking
        ticket.displayTicket();
    }
}
