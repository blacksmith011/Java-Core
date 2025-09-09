class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: $" + calculateTotalCost());
    }
}

public class CarRentalDemo {
    public static void main(String[] args) {
        CarRental r1 = new CarRental("Alice", "Toyota Innova", 5, 1200);
        r1.display();

        CarRental r2 = new CarRental("Bob", "Hyundai i20", 3, 800);
        r2.display();
    }
}
