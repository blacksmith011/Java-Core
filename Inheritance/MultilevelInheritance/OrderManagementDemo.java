// Base Class: Order
class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped with Tracking No: " + trackingNumber;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Driver Class
public class OrderManagementDemo {
    public static void main(String[] args) {
        // Creating objects of each type
        Order order = new Order("O101", "2025-09-01");
        ShippedOrder shipped = new ShippedOrder("O102", "2025-09-02", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("O103", "2025-09-03", "TRK67890", "2025-09-07");

        // Displaying details and status
        order.displayDetails();
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println("----------------------");

        shipped.displayDetails();
        System.out.println("Status: " + shipped.getOrderStatus());
        System.out.println("----------------------");

        delivered.displayDetails();
        System.out.println("Status: " + delivered.getOrderStatus());
    }
}
