class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemTest {
    public static void main(String[] args) {
        // Creating Item objects
        Item i1 = new Item(101, "Laptop", 55000.0);
        Item i2 = new Item(102, "Headphones", 2000.0);

        // Display details and total cost
        i1.displayDetails();
        System.out.println("Total cost for 2 units: ₹" + i1.calculateTotalCost(2));
        System.out.println("---------------------------");

        i2.displayDetails();
        System.out.println("Total cost for 3 units: ₹" + i2.calculateTotalCost(3));
    }
}
