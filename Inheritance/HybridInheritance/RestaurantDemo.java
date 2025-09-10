// Superclass: Person
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef (inherits Person, implements Worker)
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious " + specialty + " dishes.");
    }
}

// Subclass: Waiter (inherits Person, implements Worker)
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables.");
    }
}

// Driver Class
public class RestaurantDemo {
    public static void main(String[] args) {
        // Create objects
        Chef chef1 = new Chef("Gordon", 101, "Italian");
        Waiter waiter1 = new Waiter("Alice", 201, 5);

        // Display info and perform duties
        System.out.println("=== Chef ===");
        chef1.displayInfo();
        chef1.performDuties();
        System.out.println("-------------------");

        System.out.println("=== Waiter ===");
        waiter1.displayInfo();
        waiter1.performDuties();
    }
}
