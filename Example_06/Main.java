package Example_06;

// Class
// Stored in: Method Area (Class Area / MetaSpace)
public class Main {

    // Constructor
    // Constructor Chaining using this()
    Main() {
        System.out.println("how are yoe");
    }

    // Constructor Overloading
    // Constructor Chaining using this()
    Main(String s) {
        this(); // Calls another constructor
        System.out.println(s);
    }

    // Constructor Overloading
    // Constructor Chaining using this()
    Main(String name, double salary) {
        this(name); // Calls another constructor
        System.out.println(name + " " + salary);
    }

    // Main Method
    // Stack Frame (program entry point)
    public static void main(String[] args) {

        // Object Creation
        // Stack → reference e
        // Heap → Main object
        Main e = new Main("baraa", 4000);

        // Output
        // Prints object's reference representation
        System.out.println(e);
    }
}