import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate cost of this item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println(itemName + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + getTotalCost());
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cartItems = new ArrayList<>();

    // Add item to cart
    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + " x " + itemName + " added to cart.");
    }

    // Remove item from cart by name
    public void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).itemName.equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                System.out.println(itemName + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }

    // Display total cost of all items
    public void displayTotalCost() {
        double total = 0;
        System.out.println("\n--- Cart Details ---");
        for (CartItem item : cartItems) {
            item.displayItem();
            total += item.getTotalCost();
        }
        System.out.println("Total Cart Value: $" + total);
    }
}

public class ShoppingCartSimulation {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items
        cart.addItem("Laptop", 800.0, 1);
        cart.addItem("Headphones", 50.0, 2);
        cart.addItem("Book", 15.0, 3);

        // Display total cost
        cart.displayTotalCost();

        // Remove item
        cart.removeItem("Headphones");

        // Display after removal
        cart.displayTotalCost();
    }
}
