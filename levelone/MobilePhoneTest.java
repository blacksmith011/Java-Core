class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("----------------------");
    }
}

public class MobilePhoneTest {
    public static void main(String[] args) {
        // Creating MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 79999.0);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 69999.0);
        MobilePhone phone3 = new MobilePhone("OnePlus", "12 Pro", 55999.0);

        // Displaying details of each phone
        phone1.displayDetails();
        phone2.displayDetails();
        phone3.displayDetails();
    }
}
