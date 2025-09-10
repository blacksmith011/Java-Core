// Superclass Device
class Device {
    String deviceId;
    String status; // e.g., "ON" or "OFF"

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass Thermostat
class Thermostat extends Device {
    double temperatureSetting; // in °C

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // call Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus(); // show general device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Driver Class
public class SmartHomeDemo {
    public static void main(String[] args) {
        // Create a Thermostat device
        Thermostat t1 = new Thermostat("TH-101", "ON", 24.5);
        Thermostat t2 = new Thermostat("TH-102", "OFF", 22.0);

        // Store them in an array of Devices (polymorphism in action)
        Device[] devices = {t1, t2};

        // Display status of all devices
        for (Device d : devices) {
            d.displayStatus();
            System.out.println("-------------------");
        }
    }
}
