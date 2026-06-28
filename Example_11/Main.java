package Example_11;

// Interface
// Loaded into: Method Area
interface Moveable {

    // Abstract Method
    // Implicitly public abstract
    void move(double x, double y);
}

// Interface Inheritance
interface Powered extends Moveable {

    // Abstract Method
    double milesPerGallon();

    // Interface Constant
    // Stored in: Static Area (public static final)
    double speedLimit = 95;
}

// Interface Implementation
class Car implements Powered {

    // Method Implementation
    @Override
    public double milesPerGallon() {
        return 13;
    }

    // Method Implementation
    @Override
    public void move(double x, double y) {
        System.err.println("The way from x to y = " + (x - y));
    }
}

// Main Class
public class Main {

    // Main Method
    // Stack Frame
    public static void main(String[] args) {

        // Object Creation
        // Stack: reference c
        // Heap: Car object
        Car c = new Car();

        // Method Call
        System.err.println(c.milesPerGallon());

        // Method Call
        c.move(10, 40);
    }
}