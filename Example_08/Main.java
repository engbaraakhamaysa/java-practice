package Example_08;

// Base Class (Superclass)
// Loaded into: Method Area
class Vehicle {

    // Instance Variables
    // Stored in: Heap (inside object)
    int vehicleId;
    int manufactureYear;

    // Constructor
    // Object creation: Stack reference → Heap object
    public Vehicle(int vehicleId, int manufactureYear) {
        this.vehicleId = vehicleId;
        this.manufactureYear = manufactureYear;
    }
}

// Single Inheritance
class TransportVehicle extends Vehicle {

    // Instance Variable
    // Stored in: Heap
    int loadCapacity;

    // Constructor Chaining (super())
    public TransportVehicle(int loadCapacity, int vehicleId, int manufactureYear) {
        super(vehicleId, manufactureYear);
        this.loadCapacity = loadCapacity;
    }
}

// Multilevel Inheritance
class Truck extends TransportVehicle {

    // Instance Variable
    // Stored in: Heap
    int numberOfContainers;

    // Constructor Chaining (super())
    public Truck(int numberOfContainers, int loadCapacity, int vehicleId, int manufactureYear) {
        super(loadCapacity, vehicleId, manufactureYear);
        this.numberOfContainers = numberOfContainers;
    }
}

// Hierarchical Inheritance
class PassengerVehicle extends Vehicle {

    // Instance Variable
    // Stored in: Heap
    int numberOfPassengers;

    // Constructor Chaining (super())
    public PassengerVehicle(int numberOfPassengers, int vehicleId, int manufactureYear) {
        super(vehicleId, manufactureYear);
        this.numberOfPassengers = numberOfPassengers;
    }
}

// Multilevel Inheritance
class Car extends PassengerVehicle {

    // Instance Variable
    // Stored in: Heap
    int numberOfDoors;

    // Constructor Chaining (super())
    public Car(int numberOfDoors, int numberOfPassengers, int vehicleId, int manufactureYear) {
        super(numberOfPassengers, vehicleId, manufactureYear);
        this.numberOfDoors = numberOfDoors;
    }
}

// Multilevel Inheritance
class Bike extends PassengerVehicle {

    // Instance Variable
    // Stored in: Heap
    int seatHeight;

    // Constructor Chaining (super())
    public Bike(int seatHeight, int numberOfPassengers, int vehicleId, int manufactureYear) {
        super(numberOfPassengers, vehicleId, manufactureYear);
        this.seatHeight = seatHeight;
    }
}

// Main Class
public class Main {

    // Static Method
    // Code: Method Area | Execution: Stack
    static int countBikes(Vehicle[] arr) {

        // Local Variable
        // Stored in: Stack
        int count = 0;

        // Array Traversal
        for (int i = 0; i < arr.length; i++) {

            // instanceof Operator
            if (arr[i] instanceof Bike) {
                count++;
            }
        }

        // Return Statement
        return count;
    }

    // Main Method
    // Stack Frame
    public static void main(String[] args) {

        // Array of References
        // Heap: array object | Stack: reference vehicles
        Vehicle[] vehicles = new Vehicle[5];

        // Upcasting
        // Stack: Vehicle reference
        // Heap: Bike object
        vehicles[0] = new Bike(5, 2, 5, 2);

        // Upcasting
        // Heap: Car object
        vehicles[1] = new Car(5, 2, 5, 2);

        // Upcasting
        // Heap: Truck object
        vehicles[2] = new Truck(5, 2, 5, 2);

        // Object Creation
        // Heap: Vehicle object
        vehicles[3] = new Vehicle(3, 4);

        // Upcasting
        // Heap: Bike object
        vehicles[4] = new Bike(5, 2, 5, 2);

        // Method Call
        System.out.println("Number of bikes = " + countBikes(vehicles));
    }
}