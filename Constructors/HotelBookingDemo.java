class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Unknown Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}

public class HotelBookingDemo {
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        b1.display();

        HotelBooking b2 = new HotelBooking("John Doe", "Deluxe", 3);
        b2.display();

        HotelBooking b3 = new HotelBooking(b2);
        b3.display();
    }
}
